package exBanco;

import java.util.ArrayList;
import java.util.List;

public class Agencia{
	private String numAgencia;
	private List<Conta> contas;
	
	
	public Agencia(String numero){
		this.numAgencia = numero;
		this.contas = new ArrayList<Conta>();
	}
	
	public void cadastrarConta(Conta conta){
		contas.add(conta);
	}
	
	public String getNumeroAgencia(){
		return this.numAgencia;
	}
	
	public void setNumeroAgencia(String numeroDaAgencia){
		this.numAgencia = numeroDaAgencia;
	}
	
	public List<Conta> pesquisarContasComSaldoNegativo(){
		List<Conta> lista = new ArrayList <Conta>();
		for (Conta c : contas){
			if(c.getSaldo()< 0.0){
				lista.add(c);
			}
		}
		return lista;
	}
	
	public Conta pesquisarConta(String numConta){
		for (Conta c: contas){
			if (c.getNumeroConta().equals(numConta)){
				return c;
			}
		}
		return null;
	}
	
	public List <Conta> pesquisaContasDoCliente(String cpfCliente){
		List <Conta> lista = new ArrayList<Conta>();
		for (Conta c: contas){
			if(c.getCpf().equals(cpfCliente)){
				lista.add(c);
			}
		}
		return lista;
		
	}
	
	public String toString(){
		String retorno = "Número da Agência: " + this.numAgencia;
		return retorno;
	}
}
