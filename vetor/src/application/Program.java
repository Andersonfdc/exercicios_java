package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double soma = 0;
		double media;
		
		System.out.print("Digite o numero de notas: ");
		int n = sc.nextInt();
		double[] notas = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite a nota " + (i+1) + ": " );
			notas[i] = sc.nextDouble();
			
			soma += notas[i];
		}
		
		media = (double) soma/n;
		
		System.out.printf("A media eh: %.2f", media);
		
		sc.close();
	}

}
