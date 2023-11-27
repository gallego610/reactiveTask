package co.com.tarea.tarea.service;


import co.com.tarea.tarea.models.Cliente;
import co.com.tarea.tarea.models.repository.ClienteRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Flux<Cliente> obtenerTodosLosClientes(){
        return clienteRepository.findAll();
    }

    public Mono<Cliente> obtenerClientePorId(int id){
        return clienteRepository.findById(id);
    }

    public Mono<Cliente> guardarCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public Mono<Void> eliminarCliente(Integer id){
        return clienteRepository.deleteById(id);
    }



}
