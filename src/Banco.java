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
	//metodo ok 
	public void sacar (double valor, int nConta){
		
		
		int index = findAccount(nConta);
		Cliente aux = cli.get(index);
		double resto = 0;
		
	    if (aux.getTipo() == 1){
	    	
	    	if( valor > aux.getSaldo()){
	    		
	    		System.out.println("Saldo insuficiente \nSaque não realizado");
	    		
	    	}else{
	    	
	    		aux.setSaldo(aux.getSaldo() - valor);
	    	
	    		 }
	    
	    	
	    }else{	    	
		    
	    	if(valor > aux.getSaldo()){
				resto = valor - aux.getSaldo();
				aux.setSaldo(0);
				aux.setLimite(aux.getLimite() - (resto + (( resto /100 ) * 5 )));		
			
	    	}else{
	    		
		    	
		    	aux.setSaldo(aux.getSaldo() - valor);
	    		    		
	    		
	    	}
	    	
	    }
	    
	    
	    
		
	}	
		
	// deposito ok 
	public void deposito (double valor, int nConta){
		

		double valorAddConta = 0;
		
		double valorFaltaLimite = 0 ;
		
		int index = findAccount(nConta);
		
		Cliente aux = cli.get(index);
		
	    
		if (aux.getTipo() == 1){
	    	
	    	aux.setSaldo(aux.getSaldo() + valor);
	    
	    	}else{
	    	
	    	
	    		if(aux.getLimite() < 1000){
	    		
	    			valorFaltaLimite = 1000 - aux.getLimite();
	    		
	    			valorAddConta = valor - valorFaltaLimite;
	    		
	    			aux.setLimite( aux.getLimite() + valorFaltaLimite);
	    		
	    			aux.setSaldo(valorAddConta);
	    	 
	    			}else{
	    		
	    				aux.setSaldo(aux.getSaldo() + valor);
	    	
	    				
	    			}
	    
	    	}
		
	}
	
	public void tranferir (int contaOrig, int contaDist , double valor){
		
		
		sacar(valor , contaOrig);
		deposito(valor, contaDist);
		
		cli.get(findAccount(contaDist)).setExtrato("T       DE "  +contaOrig + " Valor R$ " +valor + "  C");
		cli.get(findAccount(contaOrig)).setExtrato("T       PARA "+contaDist + " Valor R$ " +valor + "  D");	
		
	}
	
	public double saldo (int nConta){
		
		int index = findAccount(nConta);
		Cliente aux = cli.get(index);
		
		double saldo = aux.getSaldo();
		
		
		return saldo;
		
	}
	
	public double saldoComLimite(int nConta){
		
		int index = findAccount(nConta);
		Cliente aux = cli.get(index);
		
		double saldoComLimite = aux.getSaldo() + aux.getLimite();
		
		return saldoComLimite;
		
	}


	
	public String extrato (int nConta){
		
		int index = findAccount(nConta);
		Cliente aux = cli.get(index);
		
		aux.setExtrato("Seu Saldo na Data        " + saldo(nConta) + "\n");
		aux.setExtrato("Seu Limite         " + aux.getLimite() + "\n");
		
		
		return aux.getExtrato();
		
	}
	
	
	
}
