//Melhorar a classe Lista, implementando os m�todos:
//cont�m, semelhante ao m�todo contains da classe ArrayList
//�ltimoIndice, semelhante ao m�todo lastIndexOf da classe ArrayList
//remove, onde um elemento da lista � passado como par�metro e removido da lista
//obtem, para obter um elemento dada uma posi��o do vetor
//limpar, onde todos os elementos da lista s�o removidos

package com.curso.estruturadados.exercicios;

import com.curso.estruturadados.vetor.Lista;

public class ExerciciosLista {

	public static void main(String[] args) {
		
		Lista<String> lista = new Lista(3);
		
		lista.adiciona("a");
		lista.adiciona("b");
		lista.adiciona("a");
		lista.adiciona("c");
		
		System.out.println("Lista cont�m elemento? " + lista.contem("c"));
		
		System.out.println("�ltimo �ndice que elemento aparece �: " + lista.ultimoIndice("a"));
		
		System.out.println("Lista antes de remover elemento: " + lista);		
		lista.remove("b");
		System.out.println("Lista ap�s remover elemento: " + lista);
		
		System.out.println("O elemento �: " + lista.obtem(2));

		System.out.println("Lista antes de ser limpa: " + lista);		
		lista.limpar();
		System.out.println("Lista ap�s ser limpa: " + lista);
		
		lista.adiciona("d");
		lista.adiciona("e");
		System.out.println("Nova lista: " + lista);
		
	}

}
