package co.com.tarea.tarea.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
