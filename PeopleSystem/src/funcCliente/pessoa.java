package funcCliente;

import java.time.LocalDate;
import java.time.Period;

import composicoes.Telefone;
import composicoes.endereco;

public class pessoa {
	private String nome;
	private LocalDate dataNascimento;
	private endereco endereco;
	private Telefone telsContato;
	
	
	public pessoa() {
		System.out.println("Criando uma pessoa" + " sem atributos!");
	}
		
	public pessoa(String nome, LocalDate dataNascimento, endereco endereco, Telefone telsContato) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.telsContato = telsContato;
		
	}

	public void cadastrar(String nome, int matricula, String dataNascimento, endereco endereço, Telefone telsContato, String cargo,
			boolean salario, double dataDeAdmissão ) {
			
	}	
	
	public void obteridade(LocalDate dataNascimento) {
		int idade = 0;
		LocalDate dtAtual = LocalDate.now();
		Period periodo = Period.between(this.dataNascimento, dtAtual);
		idade = periodo.getYears();
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelsContato() {
		return telsContato;
	}

	public void setTelsContato(Telefone telsContato) {
		this.telsContato = telsContato;
	}

}
