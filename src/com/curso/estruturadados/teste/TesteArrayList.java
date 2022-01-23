package com.curso.estruturadados.teste;

import java.util.ArrayList;

public class TesteArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("A");
		arrayList.add("C");
		
		System.out.println(arrayList);
		
		arrayList.add(1, "B");
		
		System.out.println(arrayList);
		
		System.out.println("Contem elemento: " + arrayList.contains("D"));
		
		System.out.println("O elemento está na posição: " + arrayList.indexOf("B"));
	
		System.out.println("O elemento da posição é: " + arrayList.get(2)); //igual metodo busca criado na classe vetor
	
		System.out.println("Tamanho do arrayList: " + arrayList.size());
	}

}
