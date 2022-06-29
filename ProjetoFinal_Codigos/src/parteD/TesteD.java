package parteD;

public class TesteD {
	public static void main(String[] args) {
		
		ProfessorTitular titular = new ProfessorTitular("Felipe", "Costa", 5, 10100, "POO");
		System.out.println("---CADASTRO PROFESSOR TITULAR---");
		System.out.println("Nome Professor Titular....: " + titular.getNome());
		System.out.println("Sobrenome Professor Titular: " + titular.getSobrenome());
		System.out.println("Tempo de Casa.............: " + titular.getTempoCasa());
		System.out.println("Codigo Professor Titular..: " + titular.getCodigoProf());
		System.out.println("Especialidade.............: " + titular.getEspecialidade());
		System.out.println();
		ProfessorAdjunto adjunto = new ProfessorAdjunto("Camilly", "ilva", 2, 10200, 40);
		System.out.println("---CADASTRO PROFESSOR ADJUNTO---");
		System.out.println("Nome Professor Adjunto....: " + adjunto.getNome());
		System.out.println("Sobrenome Professor Adjunto: " + adjunto.getSobrenome());
		System.out.println("Tempo de Casa.............: " + adjunto.getTempoCasa());
		System.out.println("Codigo Professor Adjunto..: " + adjunto.getCodigoProf());
		System.out.println();
	}
}
