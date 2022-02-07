/*
 * Crie uma pilha com capacidade para 20 livros
 * Insira 6 livros na pilha. Cada um contém isbn, nome, ano de lançamento e autor
 * Crie um exemplo para utilizar cada método da classe Pilha
*/

package com.curso.estruturadados.exercicios;

import com.curso.estruturadados.pilha.Pilha;

public class Exercicio3Pilha {

	public static void main(String[] args) {

		Pilha<Livro> livros = new Pilha(20);

		for (int i = 1; i <= 6; i++) {
			Livro livro = new Livro("título: " + i, i*1000, 2000+i, "autor: " + i);
			livros.empilha(livro);
		}
		
		System.out.println(livros);
		System.out.println("Quantidade de livros : " + livros.getTamanho());
		
		livros.desempilha();
		
		System.out.println(livros.getTopo());

	}

}
