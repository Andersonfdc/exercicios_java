package parteH;

import java.util.ArrayList;
import java.util.List;

import parteA.Aluno;
import parteD.ProfessorAdjunto;
import parteD.ProfessorTitular;

public class Curso {
	private String nome;
    private Integer codigoCurso;
    private ProfessorTitular profTitular;
    private ProfessorAdjunto profAdjunto;
    private Integer qtdMaxAlunos;
    private List<Aluno> alunosMatriculados = new ArrayList<>();
    
    //Construtor
    public Curso (String novoNome, Integer novoCodigoCurso, ProfessorTitular novoProfTitular, ProfessorAdjunto novoProfAdjunto, Integer novaQtdMaxAlunos, List novosAlunosMatriculados){
        nome = novoNome;
        codigoCurso = novoCodigoCurso;
        profTitular = novoProfTitular;
        profAdjunto = novoProfAdjunto;
        qtdMaxAlunos = novaQtdMaxAlunos;
        alunosMatriculados = novosAlunosMatriculados;
    }
   
    //Construtor
    public Curso (String novoNome, Integer novoCodigoCurso, Integer novaqtdMaxAlunos){
        nome = novoNome;
        codigoCurso = novoCodigoCurso;
        qtdMaxAlunos = novaqtdMaxAlunos;
    }
    
    //Metodos Add Aluno
    public boolean adicionarUmAluno(Aluno umAluno){
        if (alunosMatriculados.size() <= qtdMaxAlunos){
            alunosMatriculados.add(umAluno);
            return true;
        } else {
            return false;
        }
    }
    
    //Metodos Exckuir Aluno
    public void excluirAluno(Aluno umAluno) {
        alunosMatriculados.remove(umAluno);
    }
        
    //Getters e Setters
    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getCodigoCurso() {
		return codigoCurso;
	}
	public void setCodigoCurso(Integer codigoCurso) {
		this.codigoCurso = codigoCurso;
	}
	public ProfessorTitular getProfTitular() {
		return profTitular;
	}
	public void setProfTitular(ProfessorTitular profTitular) {
		this.profTitular = profTitular;
	}
	public ProfessorAdjunto getProfAdjunto() {
		return profAdjunto;
	}
	public void setProfAdjunto(ProfessorAdjunto profAdjunto) {
		this.profAdjunto = profAdjunto;
	}
	public Integer getQtdMaxAlunos() {
		return qtdMaxAlunos;
	}
	public void setQtdMaxAlunos(Integer qtdMaxAlunos) {
		this.qtdMaxAlunos = qtdMaxAlunos;
	}
	public List<Aluno> getAlunosMatriculados() {
		return alunosMatriculados;
	}
	public void setAlunosMatriculados(List<Aluno> alunosMatriculados) {
		this.alunosMatriculados = alunosMatriculados;
	}

}
