package com.example.apirest.controller;

import com.example.apirest.model.Pedido;
import com.example.apirest.model.Produto;
import com.example.apirest.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "pedido")
public class PedidoController {

    @Autowired
    private PedidoService service;

    @PostMapping(value = "/save")
    public ResponseEntity<Pedido> savarProduto(@RequestBody Pedido pedido){
        return ResponseEntity.ok().body(service.save(pedido));
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Pedido> buscarProduto(@PathVariable Long id){

        Pedido pedido = service.findById(id);

        return ResponseEntity.ok().body(pedido);
    }

    @GetMapping(value = "/list")
    public ResponseEntity<List<Pedido>> findAll(){

        List<Pedido> listPedidos = service.findAll();
        return ResponseEntity.ok().body(listPedidos);
    }
}
