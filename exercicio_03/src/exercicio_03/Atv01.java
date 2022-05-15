package exercicio_03;

import java.util.Scanner;

public class Atv01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x;
		
		System.out.println("DIgite umumero de 0 a 1000");
			x = ler.nextInt();
			
		for(int i = 1; i <= x; i++)	{
			if (i%2 != 0) {
				System.out.println(i);
			}
		}
		
		
		
		ler.close();
		

	}

}
