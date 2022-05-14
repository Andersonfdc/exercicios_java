package exercicio_02;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		 
		
		System.out.println("Digite o valor: ");
		int a = ler.nextInt();
		
		if (a%2 == 0) {
			System.out.println("o numero eh par");
		} else {
			System.out.println("o numero eh impar");
		}
		
		
		ler.close();

	}

}
