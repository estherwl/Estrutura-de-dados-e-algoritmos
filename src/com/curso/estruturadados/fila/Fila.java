package com.curso.estruturadados.fila;

import com.curso.estruturadados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica {

	public Fila() {
		super();
	}
	
	public Fila(int capacidade) {
		super(capacidade);
	}
	
	public void enfileira(T elemento) {
		this.adiciona(elemento);		
	}
	
	public T espiar() {
		if(this.estaVazio()) {
			return null;
		}		
		return (T)this.elementos[0];
	}
	
	public T desenfileira() {
		final int POS = 0;
		
		if(this.estaVazio()) {
			return null;
		}	
		
		T elementoSeraRemovido = (T) this.elementos[POS];
		this.remove(POS);
		
		return elementoSeraRemovido;
		
	}
	
}
