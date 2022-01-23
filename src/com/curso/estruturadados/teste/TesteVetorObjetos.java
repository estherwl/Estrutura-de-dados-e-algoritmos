package com.curso.estruturadados.teste;

import com.curso.estruturadados.vetor.VetorObjetos;

public class TesteVetorObjetos {

	public static void main(String[] args) {
		
		VetorObjetos vetor = new VetorObjetos(3);
		
//	Tipo primitivo(int) em objeto = autoboxing:
		vetor.adiciona(3);
		vetor.adiciona(5);
		vetor.adiciona(5);
		
		System.out.println("Tamanho: " + vetor.getTamanho());
		System.out.println("Vetor: " + vetor);
	}

}
