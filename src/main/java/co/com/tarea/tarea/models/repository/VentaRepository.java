package co.com.tarea.tarea.models.repository;


import co.com.tarea.tarea.models.Venta;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface VentaRepository extends ReactiveCrudRepository<Venta, Integer> {
}
