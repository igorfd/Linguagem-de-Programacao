
public class ContatoList {
	private String nome;
	private String email;
	private TelefoneList telefone;
	
	public ContatoList(){
		nome = "";
		email = "";
		telefone = new TelefoneList();
	}
	public String getNome(){
		return this.nome;
	}
	public String getEmail(){
		return this.email;
	}
	public TelefoneList getTelefone(){
		return this.telefone;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public void setTelefone(TelefoneList fone){
		this.telefone = fone;
	}
	public ContatoList (String nome, String email, TelefoneList telefone){
		this.nome = nome;
		this.email = email;
		this.telefone = new TelefoneList();
	}
	
}
