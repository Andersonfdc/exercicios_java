package exercicio_01;

import java.util.Locale;
import java.util.Scanner;

public class ex {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		double raio;
		double pi = 3.14159;
		double area;
		
		System.out.println("Digite o valor do raio: ");
			raio = ler.nextDouble();
			
		area = pi * (Math.pow(raio, 2));
		
		System.out.printf(" a area eh: %.4f%n", area);
	}

}
