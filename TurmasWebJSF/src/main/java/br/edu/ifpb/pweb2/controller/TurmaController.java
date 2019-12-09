package br.edu.ifpb.pweb2.controller;

import java.util.List;

import javax.inject.Inject;

import br.edu.ifpb.pweb2.dao.TurmaDAO;
import br.edu.ifpb.pweb2.model.Aluno;
import br.edu.ifpb.pweb2.model.Turma;

public class TurmaController {
	 
	@Inject
	private TurmaDAO turmaDAO;
	
	public TurmaController() {
		// TODO Auto-generated constructor stub
	}
	
	public void criarTurma(String nome) {
		// Validacao
		Turma t = new Turma();
		t.setNome(nome);
		turmaDAO.beginTransaction();
		turmaDAO.insert(t);
		turmaDAO.commit();
	}
	
	public List<Turma> listarTurmas() {
		TurmaDAO dao = new TurmaDAO();
		List<Turma> turmas = dao.findAll();
		return turmas;
	}
	
	
	public void matricularAluno(Long idTurma, String matricula, String nome) {
		TurmaDAO dao = new TurmaDAO();
		dao.beginTransaction();
		Turma turma = dao.find(idTurma);
		Aluno novo = new Aluno();
		novo.setMatricula(matricula);
		novo.setNome(nome);
		turma.addAluno(novo);
		dao.commit();
	}

	public Turma getTurmaById(Long id) {
		TurmaDAO dao = new TurmaDAO();
		return dao.find(id);
	}
}
