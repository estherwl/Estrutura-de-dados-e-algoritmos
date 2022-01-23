package com.curso.estruturadados.vetor;

public class Vetor {

	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	
	public int getTamanho() {
		return this.tamanho;
	}

//	L�gica ruim, precisa percorrer todos elementos at� encontrar null e add	
//	public void adiciona(String elemento) {     
//		for (int i = 0; i < this.elementos.length; i++) {
//			if (this.elementos[i] == null) {
//				this.elementos[i] = elemento;
//				break;
//			}
//		}
//	}

//	OP��O 1:
//	public void adiciona(String elemento) throws Exception {
//		if (this.elementos.length > this.tamanho) {
//			this.elementos[this.tamanho] = elemento;
//			this.tamanho++;
//		} else {
//			throw new Exception("Vetor j� est� cheio, n�o � poss�vel adicionar mais elementos");
//		}
//	}

//	OP��O 2:
	public boolean adiciona(String elemento) {
		this.aumentaCapacidade();
		
		if (this.elementos.length > this.tamanho) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} else {
			return false;
		}
	}
	
	public void adiciona(int posicao, String elemento) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi��o inv�lida");
		}
		
		this.aumentaCapacidade();
		
//	move todos elementos para adc o elemento na posicao
		for (int i = this.tamanho-1; i >= posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		
		this.elementos[posicao] = elemento;
		this.tamanho++;
	}
	
	private void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			String[] novosElementos = new String[this.elementos.length * 2];
			for(int i = 0; i < this.elementos.length; i++) {
				novosElementos[i] = this.elementos[i];
			}
			this.elementos = novosElementos;
		}
	}
	
	public void remove(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi��o inv�lida");
		}		
		for (int i = posicao; i < this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}		
		this.tamanho--;		
	}

	// Obtem elemento de uma posi��o
	public String busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi��o inv�lida");
		}
		return this.elementos[posicao];
	}

	// Verifica se elemento existe
	public int busca(String elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}

		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}

		s.append("]");

		return s.toString();
	}

}
