package aula;

import java.util.List;

public interface Agenda {
	public void cadastraPessoa(Pessoa p);
	public void apagaPessoa(String nomePessoa);
	public List<Pessoa> pesquisaAniversariantesDoDia(String dia);
	public Pessoa pesquisaPessoa(String nomePessoa);
	
}
