package parteD;

import parteC.Professor;

public class ProfessorAdjunto extends Professor{
	private Integer qtdHorasMonitoria;
	
	//Construtor
	public ProfessorAdjunto(String novoNome, String novoSobrenome, Integer novoTempoCasa, Integer novoCodigoProf, Integer novaQtdHorasMonitoria) {
		super(novoNome, novoSobrenome, novoTempoCasa, novoCodigoProf);
		qtdHorasMonitoria = novaQtdHorasMonitoria;
	}
	
	//Getters e Setters
	public Integer getQtdHorasMonitoria() {
	        return qtdHorasMonitoria;
    }
    public void setQtdHorasMonitoria(Integer qtdHorasMonitoria) {
	        this.qtdHorasMonitoria = qtdHorasMonitoria;
    }

}
