package com.curso.estruturadados.teste;

import com.curso.estruturadados.vetor.Lista;

public class TesteLista {

	public static void main(String[] args) {

		Lista<String> vetor = new Lista(3);

//	Tipo primitivo(int) em objeto = autoboxing:
		vetor.adiciona("morango");
		vetor.adiciona("laranja");
		vetor.adiciona("limão");

		System.out.println("Tamanho: " + vetor.getTamanho());
		System.out.println("Vetor: " + vetor);
	}

}
