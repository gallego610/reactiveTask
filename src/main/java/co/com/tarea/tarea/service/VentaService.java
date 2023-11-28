package co.com.tarea.tarea.service;


import co.com.tarea.tarea.models.Venta;
import co.com.tarea.tarea.models.repository.VentaRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class VentaService {

    private final VentaRepository ventaRepository;

    public VentaService(VentaRepository ventaRepository) {
        this.ventaRepository = ventaRepository;
    }

    //obtener todas las ventas
    public Flux<Venta> obtenerTodasLasVentas() {
        return ventaRepository.findAll();
    }

    //obtener venta por id
    public Mono<Venta> obtenerVentaPorId(int id) {
        return ventaRepository.findById(id);
    }

    //guardar venta
    public Mono<Venta> guardarVenta(Venta venta) {
        return ventaRepository.save(venta);
    }

    //eliminar venta
    public Mono<Void> eliminarVenta(Integer id) {
        return ventaRepository.deleteById(id);
    }

}
