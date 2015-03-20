
public class incial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		
		Cliente cli = new Cliente("Goiaba", 246922 , "00112233441", "24/11/69", "Rua seis nove ,24" , 12.50);
		
		
		Banco banco = new Banco();
		
		banco.addCliente(cli);
		banco.addCliente(new Cliente ("Goiaba2", 246923 , "001122334423", "24/11/69", "Rua seis nove ,24" , 34.50));
		
		//testes 
		
//		System.out.println("Saldo inicial R$ " + banco.saldo(246922));
//		
//		banco.sacar(10.00,246922 );
//		
//		System.out.print("Novo Saldo R$ " + banco.saldo(246922));
//		
		System.out.println("Saldo inicial R$ " + banco.saldo(246922));
		System.out.println("Saldo inicial R$ " + banco.saldo(246923));
		
		banco.tranferir(246922, 246923, 10.00);
		
		System.out.println("Novo Saldo R$ "  + banco.saldo(246922));
		System.out.println("Novo Saldo R$ "  + banco.saldo(246923));
		

	}

}
