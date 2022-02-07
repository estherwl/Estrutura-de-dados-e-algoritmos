package com.curso.estruturadados.base;

import java.lang.reflect.Array;

public class EstruturaEstatica<T> {
	
	protected T[] elementos;
	protected int tamanho;

	public EstruturaEstatica(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}

	public EstruturaEstatica() {
		this(10);
	}
	
	public int getTamanho() {
		return this.tamanho;
	}

	protected boolean adiciona(T elemento) {
		this.aumentaCapacidade();

		if (this.elementos.length > this.tamanho) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} else {
			return false;
		}
	}

	protected void adiciona(int posicao, T elemento) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}

		this.aumentaCapacidade();

		for (int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}

		this.elementos[posicao] = elemento;
		this.tamanho++;
	}

	protected void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			T[] novosElementos = (T[]) new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				novosElementos[i] = this.elementos[i];
			}
			this.elementos = novosElementos;
		}
	}
	
	public boolean estaVazio() {
		return tamanho == 0;		
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}

		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}

		s.append("]");

		return s.toString();
	}

}
