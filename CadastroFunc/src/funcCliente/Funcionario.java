package funcCliente;

public class Funcionario extends pessoa {
	int matricula;
	double salario;
	String dataDeAdmissao;
	
	public Funcionario(String nome, String dataNascimento, String endereço, String telsContato, String cargo,
			int matricula, double salario, String dataDeAdmissao) {
		super(nome, dataNascimento, endereço, telsContato, cargo);
		this.matricula = matricula;
		this.salario = salario;
		this.dataDeAdmissao = dataDeAdmissao;
	}
	
	public void cadastrar(String nome, String dataNascimento, String endereço, String telsContato, String cargo,
			int matricula, double salario, String dataDeAdmissao) {
		
	}
	
	public void obterIdade(String DataDeNascimento) {
		
	}
	
	public void reajustarSalario(double salario) {
		
	}
	
	public void promoverCargo(String cargo) {
		
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





