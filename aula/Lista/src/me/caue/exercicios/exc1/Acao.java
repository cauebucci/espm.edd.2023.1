package me.caue.exercicios.exc1;

public class Acao {
	private int qnt;
	private double preco;
	
	public Acao(int qnt, double preco) {
		this.qnt = qnt;
		this.preco = preco;
	}
	
	public int getQnt() {
		return qnt;
	}
	
	public void setQnt(int qnt) {
		this.qnt = qnt;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
