package parteB;

public class TesteB {
	public static void main(String[] args) {
		Curso curso = new Curso("Sistema para Internet", 001);
		Curso curso2 = new Curso("Redes de Computadores", 001);
		Curso curso3 = new Curso("Analise e Desenvolvimento de Sistemas", 002);
		
		if (curso.getCodigoCurso().equals(curso3.getCodigoCurso())) {
			System.out.println("Cursos Iguais.");
		}else {
			System.out.println("Cursos Diferentes.");
		}
	}
}
