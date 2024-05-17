package org.serratec.backend.individual.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.serratec.backend.individual.model.Livro;
import java.util.List;


@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

	
	
}