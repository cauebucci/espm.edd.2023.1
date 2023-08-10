package me.caue.posfixa;

import java.util.Scanner;
import java.util.Stack;

public class Converter {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String expressao, posfixa;
		
		System.out.print("Expressão --> ");
		expressao = teclado.nextLine();
		
		posfixa = converter(expressao);
		
		System.out.println(posfixa);
	}

	public static String converter(String expressao) {
		Stack<Character> pilha = new Stack<>();
		String posfixa = "";
		
		char ch;
		
		
		for (int i = 0; i < expressao.length(); i++) {
			ch = expressao.charAt(i);
			
			if(ch != ' ') {
				switch (ch) {
					case '+':
					case '-':
					case '*':
					case '/':
					case '%':
						while(!pilha.isEmpty() && prioridade(pilha.peek()) >= prioridade(ch)) {
							posfixa += pilha.pop();
						}
						pilha.push(ch);
						break;
					case '(':
						pilha.push(ch);
						break;
					case ')':
						while(pilha.peek() != '(') {
							posfixa += pilha.pop();
						}
						pilha.pop();
						break;
					default:
						posfixa += ch;
				}
			}
		}
		
		while(!pilha.isEmpty()) {
			posfixa += pilha.pop();
		}
		
		return posfixa;
	}

	private static int prioridade(Character ch) {
		int p = 0;
		switch (ch) {
		case '(':
			p = 1;
			break;
		case '+':
		case '-':
			p = 2;
			break;
		case '*':
		case '/':
		case '%':
			p = 3;
			break;
		}
		
			
		
		return p;
	}
}
