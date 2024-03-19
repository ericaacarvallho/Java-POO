package contaHeranca;

public class ContaInvestimento extends ContaHeranca {
	private double taxa;
	private int prazo;
	
	public ContaInvestimento() {
		System.out.println("Conta Investimento criada vazia a seu dispor");
	}	
	
	public ContaInvestimento(int numero, double saldo, double taxa, int prazo) {
		super(numero, saldo);
		this.taxa = taxa;
		this.prazo = prazo;
	}


	public ContaInvestimento(double taxa, int prazo) {
		super();
		this.taxa = taxa;
		this.prazo = prazo;
	}

	public boolean sacarInvest(double val) {
		if(getSaldo() >= val) {
			double novoSaldo = getSaldo() - (val * 1.01);
			setSaldo(getSaldo());
			return true;
		} else {
			System.out.println("Não tem saldo!");
			return false;
		}
	}
	public boolean depositar (double val) {
		if(getSaldo() < 0) {
			double novoSaldo = getSaldo() + (val * 1.01);
			setSaldo(getSaldo());
			return false;			
		} else { 
			System.out.println("Deposito efetuado com sucesso");
			return true;
		}
	
	}
	public void AplicarRendimento (double taxa) {
		setSaldo(getSaldo() * ( 1 + (taxa/100)));
		
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public int getPrazo() {
		return prazo;
	}

	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}
	
		
	}
	
	

