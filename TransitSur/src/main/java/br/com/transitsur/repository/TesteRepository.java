package br.com.transitsur.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.transitsur.entity.Teste;

@Repository
public interface TesteRepository extends CrudRepository<Teste, Long>  {

}
