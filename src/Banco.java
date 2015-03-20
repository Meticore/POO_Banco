import java.util.ArrayList;


public class Banco {
	
	
	
	
	private ArrayList<Cliente> cli;	
	
	
	public Banco() {
		cli = new ArrayList<Cliente>();
	}
	
	public void  addCliente(Cliente cli) {
		
		this.cli.add(cli);
		
	}
	
	private int findAccount2(int conta){
		
		
		return cli.indexOf(cli.get(conta));
		
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
		
	    if (aux.getTipo(tConta) == 1){
	    	aux.setSaldo(aux.getSaldo() - valor);
	    }else{
	    	aux.setSaldo(aux.getSaldo() - valor);
	    }
			
		//operação tranferência
	    
			
	}	
		
	
	public void deposito (double valor, int nConta, int tConta){
		
		int index = findAccount(nConta);
		
		
		cli.get(index).setSaldo(cli.get(index).getSaldo() + valor);
		
		
	}
	
	public void tranferir (int  contaOrig, int contaDist , double valor, int tOrig, int tDest){
		
		
		sacar(valor , contaOrig, tOrig);
		deposito(valor, contaDist, tDest);
		
			
		
	}
	
	public double saldo (int nConta){
		
		int index = findAccount(nConta);
		
		
		double saldo = cli.get(index).getSaldo();
		
		return saldo ;
		
	}
	
	public String extrato (int nConta){
		return null;
		
	}
}
