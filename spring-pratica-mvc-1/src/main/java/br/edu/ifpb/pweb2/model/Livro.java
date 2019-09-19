package br.edu.ifpb.pweb2.model;

public class Livro {
	private Long id;
	private String titulo;
	private String autor;
	private String estilo;
	
	public Livro(Long id, String titulo, String autor, String estilo) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.estilo = estilo;
	}
	
	public Livro() {}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getEstilo() {
		return estilo;
	}
	
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

}
