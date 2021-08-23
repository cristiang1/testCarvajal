package com.cris.restapi.core.service;

import com.cris.restapi.core.entity.Cliente;
import com.cris.restapi.core.entity.Tarjeta;

import java.util.List;

public interface ITarjetaService {
    public List<Tarjeta> getTarjetaByCliente(Cliente cliente);

    public void eliminar(Long id);

    public Tarjeta guardar(Tarjeta tarjeta);


}
