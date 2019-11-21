package br.edu.ifpb.pweb2.bean;

import java.awt.event.ActionEvent;
import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.ifpb.pweb2.dao.TurmaDAO;
import br.edu.ifpb.pweb2.model.Turma;

@Named(value="turmasBean")
@ViewScoped
public class TurmasBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4298423188301390474L;

	@Inject
	private TurmaDAO turmaDao;
	
	private List<Turma> turmas;
	
	public void listarTurmas(ActionEvent e) {
		this.setTurmas(turmaDao.findAll());
	}

	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}
	
	
	
}
