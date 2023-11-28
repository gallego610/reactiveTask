package co.com.tarea.tarea.controller;

import co.com.tarea.tarea.models.Producto;
import co.com.tarea.tarea.service.ProductoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Flux;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class ProductoControllerTest {


    @InjectMocks
    private ProductoService productoService;

    @BeforeEach
    public void setUp() {
        productoService = Mockito.mock(ProductoService.class);

    }

    @Test
    void testObtenerTodosLosProductosWhenCalledThenReturnAllProducts() {

        Producto producto1 = new Producto();
        producto1.setId(1);
        producto1.setNombre("Producto 1");
        producto1.setCodigoProducto("P1");
        producto1.setCosto(100.0);
        producto1.setCategoria("Categoria 1");

        Producto producto2 = new Producto();
        producto2.setId(2);
        producto2.setNombre("Producto 2");
        producto2.setCodigoProducto("P2");
        producto2.setCosto(200.0);
        producto2.setCategoria("Categoria 2");

        Flux<Producto> dat = Flux.just(producto1, producto2);
        when(productoService.obtenerTodosLosProductos()).thenReturn(dat);

        Flux<Producto> res = productoService.obtenerTodosLosProductos();
        res.subscribe();
        assertEquals(res, dat);

    }


}