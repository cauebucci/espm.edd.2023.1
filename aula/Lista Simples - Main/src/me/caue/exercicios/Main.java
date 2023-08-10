package me.caue.exercicios;

import me.caue.exercicio1.Lista;

public class Main {
	public static void main(String[] args) {
		Lista l = new Lista();
		l.inserirInicio("Selmini");
		l.inserirInicio("Sandra");
		l.inserirFim("Flávio");
		l.inserirInicio("Rafa");
		
		l.imprimir();
	}
}
