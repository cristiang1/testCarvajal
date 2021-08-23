package com.cris.restapi.core.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Entity
@Data
@Table(name = "CLIENTE")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_CLIENTE")
    private Long id_cliente;

    @NotEmpty(message = "El campo nombre no puede estar vacio")
    @Column(name = "NOMBRE")
    private String nombre;

    @NotEmpty(message = "El campo apellido no puede estar vacio")
    @Column(name = "APELLIDO")
    private String apellido;

    @Column(name="IDENTIFICACION")
    private String identificacion;

    @NotEmpty(message = "El campo telefono no puede estar vacio")
    @Column(name = "TELEFONO")
    private String telefono;

    @NotEmpty(message = "El campo direccion no puede estar vacio")
    @Column(name = "DIRECCION")
    private String direccion;
}
