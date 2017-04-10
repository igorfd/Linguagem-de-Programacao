public class Contato {
	private String nome;
	private String email;
	private Telefone telefone;
	
	public static final String NOME_DEFAULT="Sem nome";
	public static final String EMAIL_DEFAULT= "Sem email";
	public Contato(){
		nome = NOME_DEFAULT;
		email = EMAIL_DEFAULT;
		telefone = new Telefone();
	}
	
	public int compareTo (Contato c){
		int numero = this.nome.compareTo(c.getNome());
		if(numero > 0){
			return -1;
		}
		else if(numero == 0){
			return 0;
		}
		else{
			return 1;
		}	
	}
	
	public String getNome(){
		return this.nome;
	}
	public String getEmail(){
		return this.email;
	}
	public Telefone getTelefone(){
		return this.telefone;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public void setTelefone(Telefone fone){
		this.telefone = fone;
	}
	public Contato (String nome, String email, Telefone telefone){
		this.nome = nome;
		this.email = email;
		this.telefone = new Telefone();
	}
	public String toString(){
		 String rep = "Contato de nome: " + this.nome + " e telefone: " + this.telefone.toString() + " com email: " + this.email;
		 return rep;
	}
}
