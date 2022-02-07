package com.curso.estruturadados.teste;

import java.util.LinkedList;
import java.util.Queue;

public class TesteQueue {

	public static void main(String[] args) {
		
		Queue<Integer> fila = new LinkedList();
		
		System.out.println("Fila está vazia? " + fila.isEmpty());
		
		fila.add(1); //enqueue
		fila.add(2);
		fila.add(3);
		System.out.println("Tamanho da fila: " + fila.size());
		
		System.out.println("Primeiro elemento da fila: " + fila.peek());//espiar

		System.out.println("Elemento que será desenfileirado: " + fila.remove());//dequeue
		
		System.out.println("Fila após remover elemento: " + fila);
	}

}
