package agendaExercicio;

import java.util.ArrayList;
import java.util.List;

public class AgendaList implements Agenda {
	private List<Contato> listaContato;
	
	public AgendaList(){
		listaContato = new ArrayList<Contato>();
	}
	
	public void cadastraContato(Contato c){
		listaContato.add(c);
	}
	
	public void apagaContato(Contato c){
		listaContato.remove(c);
	}
	
	public List<Contato> pesquisaContatosOperadora(String operadora){
		List <Contato> lista = new ArrayList<Contato>();
		for(Contato c:listaContato){
			if(c.getOperadora().equals(operadora)){
				lista.add(c);
			}
		}
		return lista;
	}
	public Contato pesquisaContato(String nome){
		for(Contato c: listaContato){
			if(c.getNome().equals(nome)){
				return c;
			}
		}
		return null;
	}
	public String pesquisaOperadoraDoContato(String nomeContato){
		for(Contato c: listaContato){
			if(c.getNome().equals(nomeContato)){
				return c.getOperadora();
			}
		}return null;
	}
	
}
