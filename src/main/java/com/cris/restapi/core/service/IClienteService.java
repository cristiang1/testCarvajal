package com.cris.restapi.core.service;

import com.cris.restapi.core.entity.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IClienteService {

    public Cliente getClienteByIdentificacion(String identificacion);
}
