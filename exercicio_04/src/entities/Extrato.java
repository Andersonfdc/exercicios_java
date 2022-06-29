package entities;

import java.util.Date;

public class Extrato {
	
	private double deposito;
	private String banco;
	private Date data;
	
	public Extrato(double deposito, String banco, Date data) {
		this.deposito = deposito;
		this.banco = banco;
		this.data = data;
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public Date getData() {
		return data;
	}
	
	public String toString() {
		return "\n" + "Deposito: " + deposito + "\n"
			  + " Banco: " + banco + "\n"
			  + " Data: " + data + "\n";
	}

}
