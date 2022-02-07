/*
 * Escreva um programa para verificar se uma expressão matemática tem os parenteses colocados de forma correta
 * O numero de paranteses à esquerda e à direita são iguais
 * Todo parântese aberto é seguido posteriormente por um fechamento de parêntese
*/

package com.curso.estruturadados.exercicios;

import java.util.Scanner;

import com.curso.estruturadados.pilha.Pilha;

public class Exercicio6Pilha {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma expressão matemática: ");
		String expressao = scan.next();
		
		System.out.println("Os parênteses estão corretos? " + verificaParenteses(expressao));

	}

	public static boolean verificaParenteses(String expressao) {

		Pilha<Character> pilha = new Pilha<Character>();
		int index = 0;
		char simbolo, topo;
		String ABRE = "(";
		String FECHA = ")";


		while (index < expressao.length()) {
			simbolo = expressao.charAt(index);

			if (ABRE.indexOf(simbolo) > -1) {
				pilha.empilha(simbolo);

			} else if (FECHA.indexOf(simbolo) > -1) {

				if (pilha.estaVazio()) {
					return false;
				} else {
					topo = pilha.desempilha();

					if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) {
						return false;
					}
				}
			}

			index++;
		}

		return true;
	}
}
