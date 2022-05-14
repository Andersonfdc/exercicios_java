package exercicio_03;

import java.util.Scanner;

public class RepeticaoWhile {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a = 0;
		int b = 0;
		System.out.println("Digite o valor de A");
			a = ler.nextInt();
		System.out.println("Digite o valor de B");
			b = ler.nextInt();
		while (a != b) {

			if (a < b) {
				System.out.println("Crecente");
			} else {
				System.out.println("Decrecente");
			}
			
			a = ler.nextInt();
			b = ler.nextInt();
		}

		ler.close();

	}

}
