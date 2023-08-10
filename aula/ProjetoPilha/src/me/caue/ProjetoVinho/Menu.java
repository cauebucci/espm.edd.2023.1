package me.caue.ProjetoVinho;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.getRootFrame;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Menu {
	public static void abrir() {
		boolean programa = true;
		do {
			boolean opcS = true;
			int opca = 0;
			do {
				String opc = showInputDialog("Qual opção deseja?\n\n1. Cadastrar Vinho\n2. Vinho para ocasiões especiais\n3. As 5 aquisições mais antigos\n4. Finalizar programa");
				if(!opc.matches("[0-9]+")) {
					showMessageDialog(getRootFrame(), "Opção inválida!");
				}else {
					opca = parseInt(opc);
					if(opca < 1 || opca > 4) {
						showMessageDialog(getRootFrame(), "Opção inválida!");
					}else {
						opcS = false;
					}
				}	
			}while(opcS);
			
			if(opca == 1) {
				String nome = showInputDialog("Qual o nome do vinho?");		
				int safra = parseInt(showInputDialog("Qual o ano da Safra?"));
				Util.cadastrarVinho(nome, safra);
			}else if(opca == 2) {
				Vinho aux = Util.ocasiaoEspecial();
				
				if(aux == null) {
					showMessageDialog(getRootFrame(), "Nenhum vinho adicionado!");
				}else {
					showMessageDialog(null, aux);

				}
			}else if(opca == 3) {
				Vinho[] listaVinhos = Util.maisAntigos(5);
				
				if(listaVinhos == null) {
					showMessageDialog(getRootFrame(), "Nenhum vinho adicionado!");
				}else {
					String vinho = "";
					for (int i = 0; i < listaVinhos.length; i++) {
						vinho += listaVinhos[i];
						
					}
					showMessageDialog(null, vinho);
				}
				
				
				
			}else {
				showMessageDialog(getRootFrame(), "Programa finalizado com sucesso!");
				break;
			}
			
		}while(programa);
	}
}
