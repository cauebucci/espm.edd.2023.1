package me.caue.posfixa;

import java.util.Scanner;
import java.util.Stack;

public class Resolver {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String expressao, posfixa;
		System.out.print("Expressão -> ");
		expressao = teclado.nextLine();
		
		posfixa = Converter.converter(expressao);
		
		System.out.println(resolver(posfixa));
		
	}
	
	public static double resolver(String expressao) {
		Stack<Double> pilha = new Stack<>();
		
		double x = 0;
		double y = 0;
		
		for (int i = 0; i < expressao.length(); i++) {
			char ch = expressao.charAt(i);
			switch (ch) {
			case '+':
				y = pilha.pop();
				x = pilha.pop();
				
				pilha.push(x + y);
				break;

			case '-':
				y = pilha.pop();
				x = pilha.pop();
				
				pilha.push(x - y);
				break;

			case '*':
				y = pilha.pop();
				x = pilha.pop();
				
				pilha.push(x * y);
				break;

			case '/':
				y = pilha.pop();
				x = pilha.pop();
				
				pilha.push(x / y);
				break;

			case '%':
				y = pilha.pop();
				x = pilha.pop();
				
				pilha.push(x % y);
				break;

			default:
				pilha.push(Double.parseDouble(String.valueOf(ch)));
				break;
			}
		}
		return pilha.pop();
	}
}
