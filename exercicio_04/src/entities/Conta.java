package entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
	
	private Double valor;
	private Double saldo_conta =  0.0;
	
	
	
	public Double getSaldo_conta() {
		return saldo_conta;
	}

	public void setSaldo_conta(Double saldo_conta) {
		this.saldo_conta += saldo_conta;
	}

	public void depositar(Double valor) {
		saldo_conta += valor;
	}
	
	public void sacar (Double valor) {
		this.saldo_conta -= valor;
	}

	public void addCont(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	

}
