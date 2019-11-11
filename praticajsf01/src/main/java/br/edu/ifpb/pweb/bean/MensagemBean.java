package br.edu.ifpb.pweb.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value="msgBean")
@RequestScoped
public class MensagemBean {

	private String msg = "Bem vindo ao JSF.";

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
