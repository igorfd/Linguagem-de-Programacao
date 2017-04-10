package controleDeTurma;

public class Aluno {
		
	private String nome;
	private String matricula;
	private double [] notas;
	
	
	public String getNome(){
		return this.nome;
	}
	public double [] getNotas(){
		return this.notas;
	}
	public void setNome(String s){
		this.nome = s;
	}
	public void setMatricula(String s){
		this.matricula = s;
	}
	public void setNotas(double [] s){
		this.notas = s;
	}
	
	public double getMedia(){
		double soma = 0;
		for (int k = 0; k < notas.length; k ++){
			soma += notas[k];
		}
		double media = soma/notas.length;
	return media;	
	}
}
	


