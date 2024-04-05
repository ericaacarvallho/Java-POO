package funcCliente;

import java.time.LocalDate;
import java.time.Period;

public class pessoa {
	String nome;
	String dataNascimento;
	String endereço;
	String telsContato;
	int idade;
		
	public pessoa(String nome, String dataNascimento, String endereço, String telsContato) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereço = endereço;
		this.telsContato = telsContato;
		
	}

	public void cadastrar(String nome, int matricula, String dataNascimento, String endereço, String telsContato, String cargo,
			boolean salario, double dataDeAdmissão ) {
			
	}	
	
	public int obteridade(String dataNascimento) {
		LocalDate dtnasc = LocalDate.parse(dataNascimento);
		LocalDate dtAtual = LocalDate.now();
		this.idade = (Period.between(dtnasc, dtAtual).getYears());
		return this.idade;
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getTelsContato() {
		return telsContato;
	}

	public void setTelsContato(String telsContato) {
		this.telsContato = telsContato;
	}

	
}
