package br.edu.ifpb.pweb2.praticaspringbootdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifpb.pweb2.praticaspringbootdatajpa.entity.Turma;

public interface AlunoRepository extends JpaRepository<Turma, Integer> {

	
	
}
