package contaBancaria;

public class ControlerContaBancaria {
	
	ContaBancoUsuário user = new ContaBancoUsuário();
	
	public String saqueConta(String agConta, String numConta, int valorSaque, double saldoUser) {
			
			if(valorSaque < saldoUser) {
				saldoUser -= valorSaque;
				user.setSaldo(saldoUser);
				return "Saque efetuado com sucesso  R$" + saldoUser;
				
			}else {
				return "Saldo insuficiente";							
			}
	}

}
