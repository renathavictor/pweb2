package br.edu.ifpb.pweb2.praticaspringbootdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifpb.pweb2.praticaspringbootdatajpa.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

	
}
