package application;

import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Aluno[] quarto = new Aluno[10];
		
		System.out.print("Quantos quartos serao alugados: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print("Informe seu nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println(" ");
			
			System.out.print("Informe seu email: ");
			String email = sc.nextLine();
			System.out.println(" ");
			
			System.out.print("Informe o numero do quarto: ");
			int numQuarto = sc.nextInt();
			System.out.println(" ");
			
			quarto[numQuarto] = new Aluno(nome, email, numQuarto);
		}
		
		/*
		 * for(int j = 0; j < quarto.length; j++) {
		 *	if (quarto[j] != null) {
		 *		System.out.println("Nome: " + quarto[j].getNome());
		 *		System.out.println("Email: " + quarto[j].getEmail());
		 *		System.out.println("Numero do quarto: " + quarto[j].getNumQuarto());
		 *	}
		 * }
		 */
		
		for(Aluno qrt : quarto) {
			if (qrt != null) {
				System.out.println("Nome: " + qrt.getNome());
				System.out.println("Email: " + qrt.getEmail());
				System.out.println("Numero do quarto: " + qrt.getNumQuarto());
			}
		}
		sc.close();

	}

}
