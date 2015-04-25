

public class incial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
				
		Banco banco = new Banco();
		
		
		
		//banco.addCliente(cli);
		banco.addCliente(new Cliente("Goiaba2", 246923, "001122334423", "24/11/69", "Rua seis nove ,24", 100));
		banco.addCliente(new Cliente("Marcelo Paiva","MeticoreMobile",112200,"0123456770","23/03/15","Rua 6 , 197",60.00,"09/03/2015"));
		
		//testes 
		

//		
//		System.out.println("Saldo inicial R$ " + banco.saldo(246923));
//		
		//banco.sacar(101, 246923);
//		
//		System.out.println("Novo Saldo R$ "  + banco.saldo(246923));
//		
//		System.out.println("Saldo + Limite " + banco.saldoComLimite(246923));
//		
//		System.out.println();
//	
//		
//		System.out.println(banco.extrato(246923));
//		
		//banco.deposito(41, 246923);
//		
//		System.out.println("Novo Saldo R$ "  + banco.saldo(246923));
//		
//		System.out.println("Saldo + Limite " + banco.saldoComLimite(246923));
//		
//		//banco.tranferir(246922, 246923, 10.00, 1, 2);
//		
//		
//		
//		System.out.println("Saldo inicial R$ " + banco.saldo(112200));
//		
		banco.sacar(61, 112200);
//		
//		System.out.println("Novo Saldo R$ "  + banco.saldo(112200));
//		
//		System.out.println("Saldo + Limite " + banco.saldoComLimite(112200));
//		
//		System.out.println();
		banco.tranferir(246923, 112200, 100);
		
		System.out.println(banco.extrato(112200));
		//System.out.println(banco.extrato(246923));

		
	}

}
