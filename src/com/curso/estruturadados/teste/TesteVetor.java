package com.curso.estruturadados.teste;

import com.curso.estruturadados.vetor.Vetor;

public class TesteVetor {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(3);

//		SE TENTASSE OPÇÃO 1 DA CLASSE VETOR:
//		try {
//		vetor.adiciona("elemento 1");
//		vetor.adiciona("elemento 2");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//OPÇÃO 2:
		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		
		System.out.println("Tamanho do vetor: " + vetor.getTamanho());
		System.out.println("Vetor: " + vetor);		
		System.out.println("Busca por posição: " + vetor.busca(1));
		System.out.println("Busca por elemento: " + vetor.busca("elemento 2"));
		
		System.out.println("Vetor antes de adicionar e mover elementos: " + vetor);
		vetor.adiciona(1, "elemento 3");
		System.out.println("Vetor depois de adicionar e mover elementos: " + vetor);
		
		vetor.adiciona("elemento 4");
		System.out.println("Vetor depois de aumentar capacidade: " + vetor);
	
		vetor.remove(0);
		System.out.println("Vetor depois de remover elemento por posição: " + vetor);
	
	}
	

}
