package me.caue.exercicio1;

public class Lista {
	private No inicio, fim;

	// metodo para inserir um nó no início da lista
	public void inserirInicio(String nome) {
		No aux = new No();
		aux.nome = nome;
		if (inicio == null && fim == null) {
			inicio = aux;
			fim = aux;
		}else {
			aux.prox = inicio;
			inicio = aux;
		}

	}
	
	// metodo para inserir um nó no final da lista
	public void inserirFim(String nome) {
		No aux = new No();
		aux.nome = nome;
		if(inicio == null && fim == null) {
			inicio = aux;
			fim = aux;
		}else {
			fim.prox = aux;
			fim = aux;
		}
	}
	
	// metodo para imprimir os elementos da lista
	public void imprimir() {
		System.out.println("Lista de nomes: ");
		No aux = inicio;
		while(aux != null) {
			System.out.println(" - " + aux.nome);
			aux = aux.prox;
		};
	}

}
