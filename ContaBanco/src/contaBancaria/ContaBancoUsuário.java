package contaBancaria;

public class ContaBancoUsuário {
	
	String nomeUsuario;
	String agencia;
	String numConta;
	double saldo;
	
	
	public String getAgencia() {
		return agencia;
	}


	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}


	public String getNumConta() {
		return numConta;
	}


	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}


	
	
	public String getNomeUsuario() {
		return this.nomeUsuario;
	}
	
	public String dadosContaUsuario() {
		return String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque", 
				getNomeUsuario(), getAgencia(), getNumConta(), getSaldo());
	}

}
