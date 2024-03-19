package funcCliente;

public class pessoa {
	String nome;
	String dataNascimento;
	String endereço;
	String telsContato;
	String cargo;	
		
	public pessoa(String nome, String dataNascimento, String endereço, String telsContato, String cargo) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereço = endereço;
		this.telsContato = telsContato;
		this.cargo = cargo;
	}

	public void cadastrar(String nome, int matricula, String dataNascimento, String endereço, String telsContato, String cargo,
			boolean salario, double dataDeAdmissão ) {
			
	}	
	
	public void obteridade(String dataNascimento) {
		
	}
	
	public void reajustarSalario(boolean salario) {
		
	}
	
	public void promoverCargo(String cargo) {
		
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

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	

}
