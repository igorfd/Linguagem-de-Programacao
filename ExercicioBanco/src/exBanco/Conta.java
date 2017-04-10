package exBanco;

public abstract class Conta {
	private String numero;
	private double saldo;
	private String cpfTitular;
	
	public static final String NUMERO_DEFAULT = "";
	public static final double SALDO_DEFAULT = 0.0;
	public static final String CPF_DEFAULT = "";
	
	public Conta(){
		this.numero = NUMERO_DEFAULT;
		this.saldo = SALDO_DEFAULT;
		this.cpfTitular = CPF_DEFAULT;
		
	}
	
	public Conta(String numero, String cpfTitular){	
		this.numero = numero;
		this.cpfTitular = cpfTitular;
	}
	
	public String getNumeroConta(){
		return this.numero;
	}
	
	public void setNumeroConta(String novoNumeroDaConta){
		this.numero = novoNumeroDaConta;
	}
	
	public String getCpf(){
		return this.cpfTitular;
	}
	
	public void setCpfTitular(String cpf){
		this.cpfTitular = cpf;
	}
	public double getSaldo(){
		return this.saldo;
	}
	
	
	public double sacar(double valor){
		if (this.getSaldoDisponivel() >= valor){
			this.saldo -= valor;
		}
		return this.saldo;
	}
	
	public double depositar(double valor){
		return this.saldo += valor;
	}
	
	public abstract double getSaldoDisponivel();
	
}
