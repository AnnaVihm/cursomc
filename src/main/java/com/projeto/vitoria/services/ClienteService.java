package com.projeto.vitoria.services;

import com.projeto.vitoria.domain.Cliente;
import com.projeto.vitoria.repositorys.CategoriaRepository;
import com.projeto.vitoria.repositorys.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired //mecanismo de injeção de dependencias
    private ClienteRepository clienteRepository;

    public Cliente buscar(Integer id) {
        Optional<Cliente> cliente= clienteRepository.findById(id);
        return cliente.orElse(null);
    }
}
