//criar um vetor com capacidade para 20 contatos
//inserir 30 contatos no vetor
//criar um exemplo para utilizar cada método da classe Lista

package com.curso.estruturadados.exercicios;

import com.curso.estruturadados.teste.Contato;
import com.curso.estruturadados.vetor.Lista;

public class ExercíciosListaContato {

	public static void main(String[] args) {
		
		Lista<Contato> listaContatos = new Lista(20);
		
		for (int i = 0; i < 30; i++) {
			Contato contato = new Contato("contato " + i, "111-111", "contato" + i + "@gmail.com");
			listaContatos.adiciona(contato);
		}
		
		System.out.println("Lista de contatos: " + listaContatos);
		
		listaContatos.remove(3);
		
		System.out.println("Lista após remover contato: " + listaContatos);
		
		System.out.println("Contato: " + listaContatos.obtem(19));
		
		listaContatos.limpar();
		System.out.println("Tamanho da lista após ser limpa: " + listaContatos.getTamanho());
	} 
}
