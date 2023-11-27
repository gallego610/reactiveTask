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
@RequestMapping("/general")
@RequiredArgsConstructor
public class GeneralController {



    @GetMapping("/health")
    public Mono<String> healing() {
        return Mono.just("Ok!");
    }

}
