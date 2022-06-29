package parteA;

public class TesteA {
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("George", "Martins", 03023326);
		Aluno aluno2 = new Aluno("Luiz", "Filho", 03023342);
		Aluno aluno3 = new Aluno("Nadson", "Fernandes", 03023342);
		
		if (aluno2.getCodigoAluno().equals(aluno3.getCodigoAluno())) {
			System.out.println("Alunos Iguais.");
		} else {
		System.out.println("Alunos Diferentes.");
		}
	}	
}
