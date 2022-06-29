package parteF;

import java.util.Date;
import parteA.Aluno;
import parteE.Curso;

public class TesteF {
	public static void main(String[] args) {
		Date data = new Date();
		System.out.println("----DATA DA MATRICULA----");
		data.setDate(06);
		data.setMonth(06);
		data.setYear(2022);
		System.out.println("Data da Matricula: " + data.getDate() +"/"+ data.getMonth() +"/"+ data.getYear());
		Aluno aluno = new Aluno("George", "Martins", 03023326);
		Curso curso = new Curso("Sistemas para Internet", 10010, 30);
		System.out.println();
		System.out.println("----MATRICULA----");
		System.out.println("Nome do Curso............: " + curso.getNome());
		System.out.println("Nome do Aluno............: " + aluno.getNome() + " " + aluno.getSobrenome());
		
	}

}
