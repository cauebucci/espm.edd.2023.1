package me.caue.produto;

public class Main {
	public static void main(String[] args) {
		Produto p = new Produto();
		
		p.nome = "Maça";
		p.preco = 1.99;
		
		System.out.println("Produto:");
		System.out.println("  Descrição: " + p.nome);
		System.out.println("  Preço: R$" + String.format("%.2f", p.preco));
	}
}
