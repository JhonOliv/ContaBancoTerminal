package contaBancaria;

import java.util.Scanner;

public class ContaBancariaTerminal {

	public static void main(String args[]) {
		
		ContaBancoUsuário user = new ContaBancoUsuário();
		
		Scanner digite = new Scanner(System.in);
		
		System.out.print("Por favor, Digite o Nome do Usuário: ");
		user.setNomeUsuario(digite.next());
		
		System.out.print("Por favor, Digite a Agência: ");
		user.setAgencia(digite.next());
		
		
		System.out.print("Por favor, Digite o Número da Conta: ");
		user.setNumConta(digite.next());
		
		System.out.print("Por favor, Digite o Saldo Que Será Depositado? ");
		user.setSaldo(digite.nextDouble());
		digite.close();
		
		System.out.print(user.dadosContaUsuario());
		
		
		}
	}