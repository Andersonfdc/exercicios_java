package entities;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrente extends Conta {

	@Override
	public void addCont(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	private List<Extrato> banco = new ArrayList<>();
	
	public void addBanco(Extrato banco) {
		this.banco.add(banco);
	}
	
	public List<Extrato> getBanco() {
		return banco;
	}
	
	
}
