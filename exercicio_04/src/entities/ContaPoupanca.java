package entities;

public class ContaPoupanca extends Conta {

	@Override
	public void addCont(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}
	
	public void resgate(int mes, double juros) {
		
		Double juros_c = mes * (juros/100);
		Double corretagem = getSaldo_conta() * (juros_c) ; 
		depositar(corretagem);		
	}
	
	

}
