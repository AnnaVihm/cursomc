package com.projeto.vitoria;

import com.projeto.vitoria.domain.Categoria;
import com.projeto.vitoria.repositorys.CategoriaRepository;
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

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "informática");
		Categoria cat2 = new Categoria(null, "enfermagem");

		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));


	}
}
