

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
	private double limiteEsp;
	private double taxa;
	
	public Cliente(String nome, String nomeEmpresa, int numConta, String CNPJ, int tipo,
			String dateAberCont, String endereco, double saldo, String dataCriacaoEmp){
		
		
		this.nome = nome;
		this.nomeEmpresa = nomeEmpresa;
		this.numConta = numConta;
		this.CNPJ = CNPJ;
		this.tipo = tipo;
		this.dateAberCont = dateAberCont;
		this.endereco = endereco;
		this.saldo = saldo;
		this.dataCriacaoEmp = dataCriacaoEmp;
	
	
	}
	
	public Cliente(String nome, int numConta, String CPF, int tipo,
			String dateAberCont, String endereco, double saldo, double taxa){
		
		
		this.nome = nome;
		this.numConta = numConta;
		this.CPF = CPF;
		this.tipo = tipo;
		this.dateAberCont = dateAberCont;
		this.endereco = endereco;
		this.saldo = saldo;	
		this.limiteEsp = 1000;
		this.taxa = taxa;
		
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

	public double getLimiteEsp() {
		return limiteEsp;
	}

	public void setLimiteEsp(double limiteEsp) {
		this.limiteEsp = limiteEsp;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}


	
	
}
