package me.caue.exercicios;

import java.util.Scanner;
import java.util.Stack;

public class Conversao {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Stack<Long> binario = new Stack<>();
		
		System.out.print("Qual número deseja converter? ");
		Long n = teclado.nextLong();
		
		while(n != 0) {
			Long r;
			r = n%2;
			n = n/2;
			binario.push(r);
		}
		while(!binario.empty()) {
			System.out.print(binario.pop());
		}
		
		
		
	}
}
