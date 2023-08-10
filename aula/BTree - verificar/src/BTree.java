
public class BTree<T extends Comparable<T>> {
	private No<T> raiz;

	// inserir um nó na árvore binária de busca
	public void inserir(T dado) {
		if (raiz == null) {
			raiz = new No<>(dado);
		} else {
			raiz.inserirNo(dado);
		}
	}

	// método para fazer o percurso pré-ordem
	public String preOrdem() {
		return preOrdem(raiz);
	}

	private String preOrdem(No<T> raiz) {
		String aux = "";
		if (raiz == null) {
			return "";
		}

		aux += raiz.getDado() + "\n";
		aux += preOrdem(raiz.getEsq());
		aux += preOrdem(raiz.getDir());
		return aux;
	}

	// método para fazer o percurso em-ordem
	public String emOrdem() {
		return emOrdem(raiz);
	}

	private String emOrdem(No<T> raiz) {
		String aux = "";
		if (raiz == null) {
			return "";
		}

		aux += emOrdem(raiz.getEsq());
		aux += raiz.getDado() + "\n";
		aux += emOrdem(raiz.getDir());
		return aux;
	}

	// método para fazer o percurso pós-ordem
	public String posOrdem() {
		return posOrdem(raiz);
	}

	private String posOrdem(No<T> raiz) {
		String aux = "";
		if (raiz == null) {
			return "";
		}

		aux += posOrdem(raiz.getEsq());
		aux += posOrdem(raiz.getDir());
		aux += raiz.getDado() + "\n";
		return aux;
	}

	// método para fazer a remoção de um nó específico da árvore
	public No<T> remover(T dado) {
		return remover(raiz, dado);
	}

	public No<T> remover(No<T> raiz, T dado) {
		if (raiz == null) {
			return null;
		}

		if (dado.compareTo(raiz.getDado()) < 0) {
			raiz.setEsq(remover(raiz.getEsq(), dado));
		} else if (dado.compareTo(raiz.getDado()) > 0) {
			raiz.setDir(remover(raiz.getDir(), dado));
		} else {
			// O nó a ser removido tem 0 ou 1 filho
			if (raiz.getEsq() == null) {
				return raiz.getDir();
			} else if (raiz.getDir() == null) {
				return raiz.getEsq();
			}

			// O nó a ser removido tem 2 filhos
			No<T> sucessor = getSucessor(raiz.getDir());
			raiz.setDado(sucessor.getDado());
			raiz.setDir(removerSucessor(raiz.getDir()));
		}

		return raiz;
	}

	private No<T> getSucessor(No<T> no) {
		if (no.getEsq() == null) {
			return no;
		}
		return getSucessor(no.getEsq());
	}

	private No<T> removerSucessor(No<T> no) {
		if (no.getEsq() == null) {
			return no.getDir();
		}
		no.setEsq(removerSucessor(no.getEsq()));
		return no;
	}
	
	public boolean verificar(BTree<T> arvore) {
	String arvore1String = arvore.posOrdem();
	String arvore2String = posOrdem();
	
		if(arvore1String.equalsIgnoreCase(arvore2String)) {
			return true;
		}else {
			return false;
		}
	}

}
