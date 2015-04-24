import java.util.ArrayList;


public class Banco {
	
	
	
	
	private ArrayList<Cliente> cli; //cli = Cliente	
	
	
	public Banco() {
		cli = new ArrayList<Cliente>();
	}
	
	public void  addCliente(Cliente c) {
		
		this.cli.add(c);
		
	}
	
	
	private int findAccount2(int conta){
		
		
		return cli.indexOf(cli.get(conta));
		
	}
	
	
	private int findAccount(int conta){
		
	   for (int i = 0; i < cli.size(); i++) {
		   
		   
		   if(conta == cli.get(i).getNumConta()){ //cliente - numConta;
			   
			   return i;
			   		  
		    }
		   	   
	   }	
	   
	   return -1;
		
	}
	
	public boolean sacar (double valor, int nConta){
		
		int index = findAccount(nConta);
		Cliente aux = cli.get(index);
		
	    if (aux.getTipo() == 1){
	    	if(aux.getSaldo() >= valor){
	    		aux.setSaldo(aux.getSaldo() - valor);
	    		return true;
	    	}else{
	    		return false;
	    	}	    	
	    }else{
	    	if (aux.getSaldo() >= valor){
	    		aux.setSaldo(aux.getSaldo() - valor);
	    		return true;
	    	}else{
	    		if (valor <= aux.getLimiteEsp()){
	    			aux.setLimiteEsp(aux.getLimiteEsp()-valor-(valor*0.05));
	    			return true;
	    		}else{
	    		return false;
	    		}
	    	}
	    	
	    }  
			
	}	
		
	
	public void deposito (double valor, int nConta, int tConta){
		
		int index = findAccount(nConta);
		
		
		cli.get(index).setSaldo(cli.get(index).getSaldo() + valor);
		
		
	}
	
	public void tranferir (int  contaOrig, int contaDist , double valor, int tOrig, int tDest){
		
		
		sacar(valor , contaOrig);
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
	public int[] pesquisa (){
		int [] vetor = new int [2];
		
		for (int i=0; i < cli.size(); i++){
			if(cli.get(i).getTipo() == 1){
				vetor[0]++;
			}else{
				vetor[1]++;
			}
			
		}		
		return (vetor);
	}
	
	public double maiorsaldo (){
			
		double maiorsaldo = cli.get(0).getSaldo();
		
		for (int i=0; i < cli.size(); i++){
			if(cli.get(i).getSaldo() > maiorsaldo){
				maiorsaldo = cli.get(i).getSaldo();
			}			
		}		
		return maiorsaldo;
	}
	
}
