package me.caue.pacientes;


import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import me.caue.listaduplagenerica.Lista;

public class Util {
	
	private static Lista<Paciente> lp = new Lista<Paciente>();
	
	public static void menu() {
		boolean programa = true;
		do {
			boolean opcS = true;
			int opca = 0;
			do {
				String opc = showInputDialog("Escolha a opção desejada: \n\n1. Cadastrar Paciente\n2. Pesquisar Paciente\n3. Excluir Paciente\n4. Listar Pacientes\n5. Finalizar Programa");
				if(!opc.matches("[0-9]+")) {
					showMessageDialog(getRootFrame(), "Opção inválida!");
				}else {
					opca = parseInt(opc);
					if(opca < 1 || opca > 5) {
						showMessageDialog(getRootFrame(), "Opção inválida!");
					}else {
						opcS = false;
					}
				}	
			}while(opcS);
			
			if(opca == 1) {
				cadastrar();
			}else if(opca == 2) {
				pesquisar();
			}else if(opca == 3) {
				excluir();
			}else if(opca == 4) {
				listar(); 
			}else {
				showMessageDialog(getRootFrame(), "Programa finalizado com sucesso!");
				programa = false;
			}
			
		}while(programa);
	}
	
	private static void cadastrar() {
		String nome = showInputDialog("Qual o nome do paciente? ");
		int idade = 0;
		double peso = 0;
		double altura = 0;
		double quadril = 0;
		if(lp.pesquisar(new Paciente(nome)) == null) {
			String aidade = showInputDialog("Qual a idade do paciente? ");
			if(aidade.matches("[0-9]+")) {
				idade = parseInt(aidade);
			}else {
				showMessageDialog(getRootFrame(), "Idade Inválida.");
				return;
			}
			peso = Double.parseDouble(showInputDialog("Qual o peso do paciente? "));
			altura = Double.parseDouble(showInputDialog("Qual a altura do paciente? "));
			quadril = Double.parseDouble(showInputDialog("Qual o comprimento do quadril do paciente? "));
			
			lp.inserirFim(new Paciente(nome, idade, peso, altura, quadril));
			showMessageDialog(getRootFrame(), "Paciente cadastrado com sucesso!");

		}else {
			showMessageDialog(getRootFrame(), "Esse paciente já existe!");
		}
	}
	
	private static void excluir() {
		String nome = showInputDialog("Qual o nome do paciente que deseja excluir? ");
		if(lp.pesquisar(new Paciente(nome)) != null){
			lp.remover(new Paciente(nome));
			showMessageDialog(getRootFrame(), "Paciente excluido com sucesso!");
		}else {
			showMessageDialog(getRootFrame(), "Esse paciente não existe!");

		}
	}
	
	private static void pesquisar() {
		String nome = showInputDialog("Qual o nome do paciente que deseja pesquisar? ");
		if(lp.pesquisar(new Paciente(nome)) != null){
			
			showMessageDialog(getRootFrame(), lp.pesquisar(new Paciente(nome)));
		}else {
			showMessageDialog(getRootFrame(), "Esse paciente não existe!");

		}
	}
	
	private static void listar() {
		String aux = lp.imprimir();
		
		showMessageDialog(getRootFrame(), aux);
	}
	
}
