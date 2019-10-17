package br.edu.ifpb.pweb2.praticaspringbootdatajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.edu.ifpb.pweb2.praticaspringbootdatajpa.entity.Turma;

public interface TurmaRepository extends JpaRepository<Turma, Integer> {

	List<Turma> findByDisciplinaStartingWithIgnoreCase(String disciplina);
	
	@Query("from Turma where lower(disciplina) like lower(concat('%', :nome, '%'))")
	List<Turma> findByNomeDisciplina(@Param("nome") String nome);
	
	
}
