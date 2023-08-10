package me.caue.exercios2;

public class Conta {
	int numero;
	int senha;
	String nome;
	String cpf;
	double saldo;
	
	public void saque(double valor) {
		saldo = saldo-valor;
	}
	
	public void deposito(double valor) {
		saldo = valor+saldo;
	}
	
	public boolean validar(int s) {
		if(s == senha) {
			return true;
		}else {
			return false;
		}
	}
	
}
