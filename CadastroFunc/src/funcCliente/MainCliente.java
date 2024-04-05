package funcCliente;

import java.util.Scanner;

public class MainCliente {
	public static void main(String[] args ) {
		Scanner cc = new Scanner(System.in);
		
		clienteEspecial especial  = new clienteEspecial("Neto", "1985-02-22", "Rua Rio mar", "91234-5645", "3345", "Dev");
		Funcionario func = new Funcionario("Anderson", "12/07/2005", "Rua do vale", "95555-8888", "Dev", 12345, 1500, "25/02/2024");
		especial.cadastrar(especial);	
		func.cadastrar(func);
		
		//reajuste salarial
		System.out.println("Salario atual: " + func.salario);
		System.out.println("Digite o percentual de reajuste: ");
		int percReajuste = cc.nextInt();
		double salarioNovo = func.reajustarSalario(func.salario, percReajuste);
		System.out.println("Novo salario é: " + salarioNovo);
	}

}
