package funcCliente;

import java.time.LocalDate;
import java.time.Period;

public class Funcionario extends pessoa {
	int matricula;
	double salario;
	String dataDeAdmissao;
	int idade;
	String cargo;
	
	public Funcionario(String nome, String dataNascimento, String endereço, String telsContato, String cargo,
			int matricula, double salario, String dataDeAdmissao) {
		super(nome, dataNascimento, endereço, telsContato);
		this.matricula = matricula;
		this.salario = salario;
		this.dataDeAdmissao = dataDeAdmissao;
		this.cargo = cargo;
	}
	
	public void cadastrar(Funcionario func) {
		System.out.println("Funcionario cadastrado com sucesso");
		System.out.println("Nome: " + func.nome);
		System.out.println("Data De Nascimento: " + func.dataNascimento);
		System.out.println("Matricula: " + func.matricula);
		System.out.println("Cargo: " + func.cargo);
		
		
		
	}
	
	public double reajustarSalario(double salario, int perc) {
		System.out.println(salario + "-" + perc);
		this.salario += salario * perc / 100;
		return this.salario;
		
	}
	
	public void promoverCargo(String cargo) {
		this.cargo = cargo;
		
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDataDeAdmissao() {
		return dataDeAdmissao;
	}

	public void setDataDeAdmissao(String dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
	}
	
		
}





