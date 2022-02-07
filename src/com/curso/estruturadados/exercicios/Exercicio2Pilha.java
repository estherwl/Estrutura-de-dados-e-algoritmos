/*
 * Escreva um programa que leia 10 n�meros. Para cada n�mero lido, verifique:
 * Se o numero for par, empilhe na pilha par
 * Se o numero for impar, empilhe na pilha impar
 * Se o n�mero for zero, desempilhe um numero de cada pilha. Caso alguma pilha esteja vazia, mostre uma msg de erro
 * Se ao final do programa a pilha n�o estiver vazia, desemplihe todos elementos, imprimindo na tela
*/

package com.curso.estruturadados.exercicios;

import java.util.Scanner;

import com.curso.estruturadados.pilha.Pilha;

public class Exercicio2Pilha {

	public static void main(String[] args) {
		
		Pilha par = new Pilha();
		Pilha impar = new Pilha();
		Scanner scan = new Scanner(System.in);		
		
		for(int i = 1; i <= 10 ; i++) {
			System.out.println("Digite um n�mero:");
			int num = scan.nextInt();
						
			if(num % 2 == 0 && num != 0) {
				par.empilha(num);
			} else if(num % 2 != 0){
				impar.empilha(num);				
			} else if(num == 0 && par.estaVazio() || impar.estaVazio()){
				System.out.println("Pilha est� vazia");	
			} else if(num == 0){
				par.desempilha();	
				impar.desempilha();
			}
		}
		
		while(!par.estaVazio() || !impar.estaVazio()) {
			System.out.println("Par: " + par);
			par.desempilha();
			System.out.println("Impar: " + impar);
			impar.desempilha();			
		}
		
		System.out.println("Pilhas desempilhadas: par " + par + " impar " + impar);

	}

}
