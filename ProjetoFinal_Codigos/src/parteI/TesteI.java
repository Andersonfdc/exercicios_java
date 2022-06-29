package parteI;

public class TesteI {
	public static void main(String[] args) {
		
		Coordenador coordenador = new Coordenador();

//      Registro de professores
        coordenador.registrarProfessorTitular("Lordao", "Martins", 10, "Analise e Desenvolvimento de Sistemas");
        coordenador.registrarProfessorTitular("Ludmila", "Lima", 20, "Cienncia da Computacao");
        coordenador.registrarProfessorAdjunto("Dhiego", "Silva", 100, 20);
        coordenador.registrarProfessorAdjunto("Fernanda", "Oliveira", 200, 30);		
        
//      Registro de cursos
        coordenador.registrarCurso("Analise e Desenvolvimento de Sistemas", 4001, 3);
        coordenador.registrarCurso("Ciencia da Computacao", 2001, 2);

//      Alocacao de professores
        coordenador.alocarProfessores(4001, 10, 100);
        coordenador.alocarProfessores(2001, 20, 200);

//      Matriculas em Analise e Desenvolvimento de Sistemas
        coordenador.matricularAluno("Nadson", "Fernades", 1000);
        coordenador.matricularAluno("George", "Martins", 2000);
        coordenador.matricularAluno("Luis", "Filho", 3000);
        coordenador.matricularAluno(1000, 4001);
        coordenador.matricularAluno(2000, 4001);
        coordenador.matricularAluno(3000, 4001);

//      Matriculas em Cienncia da Computacao
        coordenador.matricularAluno("Quinteiro", "Belem", 4000);
        coordenador.matricularAluno("Kelly", "Silva", 5000);
        coordenador.matricularAluno("Rafa", "Leao", 6000);
        coordenador.matricularAluno(4000, 2001);
        coordenador.matricularAluno(5000, 2001);
        coordenador.matricularAluno(6000, 2001);
		
	}

}
