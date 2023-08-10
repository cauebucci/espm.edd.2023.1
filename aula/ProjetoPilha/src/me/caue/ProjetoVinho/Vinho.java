package me.caue.ProjetoVinho;

public class Vinho {
	private String nome;
	private int safra;
	
	public Vinho(String nome, int safra) {
		this.nome = nome;
		this.safra = safra;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getSafra() {
		return safra;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n" + nome + "\n  Safra: " + safra;
	}
}
