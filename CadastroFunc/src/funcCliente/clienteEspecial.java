package funcCliente;

public class clienteEspecial extends pessoa {
	String codigo;
	String profissao;
	
	public clienteEspecial(String nome, String dataNascimento, String endereço, String telsContato, String cargo,
			String codigo, String profissao) {
		super(nome, dataNascimento, endereço, telsContato, cargo);
		this.codigo = codigo;
		this.profissao = profissao;
		
	}
	
	public void cadastrar(String nome, String dataNascimento, String endereço, String telsContato, String cargo,
			String codigo, String profissao) {
		
	}
	
	public void obterIdade(String dataDeNascimento) {
		
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	

}
