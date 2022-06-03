package exercicio_02;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int op;
		double valor = 0;1
		int qtd;
		double preco;
		
		System.out.println("Digite o cod: ");
			op = ler.nextInt();
		System.out.println("Digite a qtd: ");
			qtd = ler.nextInt();
		System.out.println("Digite a preco: ");
			preco = ler.nextInt();
			
		switch (op) {
			case 1:
				valor = qtd * preco;
				break;
			case 2:
				valor = qtd - preco;
				break;
				
		}
		
		System.out.printf("%.2f%n", valor);
		
		ler.close();
		
		

	}

}
