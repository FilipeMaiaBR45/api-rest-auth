package com.example.apirest.controller;

import com.example.apirest.model.Produto;
import com.example.apirest.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "produto")
public class ProdutoController {

    @Autowired
    private ProdutoService service;



    @PostMapping(value = "/save")
    public ResponseEntity<Produto> savarProduto(@RequestBody Produto produto){
        return ResponseEntity.ok().body(service.save(produto));
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Produto> buscarProduto(@PathVariable Long id){

        Produto produto = service.findById(id);

        return ResponseEntity.ok().body(produto);
    }

    @GetMapping(value = "/list")
    public ResponseEntity<List<Produto>> findAll(){

        List<Produto> listProduto = service.findAll();
        return ResponseEntity.ok().body(listProduto);
    }

}
