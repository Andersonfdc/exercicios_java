package exercicio_02;

import java.util.Scanner;

public class condicionais {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a;
		
		System.out.println("DIgite um numero inteiro: ");
			a = ler.nextInt();
			
		if (a<0) {
			System.out.println("O numero eh Negativo");
		} else {
			System.out.println("O numero eh Positivo");
		}
		
		ler.close();
	}	
}
