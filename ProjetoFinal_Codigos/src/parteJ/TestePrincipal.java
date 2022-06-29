package parteJ;

import parteI.Coordenador;

public class TestePrincipal {
	public static void main(String[] args) {
		
	Coordenador nassauCoordenador = new Coordenador();
	System.out.println("------U  N  I  N  A  S  S  A  U------");
	System.out.println();
	
//  Registro de professores
	nassauCoordenador.registrarProfessorTitular("Lordao", "Martins", 10, "Analise e Desenvolvimento de Sistemas");
	nassauCoordenador.registrarProfessorTitular("Ludmila", "Lima", 20, "Ciencia da Computacao");
	nassauCoordenador.registrarProfessorAdjunto("Dhiego", "Silva", 100, 20);
	nassauCoordenador.registrarProfessorAdjunto("Fernanda", "Oliveira", 200, 30);	
		
//    Registro de cursos
    nassauCoordenador.registrarCurso("Analise e Desenvolvimento de Sistemas", 4001, 3);
    nassauCoordenador.registrarCurso("Ciencia da Computacao", 2001, 2);

//    Alocacao de professores
    nassauCoordenador.alocarProfessores(4001, 10, 100);
    nassauCoordenador.alocarProfessores(2001, 20, 200);

//    Matriculas em Analise e Desenvolvimento de Sistemas
    System.out.println("MATRICULA EM ANALISE E DESENVOLVIMENTO DE SISTEMAS");
    nassauCoordenador.matricularAluno("Nadson", "Fernades", 1000);
    nassauCoordenador.matricularAluno("George", "Martins", 2000);
    nassauCoordenador.matricularAluno("Luis", "Filho", 3000);
    nassauCoordenador.matricularAluno(1000, 4001);
    nassauCoordenador.matricularAluno(2000, 4001);
    nassauCoordenador.matricularAluno(3000, 4001);
    System.out.println();
    
//    Matriculas em Ciencia da Computacao
    System.out.println("MATRICULA EM CIENCIA DA COMPUTACAO");
    nassauCoordenador.matricularAluno("Quinteiro", "Belem", 4000);
    nassauCoordenador.matricularAluno("Kelly", "Silva", 5000);
    nassauCoordenador.matricularAluno("Rafa", "Leao", 6000);
    nassauCoordenador.matricularAluno(4000, 2001);
    nassauCoordenador.matricularAluno(5000, 2001);
    nassauCoordenador.matricularAluno(6000, 2001);

	}
}
