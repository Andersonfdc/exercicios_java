package funcoesString;

public class Exercicio_01 {

	public static void main(String[] args) {

		
		
		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		//FORMATAR
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		
		//RECORTAR
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		
		//SUBSTITUIR
		String s06 = original.replace("a", "x");
		String s07 = original.replace("abc", "xy");
		
		//BUSCAR
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("Substring: -" + s04 + "-");
		System.out.println("Substring2: -" + s05 + "-");
		System.out.println("replace: -" + s06 + "-");
		System.out.println("replace2: -" + s07 + "-");
		System.out.println("indexOf: -" + i + "-");
		System.out.println("lastIndexOf: -" + j + "-");
		
		//str.Split("")
		
		String s = "potato apple lemon";
		
		String[] vect = s.split(" ");
		
		for(int x = 0; x < 3; x++) {
			
			System.out.println(vect[x]);
			
		}
		
		
		
                                                                   
	}

}
