/*
 * Escreva um programa que testa se uma sequência de caracteres fornecida pelo usuário é
 * um palindromo - Ex: ABCCBA
*/

package com.curso.estruturadados.exercicios;

import java.util.Scanner;

import com.curso.estruturadados.pilha.Pilha;

public class Exercicio5Pilha {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma sequeência de caracteres: ");
		String palavra = scan.next();
		
		Pilha<Character> pilha = new Pilha<Character>(); 
		
		for (int i=0; i<palavra.length(); i++){
			pilha.empilha(palavra.charAt(i));
		}
		
		String palavraContrario = "";
		for (int i=0; i<palavra.length(); i++){
			palavraContrario += pilha.desempilha();
		}
		
		if(palavra.equals(palavraContrario)) {
			System.out.println("Sequência é um palíndromo");
		} else {
			System.out.println("Sequência não é um palíndromo");
		}
	}

}
