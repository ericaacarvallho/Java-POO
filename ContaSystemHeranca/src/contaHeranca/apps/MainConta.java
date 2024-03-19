package contaHeranca.apps;

import java.util.Scanner;

import contaHeranca.*;


public class MainConta {
	public static void main(String[] args) {
		Scanner cc = new Scanner(System.in);
		
		// Criar conta
		ContaHeranca x;
		x = new ContaHeranca();
		
		ContaHeranca y, z;
		y = new ContaHeranca(2,2);
		z = new ContaHeranca(3);
			
		ContaEspecial cEspc2  = new ContaEspecial(321, 1000, 2000 );
		
		ContaInvestimento invest1 = new ContaInvestimento();
		ContaInvestimento invest2 = new ContaInvestimento(002, 10000, 1, 30);
		
		System.out.println("Saldo de conta especial: " + cEspc2.getSaldo());
		System.out.println("Limite de conta especial: " + cEspc2.getLimite());
		
		System.out.println("Saldo atual da conta especial é: " + cEspc2.getSaldo());
		System.out.println("Vamos depositar 1000 conto!");
		cEspc2.depositar(1000);
		System.out.println("Saldo após depósito da conta especial é: " + cEspc2.getSaldo());
		

		System.out.println("Saldo atual da conta especial é: " + invest2.getSaldo());
		System.out.println("Vamos depositar 1000 conto!");
		invest2.depositar(1000);
		System.out.println(" Saldo após depósito da conta especial é: " + cEspc2.getSaldo());
		
		
		
		
			
		
		//ATRIBUIR VALORES AOS ESTADOS
		//System.out.println("Digite o numero da conta:");
		//x.numero = cc.nextInt();
		//x.saldo = 1000;
		
		//System.out.println("Quanto voce quer sacar?");
		//x.sacar(cc.nextDouble());
		//System.out.println("Seu saldo inicial é: ");
		//System.out.println(x.getSaldo()); 
		
		//if(x.sacar(cc.nextDouble())){
			//System.out.println();
		//} else {
			//System.out.println("Nao tem saldo");
		//}	
	}
}
		
	