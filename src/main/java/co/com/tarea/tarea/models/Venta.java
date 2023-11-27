package co.com.tarea.tarea.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Getter
@Setter
@Table("venta")
public class Venta {

    @Id
    private int id;

    @Column("cliente_id")
    private Integer clienteId;

    private String estado;

    @Column("costoTotal")
    private double costoTotal;

    @Column("created_at")
    private LocalDateTime createdAt;

}
