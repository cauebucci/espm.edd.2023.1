
public class No<T extends Comparable<T>> {
	private T dado;
	private No<T> dir;
	private No<T> esq;
	
	public No(T dado) {
		this.dado = dado;
		this.dir = null;
		this.esq = null;
	}

	// método recursivo para inserir um nó na árvore
	public void inserirNo(T dado) {
		if(this.dado.compareTo(dado) > 0) {
			if(esq == null) {
				esq = new No<>(dado);
			} else {
				esq.inserirNo(dado);
			}
		} else if(this.dado.compareTo(dado) < 0) {
			if(dir == null) {
				dir = new No<>(dado);
			} else {
				dir.inserirNo(dado);
			}
		}
	}
	
	public T getDado() {
		return dado;
	}

	public void setDado(T dado) {
		this.dado = dado;
	}

	public No<T> getDir() {
		return dir;
	}

	public void setDir(No<T> dir) {
		this.dir = dir;
	}

	public No<T> getEsq() {
		return esq;
	}

	public void setEsq(No<T> esq) {
		this.esq = esq;
	}	
}
