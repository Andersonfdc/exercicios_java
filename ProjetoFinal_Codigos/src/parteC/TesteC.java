package parteC;

public class TesteC {
	public static void main(String[] args) {
		
		Professor prof = new Professor("Farias","Silva", 10, 03021100);
		Professor prof2 = new Professor("Julio","Barroca", 8, 03021100);
		Professor prof3 = new Professor("Eduardo","Lesly", 3, 03021111);
		
		if (prof.getCodigoProf().equals(prof2.getCodigoProf())) {
			System.out.println("Professores Iguais.");
		}else {
			System.out.println("Professores Diferentes.");
		}
	}

}
