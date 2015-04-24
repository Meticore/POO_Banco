
public class Messages {

	int option;
	
	public String getMensagem (int option){
		this.option = option;
		
		switch (option){
		
		case 1:	return "Saque realizado com sucesso!";
		case 2:	return "Erro! \nSaldo insuficiente.";			
		case 3:	return "Transferencia realizada com sucesso!";
		case 4:	return "Erro! \nTransferencia nao realizada, \nSaldo insuficiente";
		case 5:	return "Deposito realizado com sucesso!";
		case 6:	return "Erro! \nDeposito nao realizado, \nSaldo infuficiente";
		case 7: return "Seu saldo e:\n";
		case 8: return "Seu saldo atual e:\n";
			
		}
		return "Erro desconhecido! \nFale com o gerente responsavel por sua conta!";
	
	}
	
	

}
