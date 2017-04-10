import java.util.ArrayList;

public class AgendaList {
		private ArrayList <ContatoList> listaDeContatos;
		private int quantContatos;
		
		public AgendaList(){
			quantContatos = 0;
			listaDeContatos = new ArrayList<ContatoList>();	
		}
		
		public void cadastraContato(ContatoList c){
			listaDeContatos.add(c);
			quantContatos ++;
			}
		
		public ArrayList <ContatoList> getContatos(){
			return this.listaDeContatos;
		}
		public void removerContato(String nome){
			for(int k = 0; k< quantContatos; k++){
				if(listaDeContatos.get(k).getNome().equals(nome)){
					listaDeContatos.get(k).remove(nome);
				}
			}
					
		}
		public int getNumeroDeContatosCadastrados(){
			return this.quantContatos;
		}
		public Telefone PesqTelefoneDoContato(String nome){
			for (int k = 0; k < quantContatos; k++){
				if (listaDeContatos[k].getNome().equals(nome)){
					return listaDeContatos[k].getTelefone();
				}
			}return null;
		}
		public int getQuantDeContDaOperadora (String op){
			int quant = 0;
			for(int k = 0; k < quantContatos; k++){
				if(listaDeContatos[k].getTelefone().getOperadora().equals(op)){
					quant ++;
				}
			}
			return quant;
		}
		public int getQuantDeContDoPrefixo (String pref){
			int quant = 0;
			for(int k = 0; k < quantContatos; k++){
				if(listaDeContatos[k].getTelefone().getPrefixo().equals(pref)){
					quant ++;
				}
			}
			return quant;
		}
		public String pesquisaNomePeloNum(String pref, String numero){
			for (int k = 0; k < quantContatos; k++){
				if (listaDeContatos[k].getTelefone().getPrefixo().equals(pref) && listaDeContatos[k].getTelefone().getNumero().equals(numero)){
					return listaDeContatos[k].getNome();
				}
			}return null;
		}
		public Contato [] pesquisaContatosComecandoComALetra(char letra){
			Contato [] lista = new Contato[quantContatos];
			int i = 0;
			for (int k = 0; k< quantContatos; k++){
				if (listaDeContatos[k].getNome().charAt(0) == letra){
					lista[i] = listaDeContatos[k];
					i ++;
				}
			}
			return lista;
		}
		public Contato [] pesquisaContatosDaOperadora(String op){
			Contato[] lista = new Contato[quantContatos];
			int i = 0;
			for(int k =0; k < quantContatos; k++){
				if(listaDeContatos[k].getTelefone().getPrefixo().equals(op)){
					lista[i] = listaDeContatos[k];
					i++;
				}
			}
			return lista;
		}
		public Contato [] pesquisaContatosDoPrefixo(String pref){
			Contato[] lista = new Contato[quantContatos];
			int i = 0;
			for(int k =0; k < quantContatos; k++){
				if(listaDeContatos[k].getTelefone().getPrefixo().equals(pref)){
					lista[i] = listaDeContatos[k];
				}
			}
			return lista;
		}
		
	}