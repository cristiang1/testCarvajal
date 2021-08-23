package com.cris.restapi.core.dao;

import com.cris.restapi.core.entity.Cliente;
import com.cris.restapi.core.entity.Tarjeta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITarjetaDAO extends CrudRepository<Tarjeta, Long> {

    public List<Tarjeta> findByCliente(Cliente cliente);
}
