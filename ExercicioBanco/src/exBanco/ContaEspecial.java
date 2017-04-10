package exBanco;

public class ContaEspecial extends Conta{
	private double credito;

	public ContaEspecial(){
		this.credito = 0.0;
	}
	public ContaEspecial(String numero, String cpf, double credito){
		super(numero, cpf);
		this.credito = credito;
	}
	
	public double getCredito(){
		return this.credito;
	}
	
	public void setCredito(double novoCredito){
		this.credito = novoCredito;
	}
	
	public double getSaldoDisponivel(){
		return super.getSaldo()+ this.credito;
	}
}
