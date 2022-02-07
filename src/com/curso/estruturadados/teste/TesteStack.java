package com.curso.estruturadados.teste;

import java.util.Stack;

public class TesteStack {

	public static void main(String[] args) {
		
	//Stack é estrutura nativa do java, equivale a classe criada Pilha
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println(stack);
		System.out.println(stack.size());
		
		System.out.println("Esta vazio? " + stack.isEmpty());
		
		for (int i = 1; i <= 10; i++) {
			stack.push(i);
		}
		
		System.out.println(stack);
		System.out.println(stack.size());
		
		System.out.println("Esta vazio? " + stack.isEmpty());
		
		System.out.println("Último elemento: " + stack.peek());
		
		System.out.println("Elemento desempilhado: " + stack.pop());

	}

}
