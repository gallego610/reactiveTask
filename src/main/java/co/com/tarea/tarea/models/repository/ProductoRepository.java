package co.com.tarea.tarea.models.repository;


import co.com.tarea.tarea.models.Producto;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends ReactiveCrudRepository<Producto, Integer> {
}
