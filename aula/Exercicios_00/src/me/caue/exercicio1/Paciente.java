package me.caue.exercicio1;

public class Paciente {
	String nome;
	int idade;
	
	
	public int fcm() {
		int fcm = 220-idade;
		return fcm;
	}
	
	public double[] fca() {
		double[] alvo = new double[2];
		
		alvo[0] = fcm() * 0.5;
		alvo[1] = fcm() * 0.85;
		
		return alvo;
	}
}
