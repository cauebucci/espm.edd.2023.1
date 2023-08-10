package me.caue.listaduplagenerica;

public class No<T> {
	T dado;
	
	No<T> esq, dir;
	
	
	public No(T dado) {
		this.dado = dado;
	}
	
	public T getDado() {
		return dado;
	}
	
}
