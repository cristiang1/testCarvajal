package com.cris.restapi.core.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;


@Data
@Entity
@Table(name = "TARJETA")
public class Tarjeta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TARJETA")
    private Long id_tarjeta;

    @NotEmpty(message = "El campo numero_tarjeta, no puede estar vacio")
    @Column(name="NUMERO_TARJETA")
    private String numero_tarjeta;

    @NotEmpty(message = "El campo fecha_expiracion, no puede estar vacio")
    @Column(name = "FECHA_EXP")
    private String fecha_exp;

    @NotEmpty(message = "El codigo CVV, no puede estar vacio")
    @Column(name="SECURITY_CODE")
    private String security_code;

    @NotNull(message = "La region no debe ser nula")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="ID_CLIENTE")
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    private Cliente cliente;
}
