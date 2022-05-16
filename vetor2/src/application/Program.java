package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double soma = 0;

		
		System.out.print("Quantos produtos deseja adicionar: ");
		int n = sc.nextInt();
		Product[] lista = new Product[n];
		
		
		
		for (int i = 0; i < lista.length; i++) {
			System.out.print("Digite o nome do produto: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Digite o preco do produto: ");
			double preco = sc.nextDouble();
			
			
			lista[i] = new Product(nome, preco);
			
			soma += lista[i].getPreco();
			
		}
		
		for(int j = 0; j < lista.length; j++) {
			System.out.println("Nome: " + lista[j].getNome());
			System.out.printf("Preco do produto: %.2f" , lista[j].getPreco());
			System.out.println(" ");
		}
		
		System.out.printf("O valor das compras foi: %.2f",soma);
		sc.close();
	}

}
