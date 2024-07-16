package contaBancaria;

import java.util.Scanner;

public class ContaBancariaTerminal {

	public static void main(String args[]) {
		
		ContaBancoUsuário user = new ContaBancoUsuário();
		ControlerContaBancaria ccBanco = new ControlerContaBancaria();
		
		Scanner digite = new Scanner(System.in);
		
		System.out.print("Por favor, Digite o Nome do Usuário: ");
		user.setNomeUsuario(digite.next());
		
		System.out.print("Por favor, Digite a Agência: ");
		user.setAgencia(digite.next());
		
		
		System.out.print("Por favor, Digite o Número da Conta: ");
		user.setNumConta(digite.next());
		
		System.out.print("Por favor, Digite o Saldo Que Será Depositado? ");
		user.setSaldo(digite.nextDouble());
		
		System.out.print("Você deseja realizar um saque?");
		String saque = digite.next();
		System.out.println(user.dadosContaUsuario());
		
		if(saque.equals("s") || saque == "sim" || saque == "Sim" || saque == "SIM") {
			System.out.print("Qual Valor do Saque? ");
			int vlSaque = digite.nextInt();
			System.out.println(ccBanco.saqueConta(user.getAgencia(), user.getNumConta(), vlSaque, user.getSaldo()));
		}
		digite.close();
		
		
		
		
		}
	}