package com.curso.estruturadados.vetor;

import java.lang.reflect.Array;

//generics impede erro que ocorria na classe VetorObjetos
//T = type
public class Lista<T> {

	private T[] elementos;
	private int tamanho;

	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}

//	Solução menos recomendada:
	public Lista(int capacidade, Class<T> tipoClasse) {
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0;
	}

	public int getTamanho() {
		return this.tamanho;
	}

	public boolean adiciona(T elemento) {
		this.aumentaCapacidade();

		if (this.elementos.length > this.tamanho) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} else {
			return false;
		}
	}

	public void adiciona(int posicao, T elemento) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}

		this.aumentaCapacidade();

//	move todos elementos para adc o elemento na posicao
		for (int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}

		this.elementos[posicao] = elemento;
		this.tamanho++;
	}

	private void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			T[] novosElementos = (T[]) new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				novosElementos[i] = this.elementos[i];
			}
			this.elementos = novosElementos;
		}
	}

	public boolean contem(T elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return true;
			} 
		}
		return false;
	}
	
	public int ultimoIndice(T elemento) {
		int contador = -1;
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				contador = i;
			}
		}
		return contador;
	}

	public void remove(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		for (int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}
		this.tamanho--;
	}
	
	public void remove(T elemento) {
		int posicao = busca(elemento);
		if (posicao > -1) {
			for (int i = posicao; i < this.tamanho - 1; i++) {
				this.elementos[i] = this.elementos[i + 1];
			}
			this.tamanho--;
		} 		
	}
	
	public void limpar() {
		this.tamanho = 0;	
	}
	
	public T obtem(int posicao) {
		return busca(posicao);
	}

	public T busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return this.elementos[posicao];
	}

	public int busca(T elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
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
