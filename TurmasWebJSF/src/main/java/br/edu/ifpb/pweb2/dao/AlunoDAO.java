package br.edu.ifpb.pweb2.dao;

import javax.persistence.EntityManager;

import org.jboss.logging.Logger;

import br.edu.ifpb.pweb2.model.Aluno;


public class AlunoDAO extends GenericDAOJPAImpl<Aluno, Long> {

	private static Logger logger = Logger.getLogger(AlunoDAO.class);
	
	public AlunoDAO() {
//		this(PersistenceUtil.getCurrentEntityManager());
	}
	
	public AlunoDAO(EntityManager em) {
		super(em); 
	}	

}
