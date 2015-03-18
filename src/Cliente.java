import java.util.Date;


public class Cliente {
	
	
	
	private String nome;
	private String nomeEmpresa;
	private int numConta;
	private String CPF;
	private String CNPJ;
	private String dateAberCont;
	private String endereco;
	private double saldo;
	private String dataCriacaoEmp;

	
	public Cliente(String nome, String nomeEmpresa, int numConta, String CNPJ,
			String dateAberCont, String endereco, double saldo, String dataCriacaoEmp) {
		
		
		this.nome = nome;
		this.nomeEmpresa = nomeEmpresa;
		this.numConta = numConta;
		this.CNPJ = CNPJ;
		this.dateAberCont = dateAberCont;
		this.endereco = endereco;
		this.saldo = saldo;
		this.dataCriacaoEmp = dataCriacaoEmp;
	
	
	}
	//aqui


	public Cliente(String nome, int numConta, String CPF,
			String dateAberCont, String endereco, double saldo) {
		
		
		this.nome = nome;
		this.numConta = numConta;
		this.CPF = CPF;
		this.dateAberCont = dateAberCont;
		this.endereco = endereco;
		this.saldo = saldo;
	
	
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getNomeEmpresa() {
		return nomeEmpresa;
	}


	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}


	public int getNumConta() {
		return numConta;
	}


	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}


	public String getCPF() {
		return CPF;
	}


	public void setCPF(String cPF) {
		CPF = cPF;
	}


	public String getCNPJ() {
		return CNPJ;
	}


	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}


	public String getDateAberCont() {
		return dateAberCont;
	}


	public void setDateAberCont(String dateAberCont) {
		this.dateAberCont = dateAberCont;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public String getDataCriacaoEmp() {
		return dataCriacaoEmp;
	}


	public void setDataCriacaoEmp(String dataCriacaoEmp) {
		this.dataCriacaoEmp = dataCriacaoEmp;
	}
	
	
}
