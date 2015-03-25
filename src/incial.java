

public class incial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		
		Cliente cli = new Cliente("Goiaba", 246922, "00112233441", 1, "24/11/69", "Rua seis nove ,24", 12.50);
		
		
		Banco banco = new Banco();
		
		banco.addCliente(cli);
		banco.addCliente(new Cliente("Goiaba2", 246923, "001122334423", 2, "24/11/69", "Rua seis nove ,24", 34.50));
		banco.addCliente(new Cliente("Marcelo Paiva","MeticoreMobile",112200,"0123456770",2,"23/03/15","Rua 6 , 197",123.00,"09/03/2015"));
		
		//testes 
		
//		System.out.println("Saldo inicial R$ " + banco.saldo(246922));
//		
//		banco.sacar(10.00,246922 );
//		
//		System.out.print("Novo Saldo R$ " + banco.saldo(246922));
//		
		
		
		System.out.println("Saldo inicial R$ " + banco.saldo(246922));
		System.out.println("Saldo inicial R$ " + banco.saldo(246923));
		
		banco.tranferir(246922, 246923, 10.00, 1, 2);
		
		System.out.println("Novo Saldo R$ "  + banco.saldo(246922));
		System.out.println("Novo Saldo R$ "  + banco.saldo(246923));
		System.out.println("Saldo + Limite " + banco.saldoComLimite(246922));
		System.out.println("Saldo + Limite " + banco.saldoComLimite(246923));
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println(banco.extrato(246922));
		System.out.println(banco.extrato(246923));
		System.out.println(banco.extrato(112200));

		
	}

}
