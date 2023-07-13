package com.example.apirest.service;

import com.example.apirest.model.Produto;
import com.example.apirest.repository.ProdutoRepository;
import com.example.apirest.exception.ProductNullException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;

    public Produto save(Produto produto){
        if(produto.getNome() == null){
            throw new ProductNullException();
        }
      return repository.save(produto);
    }

    public Produto findById(Long id){
        return repository.findById(id).orElse(null);
    }

    public List<Produto> findAll(){
        return repository.findAll();
    }
}
