package funcCliente;

public class MainCliente {
	public static void main(String[] args ) {
		clienteEspecial especial  = new clienteEspecial("Neto", "1985-02-22", "Rua Rio mar", "91234-5645", "Dev", "3345", "Dev");
		Funcionario func = new Funcionario("Anderson", "12/07/2005", "Rua do vale", "95555-8888", "Dev", 12345, 1500, "25/02/2024");
		especial.cadastrar(especial);	
	}

}
