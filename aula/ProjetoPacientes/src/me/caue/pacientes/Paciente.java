package me.caue.pacientes;

public class Paciente {
	private String nome;
	private int idade;
	private double peso;
	private double altura;
	private double quadril;
	
	public Paciente(String nome, int idade, double peso, double altura, double quadril) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
		this.quadril = quadril;
	}
	
	public Paciente(String nome) {
		this.nome = nome;
	}
	
	public double IMC() {
		double imc = peso/(altura*altura);
		return imc;
	}
	public int frenquenciaMaxima() {
		return 220 - idade;
	}
	public double[] frequenciaAlvo() {
		double[] alvo = new double[2];
		alvo[0] = frenquenciaMaxima() * 0.5;
		alvo[1] = frenquenciaMaxima() * 0.85;
		return alvo;
	}
	public double BAI() {
		return quadril/ (altura * Math.sqrt(altura)) - 18;
	}
	
	public String toString() {
		String aux = "";
		aux += "Nome: " + nome + "\n";
		aux += "   IMC: " + String.format("%.2f", IMC()) + "\n";
		aux += "   BAI: " + String.format("%.2f", BAI()) + "\n";
		aux += "   Frequência máxima: " + frenquenciaMaxima() + "\n";
		double[] alvo = frequenciaAlvo();
		aux += "   Frequencia alvo: " + alvo[0] + " - " +  alvo[1] + "\n";
		return aux;
	}
	
	@Override
	public boolean equals(Object obj) {
		Paciente paciente = (Paciente) obj;
		if(paciente.nome.equalsIgnoreCase(nome)) {
			return true;
		}
		return false;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void setQuadril(double quadril) {
		this.quadril = quadril;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public double getQuadril() {
		return quadril;
	}
	
}
