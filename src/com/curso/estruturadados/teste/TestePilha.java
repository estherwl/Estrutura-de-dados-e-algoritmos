package com.curso.estruturadados.teste;

import com.curso.estruturadados.pilha.Pilha;

public class TestePilha {

	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha();
		
		System.out.println(pilha);
		System.out.println(pilha.getTamanho());
		
		System.out.println("Esta vazio? " + pilha.estaVazio());
		
		for (int i = 1; i <= 10; i++) {
			pilha.empilha(i);
		}
		
		System.out.println(pilha);
		System.out.println(pilha.getTamanho());
		
		System.out.println("Esta vazio? " + pilha.estaVazio());
		
		System.out.println("Último elemento: " + pilha.getTopo());
		
		System.out.println("Elemento desempilhado: " + pilha.desempilha());
	
	}

}
