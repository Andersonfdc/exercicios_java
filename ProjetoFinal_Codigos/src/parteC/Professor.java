package parteC;

public class Professor {
	 private String nome;
	 private String sobrenome;
	 private Integer tempoCasa;
	 private Integer codigoProf;
	
	 //Construtor
	 public Professor (String novoNome, String novoSobrenome, Integer novoTempoCasa, Integer novoCodigoProf){
	        nome = novoNome;
	        sobrenome = novoSobrenome;
	        tempoCasa = novoTempoCasa;
	        codigoProf = novoCodigoProf;
	 }

	//Getters e Setters
	 public String getNome() {
	        return nome;
	 }
	 public void setNome(String nome) {
	        this.nome = nome;
	 }
	 public String getSobrenome() {
	        return sobrenome;
	 }
	 public void setSobrenome(String sobrenome) {
	        this.sobrenome = sobrenome;
	 }
	 public Integer getTempoCasa() {
	        return tempoCasa;
	 }
	 public void setTempoCasa(Integer tempoCasa) {
	        this.tempoCasa = tempoCasa;
	 }
	 public Integer getCodigoProf() {
	        return codigoProf;
	 }
	 public void setCodigoProf(Integer codigoProf) {
	        this.codigoProf = codigoProf;
	 }
}
