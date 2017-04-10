package agendaExercicio;

public class Contato {
	private String nome;
	private String telefone;
	private String operadora;
	
	public Contato(String nome, String telefone, String operadora){
		this.nome = nome;
		this.telefone = telefone;
		this.operadora = operadora;
	}
	public Contato(){
		this.nome = "";
		this.telefone = "";
		this.operadora = "";
	}
	
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	
	public String toString(){
		String p = "Nome: "+ this.nome+ "\nTelefone: " + this.telefone +"\nOperadora: " + this.operadora; 
		return p;
	}
}
