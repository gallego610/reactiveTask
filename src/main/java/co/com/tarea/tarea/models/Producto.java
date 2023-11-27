package co.com.tarea.tarea.models;

import co.com.tarea.tarea.models.ext.IProductos;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Table("PRODUCTO")
public class Producto implements IProductos {

    @Id
    private int id;

    @Column("NOMBRE")
    private String nombre;

    @Column("COD_PRODUCTO")
    private String codigoProducto;

    @Column("COSTO")
    private double costo;

    @Column("CATEGORIA")
    private String categoria;

    @Override
    public String categoria() {
        return categoria;
    }
}

