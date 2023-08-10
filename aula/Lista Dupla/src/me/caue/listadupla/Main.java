package me.caue.listadupla;

public class Main {
	public static void main(String[] args) {
		Lista l = new Lista();
		
		l.inserirInicio(1221, "Cauê");
		l.inserirInicio(3221, "Bruno");
		l.imprimir();
		
		if(l.pesquisar(1221) != null) {
			System.out.println("Achou");
		}else {
			System.out.println("Não Achou");

		}
	}
}
