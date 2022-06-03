package application;

import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;
import entities.Extrato;

public class Teste {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor;
		
		Conta conta_corrente = new ContaCorrente();
		Conta conta_poupanca = new ContaPoupanca();
		
		System.out.println("Digite os dados do cliente");
		
		System.out.print("NOME: ");
		String nome = sc.nextLine();
		System.out.print("ID: ");
		int id_cliente = sc.nextInt();
		System.out.print("CPF: ");
		int cpf = sc.nextInt();
		System.out.print("RG: ");
		int rg = sc.nextInt();
		
		Cliente cliente = new Cliente(nome, id_cliente, cpf, rg);
		
		System.out.println("Onde deseja realizar primeiro deposito: ");
		System.out.println("1 - Conta Corrente");
		System.out.println("2 - Conta Poupanca");
		
		int op = sc.nextInt();
		

		switch (op) {
			case 1:
				System.out.println("Deposito: ");
				valor = sc.nextDouble();
				conta_corrente.depositar(valor);
				
				System.out.print("Saldo: " + String.format("%.2f",conta_corrente.getSaldo_conta()));
				System.out.println();
				System.out.println();
				break;
			
				
			case 2:
				System.out.println("Deposito: ");
				valor = sc.nextDouble();
				conta_poupanca.depositar(valor);
				
				System.out.print("Saldo: " + String.format("%.2f",conta_poupanca.getSaldo_conta()));
				System.out.println();
				System.out.println();
				break;
				
			default:
				System.out.println("OPCAO INVALIDA!!");
		}
		
		do {
		System.out.println("Qual conta voce deseja movimentar: ");
		System.out.println("1 - Conta Corrente");
		System.out.println("2 - Conta Poupanca");
		System.out.println("3 - sair");
		op = sc.nextInt();
		int opi;
		switch (op) {
			case 1:
				System.out.println("Qual movimentacao deseja realizar: ");
				System.out.println("1 - DEPOSITAR DINHEIRO: ");
				System.out.println("2 - DEPOSITAR CHEQUE: ");
				System.out.println("3 - SACAR: ");
				
				opi = sc.nextInt();
				
				switch(opi) {
					case 1:
						System.out.print("Digite o valor a ser depositado: ");
						valor = sc.nextDouble();
						conta_corrente.depositar(valor);
						System.out.print("Saldo: " + String.format("%.2f",conta_corrente.getSaldo_conta()));
						System.out.println();
						System.out.println();
						break;
					case 2:
						System.out.print("Digite o valor a ser depositado: ");
						valor = sc.nextDouble();
						System.out.println("Banco: ");
						sc.nextLine();					
						String banco = sc.nextLine();

						Date data = new Date();
						
						Extrato extrato = new Extrato(valor, banco, data);
						((ContaCorrente) conta_corrente).addBanco(extrato);
						
						conta_corrente.depositar(valor);
						System.out.print("Saldo: " + String.format("%.2f",conta_corrente.getSaldo_conta()));
						System.out.println();
						System.out.println();
						break;
					case 3:
						System.out.print("Digite o valor a ser sacado: ");
						valor = sc.nextDouble();
						if(conta_corrente.getSaldo_conta() < valor) {
							System.out.println("SALDO INSUFICIENTE");
							System.out.println();
							System.out.println();
						}else {
							conta_corrente.sacar(valor);
							System.out.print("Saldo: " + String.format("%.2f",conta_corrente.getSaldo_conta()));
							System.out.println();
							System.out.println();
						}
						break;
						
				}		
				
				break;
			case 2:
				System.out.println("Qual movimentacao deseja realizar: ");
				System.out.println("1 - DEPOSITAR: ");
				System.out.println("2 - SACAR: ");
				System.out.println("3 - RESGATAR: ");
				
				opi = sc.nextInt();
				
				switch(opi) {
					case 1:
						System.out.print("Digite o valor a ser depositado: ");
						valor = sc.nextDouble();
						conta_poupanca.depositar(valor);
						System.out.print("Saldo: " + String.format("%.2f",conta_poupanca.getSaldo_conta()));
						System.out.println();
						System.out.println();
						break;
					case 2:
						System.out.print("Digite o valor a ser sacado: ");
						valor = sc.nextDouble();
						if(conta_poupanca.getSaldo_conta() < valor) {
							System.out.println("SALDO INSUFICIENTE");
							System.out.println();
							System.out.println();
						}else {
							conta_poupanca.sacar(valor);
							System.out.print("Saldo: " + String.format("%.2f",conta_poupanca.getSaldo_conta()));
							System.out.println();
							System.out.println();
						}

						break;
					case 3:
						System.out.println("Dados do resgate: ");
						System.out.print("Quantidade de meses: ");
						int mes = sc.nextInt();
						System.out.print("Porcentagem: ");
						double juros = sc.nextInt();
						
						((ContaPoupanca) conta_poupanca).resgate(mes, juros);
						
						System.out.print("Saldo: " + String.format("%.2f",conta_poupanca.getSaldo_conta()));
						System.out.println();
						System.out.println();
						break;
				}
				
				break;
		}
		}while(op !=3);
		
		System.out.println(cliente);
		
		
		System.out.println("Extrato Cheque: " + ((ContaCorrente) conta_corrente).getBanco());
		
		
		System.out.println();
		System.out.print("Saldo Conta Corrente: " + String.format("%.2f",conta_corrente.getSaldo_conta()));
		System.out.println();
		System.out.print("Saldo Conta Poupanca: " + String.format("%.2f",conta_poupanca.getSaldo_conta()));
		
		sc.close();
	}

}
