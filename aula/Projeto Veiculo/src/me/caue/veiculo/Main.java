package me.caue.veiculo;

public class Main {
	public static void main(String[] args) {
		Veiculo v = new Veiculo("FXY3A95", "Fiat");
		Veiculo v1 = new Veiculo("ABC1212", "Audi");

		
		System.out.println(v);
		System.out.println(v1);
		
		if(v.equals(v1)) {
			System.out.println("São iguais");
		}else {
			System.out.println("Não são iguais");
		}
	}
}
