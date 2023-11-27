package co.com.tarea.tarea.controller;

import co.com.tarea.tarea.models.DetalleVenta;
import co.com.tarea.tarea.service.DetalleVentaService;
import co.com.tarea.tarea.service.ProductoService;
import co.com.tarea.tarea.service.VentaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/detalleVenta")
@RequiredArgsConstructor
public class DetalleVentaController {

    private final DetalleVentaService detalleVentaService;

    private final ProductoService productoService;

    private final VentaService ventaService;

    @GetMapping
    public Flux<DetalleVenta> obtenerDetalleVenta() {
        return detalleVentaService.obtenerTodosLosDetalleVenta();
    }

    @GetMapping("/{id}")
    public Flux<DetalleVenta> obtenerDetalleVentaPorId(@PathVariable Integer id) {
        return detalleVentaService.findByIdVenta(id);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> eliminarDetalleVenta(@PathVariable Integer id) {
        return detalleVentaService.delete(id);
    }

    @PostMapping
    public Mono<DetalleVenta> guardarDetalleVenta(@RequestBody DetalleVenta detalleVenta) {
        return detalleVentaService.save(detalleVenta)
                .onErrorResume(e -> {
                    DetalleVenta det = new DetalleVenta();
                    det.setCodigo("500");
                    Mono<String> prd = productoService.obtenerProductoPorId(detalleVenta.getProductoId())
                            .flatMap(r -> Mono.just(r.getId()+""))
                            .switchIfEmpty(Mono.just("")
                            );

                    Mono<String> vnt = ventaService.obtenerVentaPorId(detalleVenta.getVentaId())
                            .flatMap(r -> Mono.just(r.getId()+""))
                            .switchIfEmpty(Mono.just("")
                            );


                    return Mono.zip(prd, vnt)
                            .flatMap(t -> {
                                String descripcion = "";
                                if (t.getT1().isEmpty() && t.getT2().isEmpty()) {
                                    descripcion = "No existe el producto ni la venta";
                                } else if (t.getT1().isEmpty()) {
                                    descripcion = "No existe el producto";
                                } else if (t.getT2().isEmpty()) {
                                    descripcion = "No existe la venta";
                                }
                                det.setDescripcion(descripcion);
                                return Mono.just(det);
                            })
                            ;
                });
    }
}
