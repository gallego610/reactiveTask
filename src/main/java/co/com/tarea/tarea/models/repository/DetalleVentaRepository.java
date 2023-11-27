package co.com.tarea.tarea.models.repository;


import co.com.tarea.tarea.models.DetalleVenta;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface DetalleVentaRepository extends ReactiveCrudRepository<DetalleVenta, Integer> {
    Flux<DetalleVenta> findByVentaId(Integer ventaId);
}
