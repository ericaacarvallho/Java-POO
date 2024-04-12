package funcCliente;

import java.time.LocalDate;
import java.time.Period;

import composicoes.*;

public class Funcionario extends pessoa {
	private int matricula;
	private cargo cargo;
	private double salario;
	private LocalDate dataDeAdmissao;
	
	
	public Funcionario() {
		
	}

	public Funcionario(String nome, LocalDate dataNascimento, endereco endereço, Telefone telsContato, cargo cargo,
			int matricula, double salario, LocalDate dataDeAdmissao) {
		super(nome, dataNascimento, endereço, telsContato);
		this.matricula = matricula;
		this.cargo = cargo;
		this.salario = salario;
		this.dataDeAdmissao = dataDeAdmissao;
		
	}
	
	public void cadastrar(Funcionario func) {
		System.out.println("Funcionario cadastrado com sucesso");
		System.out.println("Matricula: " + func.matricula);
		System.out.println("Cargo: " + func.cargo);
				
	}
	
	public void reajustarSalario(double  percentual) {
		System.out.println(salario + "-" + percentual);
		this.salario = this.salario * (1 + (percentual / 100));
		
		
	}
	
	public void promoverCargo(cargo novoCargo) {
		this.cargo = novoCargo;
		
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

	public LocalDate getDataDeAdmissao() {
		return dataDeAdmissao;
	}

	public void setDataDeAdmissao(LocalDate dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
	}

	public cargo getCargo() {
		return cargo;
	}

		
}





