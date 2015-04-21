
public class Cliente {
	
	
	
	private String nome;
	private int tipo;
	private String nomeEmpresa;
	private int numConta;
	private String CPF;
	private String CNPJ;
	private String dateAberCont;
	private String endereco;
	private double saldo;
	private String dataCriacaoEmp;
	private double limite;
	private String extrato;
	String Ext = new String();
	//private ArrayList<String> linhas;
	
	
	public Cliente(String nome, String nomeEmpresa, int numConta, String CNPJ,
			String dateAberCont, String endereco, double saldo, String dataCriacaoEmp){
		
		
		this.nome = nome;
		this.nomeEmpresa = nomeEmpresa;
		this.numConta = numConta;
		this.CNPJ = CNPJ;
		this.tipo = 1;
		this.dateAberCont = dateAberCont;
		this.endereco = endereco;
		this.saldo = saldo;
		this.dataCriacaoEmp = dataCriacaoEmp;
		limite = 0;
		extrato = "Extrato   Conta:"+ numConta +"\n" + nome +"\n";
		
	
	
	}
	
	public Cliente(String nome, int numConta, String CPF,
			String dateAberCont, String endereco, double saldo){
		
		
		this.nome = nome;
		this.numConta = numConta;
		this.CPF = CPF;
		this.tipo = 2;
		this.dateAberCont = dateAberCont;
		this.endereco = endereco;
		this.saldo = saldo;	
		limite = 1000.00;
		extrato = "Extrato   Conta:"+ numConta +"\n";
		
		
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

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public String getExtrato() {
		return extrato;
	}

	public void setExtrato(String extrato) {
		
		
		this.extrato += extrato +"\n";
	}
		
	/*public void addLinha (String linha){
		linhas.add(linha);
	}*/
	
	
	
}
