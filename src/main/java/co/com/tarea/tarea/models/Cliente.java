package co.com.tarea.tarea.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Table("cliente")
public class Cliente {

    @Id
    private int id;

    @Column("CEDULA")
    private String cedula;

    @Column("NOMBRE")
    private String nombre;

    @Column("DIRECCION")
    private String direccion;

    @Column("TELEFONO")
    private String telefono;

}

