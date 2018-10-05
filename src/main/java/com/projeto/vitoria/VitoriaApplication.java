package com.projeto.vitoria;

import com.projeto.vitoria.domain.Categoria;
import com.projeto.vitoria.domain.Produto;
import com.projeto.vitoria.repositorys.CategoriaRepository;
import com.projeto.vitoria.repositorys.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class VitoriaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(VitoriaApplication.class, args);
	}

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private ProdutoRepository produtoRepository;

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "informática");
		Categoria cat2 = new Categoria(null, "enfermagem");

		Produto pro1 = new Produto(null, "Computador", 1.000);
    	Produto pro2 = new Produto(null, "Impressora", 500.00);
    	Produto pro3 = new Produto(null, "mouse", 80.00);

    	cat1.getProdutos().addAll(Arrays.asList(pro1,pro2, pro3));
    	cat2.getProdutos().addAll(Arrays.asList(pro2));

    	pro1.getCategorias().addAll(Arrays.asList(cat1));
    	pro2.getCategorias().addAll(Arrays.asList(cat1, cat2));
    	pro3.getCategorias().addAll(Arrays.asList(cat1, cat2));

		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(pro1,pro2,pro3));


	}
}
