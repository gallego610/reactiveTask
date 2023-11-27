package co.com.tarea.tarea.controller;

import co.com.tarea.tarea.models.Producto;
import co.com.tarea.tarea.service.ProductoService;
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
@RequestMapping("/producto")
@RequiredArgsConstructor
public class ProductoController {


    private final ProductoService productoService;

    @GetMapping
    public Flux<Producto> obtenerTodosLosProductos() {
        return productoService.obtenerTodosLosProductos();
    }

    @PostMapping
    public Mono<Producto> guardarProducto(@RequestBody Producto producto) {
        return productoService.guardarProducto(producto);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> eliminarProducto(@PathVariable Integer id) {
        return productoService.eliminarProducto(id);
    }

    @GetMapping("/categoria/{id}")
    public Mono<String> obtenerProductoPorId(@PathVariable Integer id) {
        return productoService.obtenerProductoPorId(id)
                .flatMap(x-> Mono.just("Categoria del producto ".concat(id.toString()).concat(": ")
                        .concat(x.categoria())))
                .switchIfEmpty(Mono.just("No existe el producto"));
    }

}
