package com.senac.receptor.services;

import com.senac.receptor.entities.Produto;
import com.senac.receptor.repositories.ProdutoRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;
    @Autowired
    RabbitTemplate rabbitTemplate;

    public ProdutoService(ProdutoRepository repository) {
        this.produtoRepository = repository;
    }

    public void subscribe(String option) {
        System.out.printf("Opção: %s", option);

    }

    @RabbitListener(queues = "fila-get-produto")
    public void salvarProduto(Produto produto) {
        produtoRepository.save(produto);
    }
}
