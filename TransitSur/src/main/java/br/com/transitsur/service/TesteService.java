package br.com.transitsur.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.transitsur.entity.Teste;
import br.com.transitsur.repository.TesteRepository;
//s
@Service
public class TesteService {
	
	@Autowired
	private TesteRepository repository;
	
	public List<Teste> getAll () {
		return this.repository.existsById( );
	}
	
	
}
