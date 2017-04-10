import java.util.ArrayList;
import java.util.List;

public class AgendaList {
	private List <Contato> contatos;
	
	public AgendaList(){
		contatos = new ArrayList<Contato>(); 	
	}
	 //
	public void cadastrarContato(Contato c){
		contatos.add(c);
		}
	
	public List<Contato> getContatos(){
		return contatos;
	}
	
	public void removerContato(String nome){
		for (Contato c : contatos){
			if (c.getNome().equals(nome)){
				this.contatos.remove(c);
			}
		}
	}
	public int getNumeroDeContatosCadastrados(){
		return this.contatos.size();
	}
	public Telefone PesquisaTelefoneDoContato(String nome){
		for (Contato c : contatos){
			if (c.getNome().equals(nome)){
				return c.getTelefone();
			}
		}return null;
	}
	public int getQuantDeContDaOperadora (String op){
		int quant = 0;
		for(Contato c : contatos){
			if(c.getTelefone().getOperadora().equals(op)){
				quant ++;
			}
		}
		return quant;
	}
	public int getQuantDeContDoPrefixo (String pref){
		int quant = 0;
		for(Contato c : contatos){
			if(c.getTelefone().getPrefixo().equals(pref)){
				quant ++;
			}
		}
		return quant;
	}
	public String pesquisaNomePeloNum(String pref, String numero){
		for (Contato c : contatos){
			if (c.getTelefone().getPrefixo().equals(pref) && c.getTelefone().getNumero().equals(numero)){
				return c.getNome();
			}
		}return null;
	}
	public List<Contato> pesquisaContatosComecandoComALetra(char letra){
		ArrayList <Contato> lista = new ArrayList<Contato>();
		for (Contato c: contatos){
			if (c.getNome().charAt(0) == letra){
				lista.add(c);		
			}
		}
		return lista;
	}
	public List <Contato> pesquisaContatosDaOperadora(String op){
		ArrayList <Contato> lista = new ArrayList<Contato>();
		for(Contato c: contatos){
			if(c.getTelefone().getPrefixo().equals(op)){
				lista.add(c);
			}
		}
		return lista;
	}
	public List <Contato> pesquisaContatosDoPrefixo(String pref){
		ArrayList <Contato>lista = new ArrayList <Contato>();
		for(Contato c : contatos){
			if(c.getTelefone().getPrefixo().equals(pref)){
				lista.add(c);
			}
		}
		return lista;
	}
	public List<Contato> pesquisaContatosIniciadosCom(String s){
		ArrayList <Contato> lista = new ArrayList<Contato>();
		for (Contato c : contatos){
			if(c.getNome().startsWith(s)){
				lista.add(c);
			}
		}
		return lista;
	}
	
	public List<Contato> pesquisaContatosTerminadoEm(String s){
		ArrayList <Contato> lista = new ArrayList<Contato>();
		for (Contato c : contatos){
			if(c.getNome().endsWith(s)){
				lista.add(c);
			}
		}
		return lista;
	}
	
}