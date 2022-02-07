/*
 * Mesmas intruções do exercício 3, porém utilizando a classe Stack do Java
*/

package com.curso.estruturadados.exercicios;

import java.util.Stack;

public class Exercicio4Pilha {

	public static void main(String[] args) {

		Stack<Livro> livros = new Stack();

		for (int i = 1; i <= 6; i++) {
			Livro livro = new Livro("título: " + i, i*1000, 2000+i, "autor: " + i);
			livros.push(livro);
		}
		
		System.out.println(livros);
		System.out.println("Quantidade de livros : " + livros.size());
		
		livros.pop();
		
		System.out.println(livros.peek());

	}

}
