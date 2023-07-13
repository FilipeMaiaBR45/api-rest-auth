package com.example.apirest.service;


import com.example.apirest.model.Pedido;
import com.example.apirest.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository repository;

    public Pedido save(Pedido pedido){
        return repository.save(pedido);
    }

    public Pedido findById(Long id){
        return repository.findById(id).orElse(null);
    }

    public List<Pedido> findAll(){
        return repository.findAll();
    }
}
