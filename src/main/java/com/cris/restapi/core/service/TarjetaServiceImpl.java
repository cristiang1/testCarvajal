package com.cris.restapi.core.service;

import com.cris.restapi.core.dao.ITarjetaDAO;
import com.cris.restapi.core.entity.Cliente;
import com.cris.restapi.core.entity.Tarjeta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TarjetaServiceImpl implements ITarjetaService{

    @Autowired
    private ITarjetaDAO tarjetaDAO;

    @Transactional(readOnly = true)
    public List<Tarjeta> getTarjetaByCliente(Cliente cliente){
        return tarjetaDAO.findByCliente(cliente);
    }

    @Override
    @Transactional
    public Tarjeta guardar(Tarjeta tarjeta) {
        tarjetaDAO.save(tarjeta);
        return tarjeta;
    }

    @Override
    @Transactional
    public void eliminar(Long id) {
        tarjetaDAO.deleteById(id);
    }
}
