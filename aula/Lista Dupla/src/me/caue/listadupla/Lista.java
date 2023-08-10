package me.caue.listadupla;

public class Lista {
	No inicio;
	No fim;
	int tamanho;
	
	public void inserirInicio(int ra, String nome) {
			No aux = new No(ra, nome);
			if (tamanho == 0) {
				inicio = aux;
				fim = aux;
			}else {
				aux.dir = inicio;
				inicio.esq = aux;
				inicio = aux;
			}
			tamanho++;
	}
	
	public void inserirFim(int ra, String nome) {
		No aux = new No(ra, nome);
		if (tamanho == 0) {
			inicio = aux;
			fim = aux;
		}else {
			aux.esq = fim;
			fim.dir = aux;
			fim = aux;
		}
		tamanho++;
}
	
	public void imprimir() {
		System.out.println("Lista de nomes: ");
		No aux = inicio;
		while(aux != null) {
			System.out.println(aux.ra + " - " + aux.nome);
			aux = aux.dir;
		};
	}
	
	public No pesquisar(int ra) {
		No aux = inicio;
		while(aux != null) {
			if(ra == aux.ra) {
				return aux;
			}
			aux = aux.dir;
		};
		
		return null;
	}
}
