/*
 * Escreva um programa que testa se uma sequ�ncia de caracteres fornecida pelo usu�rio �
 * um palindromo - Ex: ABCCBA
*/

package com.curso.estruturadados.exercicios;

import java.util.Scanner;

import com.curso.estruturadados.pilha.Pilha;

public class Exercicio5Pilha {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma seque�ncia de caracteres: ");
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
			System.out.println("Sequ�ncia � um pal�ndromo");
		} else {
			System.out.println("Sequ�ncia n�o � um pal�ndromo");
		}
	}

}
