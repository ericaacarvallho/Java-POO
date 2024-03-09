package contaHeranca;

import java.util.Scanner;

public class MainConta {
	public static void main(String[] args) {
		Scanner cc = new Scanner(System.in);
		
		ContaHeranca x;
		x = new ContaHeranca();
		
		x.numero = cc.nextInt();
		x.saldo = 2000;
		
		System.out.println("Quanto voce quer sacar?");
		
		x.sacar(cc.nextDouble());
		System.out.println(x.getSaldo());
		
		}
	
}
