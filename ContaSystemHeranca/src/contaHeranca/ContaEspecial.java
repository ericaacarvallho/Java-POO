package contaHeranca;

public class ContaEspecial extends ContaHeranca {
	double limite;
	
	public ContaEspecial(double limite) {
		super();
		this.limite = limite;
	}
	
	public ContaEspecial(int numero, double saldo, double limite) {
		super(numero, saldo);
		this.limite = limite;
		
	}
	
	public boolean sacarEspec(double val) {
		if(getSaldo() >= val) {
			double novoSaldo = getSaldo() - val;
			setSaldo(novoSaldo);
			return true;
		} else {
			System.out.println("Não tem saldo!");
			return false;
		}
	}
	
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
}

	
	
	
