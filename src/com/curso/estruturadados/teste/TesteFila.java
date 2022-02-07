package com.curso.estruturadados.teste;

import com.curso.estruturadados.fila.Fila;

public class TesteFila {

	public static void main(String[] args) {
		
		Fila<Integer> fila = new Fila();
		
		System.out.println("Fila está vazia? " + fila.estaVazio());
		
		fila.enfileira(1);
		fila.enfileira(2);
		fila.enfileira(3);
		System.out.println("Tamanho da fila: " + fila.getTamanho());
		
		System.out.println("Primeiro elemento da fila: " + fila.espiar());

		System.out.println("Elemento que será desenfileirado: " + fila.desenfileira());
		
		System.out.println("Fila após remover elemento: " + fila);
	}

}
