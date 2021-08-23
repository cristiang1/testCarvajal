package com.cris.restapi.core.controller;

import com.cris.restapi.core.entity.Tarjeta;
import com.cris.restapi.core.service.IClienteService;
import com.cris.restapi.core.service.ITarjetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods={RequestMethod.GET, RequestMethod.POST})
public class Controller {

    @Autowired
    private ITarjetaService tarjetaService;

    @Autowired
    private IClienteService clienteService;

    @GetMapping("/tarjeta/{identificacion}")
    public List<Tarjeta> tarjetas(@PathVariable(value="identificacion") String identifacion){
        return tarjetaService.getTarjetaByCliente(clienteService.getClienteByIdentificacion(identifacion));
    }

    @PostMapping(path = "/tarjeta/guardar/{id}",
                consumes = MediaType.APPLICATION_JSON_VALUE,
                produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Tarjeta> guardar(@PathVariable("id") String id, @RequestBody Tarjeta tarjeta){
        tarjeta.setCliente(clienteService.getClienteByIdentificacion(id));
        tarjetaService.guardar(tarjeta);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/tarjeta/editar/{id}")
    public ResponseEntity<Tarjeta> editar(Tarjeta tarjeta){
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


    @DeleteMapping("tarjeta/eliminar{id}")
    public ResponseEntity<Tarjeta> eliminar(@PathVariable("id") Long id){
        tarjetaService.eliminar(id);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
