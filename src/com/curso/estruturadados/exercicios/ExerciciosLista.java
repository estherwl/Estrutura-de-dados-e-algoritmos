package com.curso.estruturadados.exercicios;

import com.curso.estruturadados.vetor.Lista;

public class ExerciciosLista {

	public static void main(String[] args) {
		
		Lista<String> lista = new Lista(3);
		
		lista.adiciona("a");
		lista.adiciona("b");
		lista.adiciona("a");
		lista.adiciona("c");
		
		System.out.println("Lista contém elemento? " + lista.contem("c"));
		
		System.out.println("Último índice que elemento aparece é: " + lista.ultimoIndice("a"));
		
		System.out.println("Lista antes de remover elemento: " + lista);		
		lista.remove("b");
		System.out.println("Lista após remover elemento: " + lista);
		
		System.out.println("O elemento é: " + lista.obtem(2));

		System.out.println("Lista antes de ser limpa: " + lista);		
		lista.limpar();
		System.out.println("Lista após ser limpa: " + lista);
		
		lista.adiciona("d");
		lista.adiciona("e");
		System.out.println("Nova lista: " + lista);
		
	}

}
