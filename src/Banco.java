import java.util.ArrayList;


public class Banco {
	
	
	
	
	private ArrayList<Cliente> cli;	
	
	
	public Banco() {
		cli = new ArrayList<Cliente>();
	}
	
	public void  addCliente(Cliente cli) {
		
		this.cli.add(cli);
		
	}
	
		
	
	private int findAccount(int conta){
		
	   for (int i = 0; i < cli.size(); i++) {
		   
		   
		   if(conta == cli.get(i).getNumConta()){
			   
			   return i;
			   		  
		    }
		   	   
	   }	
	   
	   return -1;
		
	}
	
	public void sacar (double valor, int nConta, int tConta){
		
		
		int index = findAccount(nConta);
		Cliente aux = cli.get(index);
		double resto = 0;
		
	    if (aux.getTipo(tConta) == 1){
	    	aux.setSaldo(aux.getSaldo() - valor);
	    }else{	    	
		    if(valor > cli.get(index).getSaldo()){
				resto = valor - cli.get(index).getSaldo();
				cli.get(index).setSaldo(0);
				cli.get(index).setLimite(cli.get(index).getLimite()- resto);		
			
			}
	    	if(cli.get(index).getSaldo() <= 0){
	    		aux.setSaldo(aux.getSaldo() - valor);
	    		cli.get(index).setLimite(cli.get(index).getLimite() - valor);
	    	}
	    }	    
		

	    
	}	
		
	
	public void deposito (double valor, int nConta, int tConta){
		
//		int index = findAccount(nConta);
//		
//		
//		cli.get(index).setSaldo(cli.get(index).getSaldo() + valor);
		
		
		int index = findAccount(nConta);
		Cliente aux = cli.get(index);
		
	    if (aux.getTipo(tConta) == 1){
	    	
	    	aux.setSaldo(aux.getSaldo() + valor);
	    
	    }else{
	    	
	    	aux.setSaldo(aux.getSaldo() + valor);
	    }
		
		
	}
	
	public void tranferir (int contaOrig, int contaDist , double valor, int tOrig, int tDest){
		
		
		sacar(valor , contaOrig, tOrig);
		deposito(valor, contaDist, tDest);
		
		cli.get(findAccount(contaDist)).setExtrato("T       DE "  +contaOrig + " Valor R$ " +valor + "  C");
		cli.get(findAccount(contaOrig)).setExtrato("T       PARA "+contaDist + " Valor R$ " +valor + "  D");	
		
	}
	
	public double saldo (int nConta){
		
		int index = findAccount(nConta);
		
		
		double saldo = cli.get(index).getSaldo();
		
		
		return saldo;
		
	}
	
	public double saldoComLimite(int nConta){
		
		int index = findAccount(nConta);
		
		
		double saldoComLimite = cli.get(index).getSaldo() + cli.get(index).getLimite();
		
		return saldoComLimite;
		
	}


	
	public String extrato (int nConta){
		
		int index = findAccount(nConta);
		
		cli.get(index).setExtrato("Seu Saldo na Data        " + saldo(nConta) + "\n");
		
		cli.get(index).setExtrato("Seu Limite         " + cli.get(index).getLimite() + "\n");
		
		
		return cli.get(index).getExtrato();
		
	}
	
	
	
}
