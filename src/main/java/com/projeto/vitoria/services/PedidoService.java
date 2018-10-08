package com.projeto.vitoria.services;

import java.util.Optional;

import com.projeto.vitoria.domain.Pedido;
import com.projeto.vitoria.repositorys.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido buscar(Integer id) {
        Optional<Pedido> cliente= pedidoRepository.findById(id);
        return cliente.orElse(null);
    }

}