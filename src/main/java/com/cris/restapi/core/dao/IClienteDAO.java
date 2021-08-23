package com.cris.restapi.core.dao;

import com.cris.restapi.core.entity.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteDAO extends CrudRepository<Cliente, Long> {
    Cliente findByIdentificacion(String identificacion);
}
