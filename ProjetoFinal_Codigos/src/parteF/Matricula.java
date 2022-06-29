package parteF;

import parteA.Aluno;
import parteE.Curso;

public class Matricula {
	private Aluno umAluno;
    private Curso umCurso;
 
    
    //Construtor
    public Matricula (Aluno novoUmAluno, Curso novoUmCurso){
        umAluno = novoUmAluno;
        umCurso = novoUmCurso;
    }
  
    //Getters e Setters
    public Aluno getUmAluno() {
        return umAluno;
    }
    public void setUmAluno(Aluno umAluno) {
        this.umAluno = umAluno;
    }
    public Curso getUmCurso() {
        return umCurso;
    }
    public void setUmCurso(Curso umCurso) {
        this.umCurso = umCurso;
    }

}
