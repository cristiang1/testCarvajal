package com.cris.restapi.core.service;

import com.cris.restapi.core.dao.IClienteDAO;
import com.cris.restapi.core.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ClienteServiceImpl implements IClienteService {

    @Autowired
    private IClienteDAO clienteDAO;

    @Override
    @Transactional(readOnly = true)
    public Cliente getClienteByIdentificacion(String identificacion){
        return clienteDAO.findByIdentificacion(identificacion);
    }
}
