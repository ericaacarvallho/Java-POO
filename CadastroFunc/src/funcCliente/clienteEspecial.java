package funcCliente;

import java.time.LocalDate;
import java.time.Period;

public class clienteEspecial extends pessoa {
	String codigo;
	String profissao;
	int idade;
	
	public clienteEspecial(String nome, String dataNascimento, String endereço, String telsContato, String cargo,
			String codigo, String profissao) {
		super(nome, dataNascimento, endereço, telsContato, cargo);
		this.codigo = codigo;
		this.profissao = profissao;
		
	}
	
	public void cadastrar(clienteEspecial especial) {
		System.out.println("Cliente cadastrado com sucesso");
		System.out.println("Nome: " + especial.nome);
		System.out.println("Data De Nascimento: " + especial.dataNascimento);
		System.out.println("Idade: " + obterIdade(especial.dataNascimento));
	}
	
	public int obterIdade(String dataDeNascimento) {
		LocalDate dtnasc = LocalDate.parse(dataDeNascimento);
		LocalDate dtAtual = LocalDate.now();
		this.idade = (Period.between(dtnasc, dtAtual).getYears());
		return this.idade;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getProfissao() {
		return this.profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	

}
