package com.projeto.vitoria.resources;

import com.projeto.vitoria.domain.Categoria;
import com.projeto.vitoria.domain.Cliente;
import com.projeto.vitoria.services.CategoriaService;
import com.projeto.vitoria.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/clientes")
public class ClienteResource {

    @Autowired
    private ClienteService clienteService;

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public ResponseEntity<Cliente> buscar(@PathVariable Integer id){
        Cliente cliente = clienteService.buscar(id);
        return ResponseEntity.ok(cliente);
    }
}
