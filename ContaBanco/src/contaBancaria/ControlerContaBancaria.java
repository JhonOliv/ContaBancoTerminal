package contaBancaria;

public class ControlerContaBancaria {
	
	ContaBancoUsuário user = new ContaBancoUsuário();
	public String saqueConta(String agConta, String numConta, int valorSaque) {
		
		
		if (user.agencia.equals(agConta)&&user.numConta.equals(numConta)) {
			
			if(valorSaque > user.saldo) {
				return "Saldo insuficiente";
			}
			
			
			user.saldo -= valorSaque;	
		}
		
		return "Saque efetuado com sucesso";
	}

}
