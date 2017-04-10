package exBanco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private int numeroBanco;
	private String nomeBanco;
	private List <Agencia> agencias;
		
	
	public Banco(){
		this.numeroBanco = 0;
		this.nomeBanco = "";
		this.agencias = new ArrayList<Agencia>();
	}
	
	public int getNumeroBanco(){
		return this.numeroBanco;
	}
	
	public String getNomeBanco(){
		return this.nomeBanco;
	}
	
	public void cadastrarAgencia(Agencia agencia){
		agencias.add(agencia);
	}
	
	public Agencia pesquisarAgencia( String numAgencia){
		for (Agencia a: agencias){
			if(a.getNumeroAgencia().equals(numAgencia)){
				return a;
			}
		}
		return null;
	}
	
	
}
