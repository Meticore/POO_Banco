import java.util.Date;


public class Cliente {
	
	
	
	String nome;
	String nomeEmpresa;
	int numConta;
	String CPF;
	String CNPJ;
	String dateAberCont;
	String endereco;
	double saldo;
	

	
	public Cliente(String nome, String nomeEmpresa, int numConta, String CNPJ,
			String dateAberCont, String endereco, double saldo) {
		
		
		this.nome = nome;
		this.nomeEmpresa = nomeEmpresa;
		this.numConta = numConta;
		this.CNPJ = CNPJ;
		this.dateAberCont = dateAberCont;
		this.endereco = endereco;
		this.saldo = saldo;
	
	
	}



	public Cliente(String nome, int numConta, String CPF,
			String dateAberCont, String endereco) {
		
		
		this.nome = nome;
		this.numConta = numConta;
		this.CPF = CPF;
		this.dateAberCont = dateAberCont;
		this.endereco = endereco;
		this.saldo = saldo;
	
	
	}
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	

}
