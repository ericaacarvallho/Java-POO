package funcCliente;

import java.time.LocalDate;
import java.util.Scanner;
import composicoes.*;

public class MainCliente {
	public static void main(String[] args ) {
		cliente c1 = new cliente();
		endereco end1 = new endereco("Rua jordao leonidas de medeiros", "Numero end1", "Cep end1", "Bairro end1", "Cidade end1", "Estado end1", "Pais end1" );
		profissao prof1 = new profissao();
		prof1.setNomeProfissao("Dev");
		c1.setCodigo("1");
		c1.setNome("Anderson");
		c1.setDataNascimento(LocalDate.of(1990, 1, 2));
		c1.setEndereco(end1);
		System.out.println("Nome do cliente: " + c1.getNome());
		System.out.println("Profissão: " + prof1.getNomeProfissao());
		System.out.println("Rua do cliente: " + c1.getEndereco().getRua());
		end1.setRua("Mudei a rua do cliente padrao");
		c1.getEndereco().setRua("O cara mudou de rua");
		System.out.println("Rua cliente: " + c1.getEndereco().getRua());
		
		Funcionario f1 = new Funcionario();
		cargo car = cargo.ESTAGIARIO;
		f1.promoverCargo(car);
		f1.setMatricula(1234);
		f1.setNome("Erica");
		f1.setDataNascimento(LocalDate.of(1986,05, 17));
		f1.getCargo();
		f1.setSalario(1500);
		f1.setDataDeAdmissao(LocalDate.of(2024, 04, 05));
		System.out.println("Nome: " + f1.getNome());
		System.out.println("Matricula: " + f1.getMatricula());
		System.out.println("Data de Nascimento: " + f1.getDataNascimento());
		System.out.println("Cargo: " + f1.getCargo());
		System.out.println("Salario: " + f1.getSalario());
		System.out.println("Data de Admissao: " + f1.getDataDeAdmissao());
		
		
		
		
	}

}
