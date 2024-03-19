package contaHeranca;

public class ContaHeranca {
	 		 
		private int numero;
		private double saldo;
		
		// metodo construtor
		public ContaHeranca() {
			System.out.println("A conta vazia foi criada!");
		}
		public ContaHeranca(int numero, double saldo) {
			this.numero = numero;
			this.saldo = saldo;
		}
					
		public ContaHeranca(int numero) {
			this.numero = numero;
			this.saldo = 1;
			System.out.println("Seu saldo inicial é: "  + this.saldo 
					+ " " + " na sua conta de numero: " + this.numero);
		}
		
		
		public boolean sacar(double val) {
			if(this.saldo >= val) {
				this.saldo = this.saldo - (val * 1.01);
				return true;
			} else {
				System.out.println("Não tem saldo!");
				return false;
			}
		}
		public boolean depositar (double val) {
			if(val < 0) {
				return false;
				
			} else { 
				this.saldo = this.saldo + (val * 1.01);
				return true;
			}
				
		}
		//retorna os estados do objeto conta 
		public int getNumero() {
			return numero;
		}
		public void setNumero(int numero) {
			this.numero = numero;
		}
		public double getSaldo() {
			return saldo;
		}
		public void setSaldo(double novoSaldo) {
			this.saldo = novoSaldo;
		}
		
}