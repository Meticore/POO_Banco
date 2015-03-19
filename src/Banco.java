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
	
	public void sacar (double valor, int nConta){
		
		int index = findAccount(nConta);
		
		
		cli.get(index).setSaldo(cli.get(index).getSaldo() - valor);
			
			
			
		}	
		
	
	public void deposito (double valor, int nConta){
		
		int index = findAccount(nConta);
		
		
		cli.get(index).setSaldo(cli.get(index).getSaldo() + valor);
		
		
	}
	
	public void tranferir (int  contaOrig, int contaDist , double valor){
		
		
		sacar(valor , contaOrig);
		deposito(valor, contaDist);
			
		
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
