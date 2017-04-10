package agendaExercicio;

import java.util.List;

public interface Agenda {

	public void cadastraContato(Contato c);
	public void apagaContato(Contato c);
	public List<Contato> pesquisaContatosOperadora(String operadora);
	public Contato pesquisaContato(String nome);
	public String pesquisaOperadoraDoContato(String nomeContato);
}
