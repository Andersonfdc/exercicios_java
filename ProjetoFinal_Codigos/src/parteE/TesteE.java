package parteE;

import java.util.ArrayList;
import java.util.List;

import parteD.ProfessorAdjunto;
import parteD.ProfessorTitular;

public class TesteE {
	public static void main(String[] args) {
		
		ProfessorTitular titular = new ProfessorTitular("Felipe", "Costa", 5, 10100, "POO");
		ProfessorAdjunto adjunto = new ProfessorAdjunto("Camilly", "ilva", 2, 10200, 40);
		System.out.println("----DADOS DO CURSO----");
		Curso curso = new Curso("Sistemas para Internet", 10010, 30);
		System.out.println("Nome do Curso............: " + curso.getNome());
		System.out.println("Prof. Titular............: " + titular.getNome() + " " + titular.getSobrenome());
		System.out.println("Prof. Adjunto............: " + adjunto.getNome() + " " + adjunto.getSobrenome());
		System.out.println("Codigo do Curso..........: " + curso.getCodigoCurso());
		System.out.println("Quantidade Max. de Alunos: " + curso.getQtdMaxAlunos());
		System.out.println();
		System.out.println("----ALUNOS MATRICULADOS----");
		List alunosMatriculados = new ArrayList<>();
		alunosMatriculados.add("George");
		alunosMatriculados.add("Luis");
		alunosMatriculados.add("Nadson");
		alunosMatriculados.add("Gustavo");
		alunosMatriculados.add("Bruno");
		System.out.println(alunosMatriculados);
	}

}
