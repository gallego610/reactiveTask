package co.com.tarea.tarea.models;

import co.com.tarea.tarea.models.ext.MyException;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Table("detalleVenta")
public class DetalleVenta extends MyException {

    @Id
    private int id;

    @Column("venta_id")
    private int ventaId;

    @Column("producto_id")
    private int productoId;

    private int cantidad;

    @Column("valorVenta")
    private double valorVenta;



}

