public class TelefoneList {
	private String numero;
	private String operadora;
	private String prefixo;
	
	public TelefoneList(){
		numero = "";
		operadora = "";
		prefixo = "";
	}
	
	public TelefoneList(String numero, String operadora, String prefixo){
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
	
}



