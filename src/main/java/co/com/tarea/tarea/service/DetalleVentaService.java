package co.com.tarea.tarea.service;


import co.com.tarea.tarea.models.DetalleVenta;
import co.com.tarea.tarea.models.repository.DetalleVentaRepository;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class DetalleVentaService {

    private final DetalleVentaRepository detalleVentaRepository;

    public DetalleVentaService(DetalleVentaRepository detalleVentaRepository) {
        this.detalleVentaRepository = detalleVentaRepository;
    }

    // consultar todos los DetalleVenta
    public Flux<DetalleVenta> obtenerTodosLosDetalleVenta() {
        return detalleVentaRepository.findAll();
    }



    // consultar una DetalleVenta por id
    public Mono<DetalleVenta> findById(int id) {
        return detalleVentaRepository.findById(id);
    }

    // guardar una DetalleVenta
    public Mono<DetalleVenta> save(DetalleVenta detalleVenta) {
        return detalleVentaRepository.save(detalleVenta);
    }

    // eliminar una DetalleVenta
    public Mono<Void> delete(DetalleVenta detalleVenta) {
        return detalleVentaRepository.delete(detalleVenta);
    }

    //consultar DetalleVenta por id de venta
    public Flux<DetalleVenta> findByIdVenta(int idVenta) {
        return detalleVentaRepository.findByVentaId(idVenta);
    }

}
