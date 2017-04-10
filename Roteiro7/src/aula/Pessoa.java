package aula;

public class Pessoa {
	private String nome;
	private String telefone;
	private String dataAniversario;
	public Pessoa() {
		this.nome= "";
		this.telefone= "";
		this.dataAniversario= "";
	}
	public Pessoa(String nome){
		this.nome = nome; 
	}
	public Pessoa(String nome, String telefone, String dataAniversario){
		this.nome = nome; 
		this.telefone = telefone;
		this.dataAniversario = dataAniversario ;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone= telefone;
	}
	public String getDataAniversario() {
		return dataAniversario;
	}
	public void setNome(String nome) {
		this.nome= nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	public String toString(){
		String pessoa = "Nome: " + this.nome + ", telefone: " + this.telefone + ", data de aniversário: " + this.dataAniversario;
		return pessoa;
	}
	public long fatorial(int num){
		if(num <= 1){
			return 1;
		}
		else{
			return num* fatorial(num - 1);
		}
	}
}
