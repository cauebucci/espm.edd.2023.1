package me.caue.listaduplagenerica;

public class Lista<T> {
	private No<T> inicio;
	private No<T> fim;
	private int tamanho;
	
	public void inserirInicio(T dados) {
		No<T> aux = new No<T>(dados);
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
	
	public void inserirFim(T dados) {
		No<T> aux = new No<T>(dados);
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
	
	public T getElemento(int i) {
		No<T> aux = inicio;
		for (int j = 1; j <= tamanho; j++) {
			if(j == i) {
				return aux.dado;
			}
			aux = aux.dir;
		}

		return null;

	}
	public String imprimir() {
		String msg = "";
		No<T> aux = inicio;
		while(aux != null) {
			msg += aux.dado;
			aux = aux.dir;
		};
		return msg;
	}
	
	public T getPrimeiro() {
		return inicio.getDado();
	}
	
	public No<T> pesquisar(T dado) {
		No<T> aux = inicio;
		while(aux != null) {
			if(aux.dado.equals(dado)) {
				return aux;
			}
			aux = aux.dir;
		};
		
		return null;
	}
	
	public String pesquisarDados(T dado) {
		No<T> aux = inicio;
		while(aux != null) {
			if(aux.dado.equals(dado)) {
				return aux.dado.toString();
			}
			aux = aux.dir;
		};
		
		return null;
	}
	
	public T pesquisarDados2(T dado) {
		No<T> aux = inicio;
		while(aux != null) {
			if(aux.dado.equals(dado)) {
				return aux.getDado();
			}
			aux = aux.dir;
		};
		
		return null;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public boolean remover(T dados){
		No<T> aux = pesquisar(dados);
		boolean retorno = false;
		if(aux != null) {
			if(tamanho == 1) {
				fim = null;
				inicio = null;
				aux = null;
			} else if(aux == inicio) {
				inicio = aux.dir;
				inicio.esq = null;
				aux.dir = null;
				aux = null;
			} else if(aux == fim) {
				fim = aux.esq;
				fim.dir = null;
				aux.esq = null;
				aux = null;
			} else {
				aux.dir.esq = aux.esq;
				aux.esq.dir = aux.dir;
				aux.esq = null;
				aux.dir = null;
				aux = null;
			}
			tamanho--;
			retorno = true;
		}
		return retorno;
	}
}
