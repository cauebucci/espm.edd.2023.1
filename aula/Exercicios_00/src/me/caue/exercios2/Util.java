package me.caue.exercios2;

import java.util.Random;
import java.util.Scanner;

public class Util {
	Random gerador = new Random();
	int n = 0;
	
	Conta conta[] = new Conta[10];
	
	Scanner teclado = new Scanner(System.in);
	
	public void menu() {
		int opc = 0;
		System.out.println("");
		System.out.println("1- Abrir conta");
		System.out.println("2- Acessar conta");
		System.out.println("3- Finalizar");
		System.out.println();
		System.out.print("Qual das opções você deseja? ");
		opc = teclado.nextInt();
		teclado.nextLine();
		limparTela();
		if(opc < 1 || opc > 3) {
			System.out.println("Esta opção não existe! Tente novamento.");
		}else {
			if(opc == 1) {
				abrirConta();
			}else if(opc == 2) {
				
				acessarConta();
			}else if(opc == 3) {
				return;
			}
		}
	}
	
	public void limparTela() {
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
	}
	
	
	
	public void abrirConta() {
		if(n == 10) {
			System.out.println("Número máximo de contas atíngido.");
		}else {
			conta[n] = new Conta();
			conta[n].numero = gerador.nextInt(10000, 99999);
			System.out.println("Seja bem-vindo ao Banco X. Para podermos abrir sua conta iremos coletar algumas informações! ;)");
			System.out.print("\nQual seu nome? ");
			conta[n].nome = teclado.nextLine();
			System.out.print("\nQual seu cpf? ");
			conta[n].cpf = teclado.nextLine();
			System.out.print("\nDigite uma senha númerica de 4 dígitos: ");
			conta[n].senha = teclado.nextInt();
			limparTela();
			
			System.out.println("Conta criada com sucesso, " + conta[n].nome + "!");
			System.out.println("Segue seus dados de acesso: ");
			System.out.println("   Número da conta: " + conta[n].numero);
			System.out.println("   Agência: 8722");
			System.out.println("   Senha: ****");
			System.out.println("");
			System.out.println("Obrigado por escolher o Banco X.");
			System.out.println("");
			System.out.println("Precione ENTER para sair.");
			teclado.nextLine();
			teclado.nextLine();
			limparTela();
			n++;
			
		}
	}
	
	public void acessarConta() {
		System.out.println("Banco X - Acesso a Conta");
		int nConta = 0;
			System.out.print("Número da conta: ");
			nConta = teclado.nextInt();
			if(verificarExistencia(n, nConta) == -1) {
				limparTela();
				System.out.println("Essa conta não existe.");
				
				System.out.println("\nPrecione ENTER para sair.");
				teclado.nextLine();
				teclado.nextLine();
				limparTela();
			}else {
				System.out.print("Digite a senha: ");
				int senha = teclado.nextInt();
				if(!conta[verificarExistencia(n, nConta)].validar(senha)) {
					System.out.println("Senha incorreta.");
					
					System.out.println("\nPrecione ENTER para sair.");
					teclado.nextLine();
					teclado.nextLine();
					limparTela();
				}else {
					int opc;
					limparTela();
					do {
						
						System.out.println("Seja bem-vindo, " + conta[verificarExistencia(n, nConta)].nome + "!");
						System.out.println("");
						System.out.println("Seu saldo é de R$" + String.format("%.2f", conta[verificarExistencia(n, nConta)].saldo));
						System.out.println();
						System.out.println("1- Sacar");
						System.out.println("2- Depositar");
						System.out.println("3- Sair");
						System.out.println("");
						System.out.print("Qual opção deseja? ");
						opc = teclado.nextInt();
						limparTela();
						if(opc < 1 || opc > 3) {
							System.out.println("Esta opção não existe! Tente novamento.");
						}else {
							if(opc == 1) {
								double valor;
								System.out.print("Qual o valor deseja sacar? ");
								valor = teclado.nextDouble();
								if(conta[verificarExistencia(n, nConta)].saldo < valor) {
									limparTela();
									System.out.println("Você não tem esse valor na conta!");
								}else {
									conta[verificarExistencia(n, nConta)].saque(valor);
									limparTela();
									System.out.println("Valor sacado com sucesso!");
								}
							}else if(opc == 2) {
								double valor;
								System.out.print("Qual o valor deseja depositar? ");
								valor = teclado.nextDouble();
								conta[verificarExistencia(n, nConta)].deposito(valor);
								limparTela();
								System.out.println("Valor depositado com sucesso!");

							}else if(opc == 3) {
								return;
							}
						}
					}while(true);
					
					
					
				}
			}
	}
	
	public int verificarExistencia(int n, int Nconta) {
		int id = -1;
		for (int i = 0; i < n; i++) {
			if(Nconta == conta[i].numero) {
				id = i;
			}
		}
		return id;
	}
}
