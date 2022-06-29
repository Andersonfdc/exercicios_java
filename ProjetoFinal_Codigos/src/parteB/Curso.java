package parteB;

public class Curso {
	private String nome;
	private Integer codigoCurso;
	
	//Construtor
	public Curso (String novoNome, Integer novoCodigoCurso){
	        nome = novoNome;
	        codigoCurso = novoCodigoCurso;
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
}
