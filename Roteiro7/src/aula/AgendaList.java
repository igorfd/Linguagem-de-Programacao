package aula;

import java.util.ArrayList;
import java.util.List;

public class AgendaList implements Agenda{
	private List <Pessoa>contatos;
	public AgendaList(){
	this.contatos= new ArrayList<Pessoa>();
	}
	
	public void cadastraPessoa(Pessoa p){
	this.contatos.add(p);
	}
	
	public void apagaPessoa(String nomePessoa){
		for (Pessoa p : contatos){
			if(p.getNome().equals(nomePessoa)){
				this.contatos.remove(p);
			}
		}
	}
	
	public List<Pessoa> pesquisaAniversariantesDoDia(String dia){
	List <Pessoa> lista = new ArrayList<Pessoa>(); 
	for(Pessoa p : contatos){
		if (p.getDataAniversario().equals(dia)){
			lista.add(p);
		}
	}
	return lista;
	}
	public Pessoa pesquisaPessoa(String nome){
		for( Pessoa p : contatos){
			if(p.getNome().equals(nome)){
				return p;
				
			}
		}
		return null;
	}
	
	
}