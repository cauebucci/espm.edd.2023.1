package me.caue.veiculo;

public class Veiculo {
	String placa;
	String marca;
	
	public Veiculo(String placa, String marca) {
		this.placa = placa;
		this.marca = marca;
	}
	
	@Override
	public String toString() {
		return placa + "\n  " + marca;
		
	}
	@Override
	public boolean equals(Object obj) {
		Veiculo v = (Veiculo) obj;
		return v.placa.equals(placa) ? true : false;
	}
}
