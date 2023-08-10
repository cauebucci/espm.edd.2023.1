package me.caue.exercicios.exc1;

import static javax.swing.JOptionPane.*;

import java.text.NumberFormat;
import java.util.LinkedList;
import java.util.Queue;

import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class Util {
	
	private Queue<Acao> fila = new LinkedList<>();
	
	public void menu() {
		String aux = "Qual opção deseja: \n\n";
		aux += "1. Comprar\n";
		aux += "2. Vender\n";
		aux += "3. Finalizar";
		int opc = 0;
		
		do {
			try {
				opc = parseInt(showInputDialog(aux));
				if(opc < 1 || opc > 3) {
					throw new OpcaoInvalidaException("Opção inválida.");
				}
				
				switch(opc) {
					case 1:
						comprar();
						break;
					case 2:
						vender();
						break;
				}
					
			} catch (NumberFormatException e) {
					showMessageDialog(null, "Opção inválida.");
			} catch (OpcaoInvalidaException e) {
				showMessageDialog(null, e);
			} catch (Exception e) {
				showMessageDialog(null, "ERRO | " + e);
			}
		}while(opc != 3);
	}

	private void vender() {
		int qnt;
		double preco;
		double precoA = 0;
		try {
			qnt = parseInt(showInputDialog("Quantas ações deseja vender? "));
			preco = parseDouble(showInputDialog("Qual o preço que deseja vender as ações? "));
			
			do {
				if(fila.peek().getQnt() > qnt) {
					qnt -= fila.peek().getQnt();
					precoA += fila.peek().getPreco();
					fila.remove();
				}else {
					qnt -= fila.peek().getQnt();
					precoA += fila.peek().getPreco();
					fila.peek().setQnt(qnt);
				}
			}while(qnt == 0);
			
			showMessageDialog(null, "Quantidade: " + qnt + "\nPreco: " + precoA + "\nLucro: " + (precoA - preco));
			
		} catch (NumberFormatException e) {
			showMessageDialog(null, "Valor inválido!");
		}
		
		
		
	}

	private void comprar() {
		int qnt = 0;
		double preco = 0;
		try {
			qnt = parseInt(showInputDialog("Qual a quantidade de ações?"));
			preco = parseDouble(showInputDialog("Qual o preço das ações?"));
		} catch (NumberFormatException e) {
			showMessageDialog(null, "Número inválido!");
		}
		fila.add(new Acao(qnt, preco));
	}
	
}
