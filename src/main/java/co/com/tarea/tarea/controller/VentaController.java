package co.com.tarea.tarea.controller;

import co.com.tarea.tarea.models.Venta;
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
@RequestMapping("/venta")
@RequiredArgsConstructor
public class VentaController {

    private final VentaService ventaService;

    @GetMapping
    public Flux<Venta> obtenerVentas() {
        return ventaService.obtenerTodasLasVentas();
    }

    @PostMapping
    public Mono<Venta> crearVenta(@RequestBody Venta venta) {
        return ventaService.guardarVenta(venta);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> eliminarVentas(@PathVariable Integer id) {
        return ventaService.eliminarVenta(id);
    }
}
