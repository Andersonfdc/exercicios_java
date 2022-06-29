package entities;

public class Cliente {
	
	private String nome;
	private Integer id_cliente;
	private Integer cpf;
	private Integer rg;
	
	
	public Cliente() {

	}
	
	public Cliente(String nome, Integer id_cliente, Integer cpf, Integer rg) {
		this.nome = nome;
		this.id_cliente = id_cliente;
		this.cpf = cpf;
		this.rg = rg;
	}


	public Integer getCpf() {
		return cpf;
	}


	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public Integer getId_cliente() {
		return id_cliente;
	}


	public Integer getRg() {
		return rg;
	}

	public String toString() {
		return "Nome: " + getNome() + "\n" 
			  +"ID: " + getId_cliente() + "\n"
		 	  +"CPF: " + getCpf()+ "\n"
		 	  +"RG: " + getRg() + "\n"; 
	}


	
	
	
	

}
