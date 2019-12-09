package br.edu.ifpb.pweb2.dao;

import javax.inject.Inject;
import javax.interceptor.InvocationContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TransactionInterceptor {
	
	private @Inject EntityManager manager;
	
	public Object invoke(InvocationContext context) throws Exception {
		EntityTransaction trx = manager.getTransaction();
		boolean criador = false;
		
		try {
			if (!trx.isActive()) {
				trx.begin();
				trx.rollback();
				trx.begin();
				criador = true;
			}
			return context.proceed();
		} catch (Exception e) {
			if (trx != null && criador) {
				trx.rollback();
			}
		}
	}

}
