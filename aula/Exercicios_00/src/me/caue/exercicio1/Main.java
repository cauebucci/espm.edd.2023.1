package me.caue.exercicio1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		
		int pacientes;
		
		System.out.print("Quantos pacientes deseja cadastrar? ");
		pacientes = teclado.nextInt();
		
	
		Paciente p[] = new Paciente[pacientes];

		for (int i = 0; i < pacientes; i++) {
			teclado.nextLine();
			System.out.println(i+1 + "º Paciente ");

			p[i] = new Paciente();
			System.out.print("   Qual o nome do paciente? ");
			p[i].nome = teclado.nextLine();
			System.out.print("   Qual a idade do paciente? ");
			p[i].idade = teclado.nextInt();
		}
		
		for (int i = 0; i < pacientes; i++) {
			teclado.nextLine();
			System.out.println(i+1 + "º Paciente ");

			System.out.println("   Nome: " + p[i].nome);
			System.out.println("   Idade: " + p[i].idade);
			System.out.println("   Frequência Cardíaca Máxima: " + p[i].fcm());
			System.out.println("   Frequência Cardíaca Alvo: " + p[i].fca()[0] + "x" + p[i].fca()[1]);
		}
	}
}
