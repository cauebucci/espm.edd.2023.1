package me.caue.ProjetoVinho;

import java.util.Stack;

public class Util {
	static Stack<Vinho> vinhos = new Stack<>();
	
	public static void cadastrarVinho(String nome, int safra) {
		Vinho vinho = new Vinho(nome, safra);
		
		vinhos.push(vinho);

	}
	
	
	public static Vinho ocasiaoEspecial() {
		if(vinhos.empty()) {
			return null;
		}
		return vinhos.peek();
	}
	
	public static Vinho[] maisAntigos(int n) {
		
		if(vinhos.empty()) {
			return null;
		}
		
		Stack<Vinho> aux = new Stack<>();
		
		aux = (Stack<Vinho>) vinhos.clone();
		
		while(aux.size() > n) {
			aux.pop();
		}
		
		Vinho[] listaVinhos = new Vinho[aux.size()];
		System.out.println(aux.size());
		for (int i = 0; i <= aux.size(); i++) {
			listaVinhos[i] = aux.pop();
		}
		
		aux = null;
		return listaVinhos;
		
	}
	
	
	
}
