
public class Telefone {
	private String numero;
	private String operadora;
	private String prefixo;
	
	public Telefone(){
		numero = "";
		operadora = "";
		prefixo = "";
	}
	
	public Telefone(String numero, String operadora, String prefixo){
		this.numero = numero;
		this.operadora = operadora;
		this.prefixo = prefixo;
	}
	
	public  void setNumero (String numero){
		this.numero = numero;
	}
	public void setOperadora (String op){
		this.operadora = op;
	}
	public void setPrefixo (String pref){
		this.prefixo = pref;
	}
	public String getNumero(){
		return this.numero;
	}
	public String getOperadora(){
		return this.operadora;
	}
	public String getPrefixo(){
		return this.prefixo;
	}
	public String toString(){
		String rep = "(" + this.prefixo + ")" + " " + this.numero;
		return rep;
	}
}

