package parteG;

import java.util.ArrayList;
import java.util.List;

import parteA.Aluno;

public class TesteG {
	public static void main(String[] args) {
	
		System.out.println("-----------LISTA DOS ALUNOS-----------");
		List alunos = new ArrayList();
		alunos.add("George");
		alunos.add("Luis");
		alunos.add("Nadson");
		alunos.add("Gustavo");
		alunos.add("Bruno");
		System.out.println(alunos);
		System.out.println();
		System.out.println("--------LISTA DOS PROFESSORES---------");
		List prof = new ArrayList();
		prof.add("Jonatas");
		prof.add("Pedro");
		prof.add("Henrique");
		prof.add("Camilyy");
		prof.add("Felipe");
		System.out.println(prof);
		System.out.println();
		System.out.println("-----------LISTA DOS CURSOS-----------");
		List cursos = new ArrayList();
		cursos.add("Analise e Desenvolvimento de Sistemas");
		cursos.add("Sistemas de Internet");
		cursos.add("Redes de Computadores");
		cursos.add("Ciencia da Computação");
		cursos.add("Teste de Software");
		System.out.println(alunos);
		System.out.println();
		System.out.println("---------LISTA DAS MATRICULAS---------");
		List matriculas = new ArrayList();
		matriculas.add("03023310");
		matriculas.add("03023320");
		matriculas.add("03023330");
		matriculas.add("03023340");
		matriculas.add("03023350");
		System.out.println(matriculas);
		System.out.println();
	}
	
}
