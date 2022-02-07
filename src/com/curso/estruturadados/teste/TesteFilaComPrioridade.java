package com.curso.estruturadados.teste;

import com.curso.estruturadados.fila.FilaComPrioridade;

public class TesteFilaComPrioridade {

	public static void main(String[] args) {
		
		FilaComPrioridade<Integer> fila = new FilaComPrioridade<>();
		
		fila.enfileira(2);
		fila.enfileira(3);
		fila.enfileira(4);
		fila.enfileira(1);
		
		System.out.println("Fila com prioridade: " + fila);
	}

}
