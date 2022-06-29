package parteH;

import java.util.ArrayList;
import java.util.List;

import parteA.Aluno;

public class TesteH {
	public static void main(String[] args) {
		Curso curso = new Curso("Sistemas para Internet", 10010, 10);
		Aluno aluno = new Aluno("George", "Martins", 03023326);
		System.out.println("Aluno poder ser adicionado?");
		curso.adicionarUmAluno(aluno);
		curso.adicionarUmAluno(aluno);
		curso.adicionarUmAluno(aluno);
		curso.adicionarUmAluno(aluno);
		curso.adicionarUmAluno(aluno);
		curso.adicionarUmAluno(aluno);
		curso.adicionarUmAluno(aluno);
		curso.adicionarUmAluno(aluno);
		curso.adicionarUmAluno(aluno);
		curso.adicionarUmAluno(aluno);
		curso.adicionarUmAluno(aluno);
		curso.adicionarUmAluno(aluno);
		curso.adicionarUmAluno(aluno);
		curso.adicionarUmAluno(aluno);
		curso.adicionarUmAluno(aluno);
		System.out.println(curso.adicionarUmAluno(aluno));
		
	}

}
