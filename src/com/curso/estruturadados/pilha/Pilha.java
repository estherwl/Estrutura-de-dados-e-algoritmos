package com.curso.estruturadados.pilha;

import com.curso.estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica {
	
	public Pilha() {
		super();
	}
	
	public Pilha(int capacidade) {
		super(capacidade);
	}
	
	public void empilha(T elemento) {
		super.adiciona(elemento);		
	}
	
	public T getTopo() {
		if(this.estaVazio()) {
			return null;
		}		
		return (T)this.elementos[tamanho-1];
	}
	
	public T desempilha() {
		if(this.estaVazio()) {
			return null;
		}	
		return (T)this.elementos[--tamanho]; 
		//diminui um do tamanho antes de verificar o elemento pela posição
		//mesma coisa q:
		/*T elemento = (T) this.elementos[tamanho-1];
		tamanho--;
		return elemento;*/
	}
}
