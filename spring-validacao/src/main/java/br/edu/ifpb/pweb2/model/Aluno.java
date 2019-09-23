package br.edu.ifpb.pweb2.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import br.edu.ifpb.pweb2.validator.CodCurso;

public class Aluno {

	@NotEmpty(message="Nome é obrigatório")
	@Size(message= "Nome menor ou igual a 5", max=5)
	private String nome;
	
	@NotNull(message="Matrícula é obrigatória")
	private Long matricula;
	
	@CodCurso
	private String curso;
	
	@Past(message = "A data deve estar no passado")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dataNascimento;
	
	@Digits(integer = 3, fraction = 1, message = "Valor entre 0.0 e 100.0")
	private BigDecimal cre;

	
	public Aluno() {
		super();
	}

	public Aluno(String nome, Long matricula, String curso, Date dataNascimento, BigDecimal cre) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.dataNascimento = dataNascimento;
		this.cre = cre;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public BigDecimal getCre() {
		return cre;
	}

	public void setCre(BigDecimal cre) {
		this.cre = cre;
	}
	
	
	
}
