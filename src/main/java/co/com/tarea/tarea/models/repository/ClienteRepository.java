package co.com.tarea.tarea.models.repository;


import co.com.tarea.tarea.models.Cliente;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends ReactiveCrudRepository<Cliente, Integer> {
}
