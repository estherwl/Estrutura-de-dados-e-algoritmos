package com.curso.estruturadados.teste;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestePriorityQueue {

	public static void main(String[] args) {
		
		Queue<Integer> fila = new PriorityQueue<>();
		
		fila.add(1);
		fila.add(2);
		fila.add(3);
		
		System.out.println("Fila com prioridade: " + fila);
	}

}
