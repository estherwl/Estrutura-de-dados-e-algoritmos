/*
 * Converta números decimais em binários
*/

package com.curso.estruturadados.exercicios;

import java.util.Scanner;

import com.curso.estruturadados.pilha.Pilha;

public class Exercicio7Pilha {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número decimal: ");
		int numero = scan.nextInt();
		int resto;
		String numeroBinario = "";
		
		Pilha<Integer> pilha = new Pilha();
		
		while(numero > 0) {
			resto = numero % 2;
			pilha.empilha(resto);
			numero /= 2;
		}
		
		while(!pilha.estaVazio()) {
			numeroBinario += pilha.desempilha();
		}
		
		System.out.println(numeroBinario);
		scan.close();
	}
}
