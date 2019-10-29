package com.ronanzenatti.cursomc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ronanzenatti.cursomc.domain.Categoria;
import com.ronanzenatti.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;

	public List<Categoria> findAll() {
		return repository.findAll();
	}

	public Categoria findOne(Integer id) {

		// Usando a classe Optional do Java 8.
		Optional<Categoria> obj = repository.findById(id);
		return obj.orElse(null);

		// return repository.getOne(id);
	}
}
