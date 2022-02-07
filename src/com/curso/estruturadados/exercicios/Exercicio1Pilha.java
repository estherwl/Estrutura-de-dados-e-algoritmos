/*
 * Escreva um programa que leia 10 números. Para cada número lido, verifique:
 * Se o numero for par, empilhe na pilha
 * Se o numero for impar, desempilhe um numero. Caso a pilha esteja vazia, mostre uma msg
 * Se ao final do programa a pilha não estiver vazia, desemplihe todos elementos, imprimindo na tela
*/

package com.curso.estruturadados.exercicios;

import java.util.Scanner;

import com.curso.estruturadados.pilha.Pilha;

public class Exercicio1Pilha {

	public static void main(String[] args) {
		
		Pilha pilha = new Pilha();
		Scanner scan = new Scanner(System.in);		
		
		for(int i = 1; i <= 10 ; i++) {
			System.out.println("Digite um número:");
			int num = scan.nextInt();
						
			if(num % 2 == 0) {
				pilha.empilha(num);
			} else if(num % 2 != 0 && pilha.estaVazio()){
				System.out.println("Pilha está vazia");	
			} else if(num % 2 != 0){
				pilha.desempilha();	
			}
		}
		
		while(!pilha.estaVazio()) {
			System.out.println(pilha);
			pilha.desempilha();
			
		}

	}

}
