package parteD;

import parteC.Professor;

public class ProfessorTitular extends Professor{
	private String especialidade;
	
	//Construtor
	public  ProfessorTitular(String novoNome, String novoSobrenome, Integer novoTempoCasa, Integer novoCodigoProf, String novaEspecialidade) {
		super(novoNome, novoSobrenome, novoTempoCasa, novoCodigoProf);
		especialidade = novaEspecialidade;
	}
	
	//Getters e Setters
	public String getEspecialidade() {
	        return especialidade;
	}
	public void setEspecialidade(String especialidade) {
	        this.especialidade = especialidade;
	}

}
