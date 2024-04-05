package funcCliente;

import java.time.LocalDate;
import java.time.Period;

public class clienteEspecial extends pessoa {
	String codigo;
	String profissao;
	int idade;
	
	public clienteEspecial(String nome, String dataNascimento, String endereço, String telsContato,
			String codigo, String profissao) {
		super(nome, dataNascimento, endereço, telsContato);
		this.codigo = codigo;
		this.profissao = profissao;
		
	}
	
	public void cadastrar(clienteEspecial especial) {
		System.out.println("Cliente cadastrado com sucesso");
		System.out.println("Nome: " + especial.nome);
		System.out.println("Data De Nascimento: " + especial.dataNascimento);
		System.out.println("Idade: " + super.obteridade	(especial.dataNascimento));
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
