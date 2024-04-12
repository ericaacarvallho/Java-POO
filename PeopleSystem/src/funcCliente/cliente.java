package funcCliente;

import java.time.LocalDate;
import java.time.Period;

import composicoes.*;

public class cliente extends pessoa {
	private String codigo;
	private profissao profissao;
	
	public cliente() {
		
	}		
	
	public cliente(String nome, LocalDate dataNascimento, endereco endereco, Telefone telsContato,
			String codigo, profissao profissao) {
		super(nome, dataNascimento, endereco, telsContato);
		this.codigo = codigo;
		this.profissao = profissao;		
	}
	
	public void cadastrar(cliente especial) {
		System.out.println("Cliente cadastrado com sucesso");
		
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public profissao getProfissao() {
		return profissao;
	}

	public void setProfissao(profissao profissao) {
		this.profissao = profissao;
	}
	
	
	

}
