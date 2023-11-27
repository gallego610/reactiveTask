package co.com.tarea.tarea.service;

import co.com.tarea.tarea.models.Producto;
import co.com.tarea.tarea.models.repository.ProductoRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductoService {
    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public Flux<Producto> obtenerTodosLosProductos() {
        return productoRepository.findAll();
    }

    public Mono<Producto> obtenerProductoPorId(int id) {
        return productoRepository.findById(id);
    }

    public Mono<Producto> guardarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    public Mono<Void> eliminarProducto(Integer id) {
        return productoRepository.deleteById(id);
    }
}

