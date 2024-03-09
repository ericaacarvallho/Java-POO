package contaHeranca;

public class ContaHeranca {
	 		 
		int numero;
		double saldo;
			
		boolean sacar(double val) {
			if(this.saldo >= val) {
				this.saldo = this.saldo - val;
				return true;
			} else {
				System.out.println("Não tem saldo!");
				return false;
			}
		}
		boolean depositar (double val) {
			if(val < 0) {
				return false;
				
			} else { 
				this.saldo = this.saldo + val;
				return true;
			}
				
	}
		double getSaldo() {
			return this.saldo;
			
	    }	 
}
