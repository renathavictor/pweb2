package br.edu.ifpb.pweb2.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.edu.ifpb.pweb2.model.Aluno;

@Repository
public class AlunoDAO {

	@PersistenceContext
	private EntityManager manager;
	
	@Transactional
	public void gravar(Aluno aluno) {
		manager.persist(aluno);
	}
}
