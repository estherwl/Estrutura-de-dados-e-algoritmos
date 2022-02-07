package com.curso.estruturadados.exercicios;

public class Livro {
	
	private String titulo;
	private int isbn;
	private int anoLancamento;
	private String autor;
	
	public Livro() {
	}

	public Livro(String titulo, int isbn, int anoLancamento, String autor) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.anoLancamento = anoLancamento;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "{Livro titulo = " + titulo + ", isbn = " + isbn + ", anoLancamento = " + anoLancamento + ", autor = " + autor + "}";
	}
	
	
}
