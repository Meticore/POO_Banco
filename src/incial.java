
public class incial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		
		Cliente cli = new Cliente("Goiaba", 246922, "00112233441", 1, "24/11/69", "Rua seis nove ,24", 12.50);
		
		
		Banco banco = new Banco();
		
		banco.addCliente(cli);
		banco.addCliente(new Cliente("Goiaba2", 246923, "001122334423", 2, "24/11/69", "Rua seis nove ,24", 34.50));
		
		//testes 
		
		System.out.println("Saldo inicial R$ " + banco.saldo(246923));

		if (banco.sacar(1050.00,246923 )){
			System.out.println("Saque efetuado!");
		}else{
			System.out.println("Saldo insuficiente!");
		}
		
		System.out.print("Novo Saldo R$ " + banco.saldo(246923));
		
		System.out.println("Saldo inicial R$ " + banco.saldo(246922));
		System.out.println("Saldo inicial R$ " + banco.saldo(246923));
		
		banco.tranferir(246922, 246923, 10.00, 1, 2);
		
		System.out.println("Novo Saldo R$ "  + banco.saldo(246922));
		System.out.println("Novo Saldo R$ "  + banco.saldo(246923));
		

	}

}
