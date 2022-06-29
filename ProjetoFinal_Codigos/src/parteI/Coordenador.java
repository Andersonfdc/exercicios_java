package parteI;

import java.util.ArrayList;
import java.util.List;

import parteA.Aluno;
import parteC.Professor;
import parteD.ProfessorAdjunto;
import parteD.ProfessorTitular;
import parteF.Matricula;
import parteH.Curso;

public class Coordenador {
	private List<Aluno> alunosNassau = new ArrayList<>();
    private List<Professor> professoresNassau = new ArrayList<>();
    private List<Curso> cursosNassau = new ArrayList<>();
    private List<Matricula> matriculasNassau = new ArrayList<>();
    
    //Metodo Registrar Curso
    public void registrarCurso(String nome, Integer codigoCurso, Integer qtdMaxAlunos){
        Curso novoCurso = new Curso(nome, codigoCurso, qtdMaxAlunos);
        cursosNassau.add(novoCurso);
    }
    
    //Metodo Excluir Curso
    public void excluirCurso(Integer codigoCurso){
        for (int i = 0; i < cursosNassau.size(); i++) {
            if (cursosNassau.get(i).getCodigoCurso().equals(codigoCurso)){
                cursosNassau.remove(cursosNassau.get(i));
                return;
            }
        }
    }
    
    //Metodo Registrar Professor Adjunto
    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProf, Integer qtdHorasMonitoria){
        ProfessorAdjunto umProfAdjunto = new ProfessorAdjunto(nome, sobrenome, 0, codigoProf, qtdHorasMonitoria);
        professoresNassau.add(umProfAdjunto);
    }
    
    //Metodo Registrar Professor Titular
    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProf, String especialidade){
        ProfessorTitular umProfTitular = new ProfessorTitular(nome, sobrenome, 0, codigoProf, especialidade);
        professoresNassau.add(umProfTitular);
    }
    
    //Metodo Excluir Professor
    public void excluirProfessor(Integer codigoProf){
        for (int i = 0; i < professoresNassau.size(); i++) {
            if (professoresNassau.get(i).getCodigoProf().equals(codigoProf)){
                professoresNassau.remove(professoresNassau.get(i));
                return;
            }
        }
    }
    
    //Metodo Matricular Aluno
    public void matricularAluno(String nome, String sobrenome, Integer codigoAluno){
        Aluno umAluno = new Aluno(nome, sobrenome, codigoAluno);
        alunosNassau.add(umAluno);
    }
    
    //Metodo Matricular Aluno II
    public void matricularAluno(Integer codigoAluno, Integer codigoCurso){
        Curso cursoEscolhido = null;
        Aluno alunoInteressado = null;
        for (int i = 0; i < cursosNassau.size(); i++) {
            if (cursosNassau.get(i).getCodigoCurso().equals(codigoCurso)){
                cursoEscolhido = cursosNassau.get(i);
                break;
            }
        }
        if (cursoEscolhido == null){
            System.out.println("Curso nao encontrado!");
            return;
        }
        for (int i = 0; i < alunosNassau.size(); i++) {
            if (alunosNassau.get(i).getCodigoAluno().equals(codigoAluno)){
                alunoInteressado = alunosNassau.get(i);
                break;
            }
        }
        if (alunoInteressado == null){
            System.out.println("Aluno nao encontrado!");
            return;
        }
        if (cursoEscolhido.adicionarUmAluno(alunoInteressado)){
            System.out.println("Matricula realizada! Seja bem-vindo a Nassau!");
        } else {
            System.out.println("Nao foi possivel realizar sua matriculan nao ha vagas!");
        }
    }  
    
    //Metodo Alocar Professores
    public void alocarProfessores (Integer codigoCurso, Integer codigoProfTitular, Integer codigoProfAdjunto){
        Professor profTitularAlocado = null;
        Professor profAdjuntoAlocado = null;
        Curso cursoSendoAlocado = null;
        for (int i = 0; i < professoresNassau.size(); i++) {
            if (professoresNassau.get(i).getCodigoProf().equals(codigoProfTitular)){
                profTitularAlocado = professoresNassau.get(i);
            }
            if (professoresNassau.get(i).getCodigoProf().equals(codigoProfAdjunto)){
                profAdjuntoAlocado = professoresNassau.get(i);
            }
            if (profTitularAlocado != null && profAdjuntoAlocado != null){
                break;
            }
        }
        if (profTitularAlocado == null){
            System.out.println("Professor titular nao existe!");
            return;
        }
        if (profAdjuntoAlocado == null){
            System.out.println("Professor adjunto nao existe!");
            return;
        }
        for (int i = 0; i < cursosNassau.size(); i++) {
            if (cursosNassau.get(i).getCodigoCurso().equals(codigoCurso)){
                cursoSendoAlocado = cursosNassau.get(i);
                break;
            }
        }
        if (cursoSendoAlocado == null){
            System.out.println("Curso nao existe!");
            return;
        }
        cursoSendoAlocado.setProfTitular((ProfessorTitular) profTitularAlocado);
        cursoSendoAlocado.setProfAdjunto((ProfessorAdjunto) profAdjuntoAlocado);
    }
}
