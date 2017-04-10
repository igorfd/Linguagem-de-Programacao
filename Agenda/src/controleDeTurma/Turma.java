package controleDeTurma;

public class Turma{  
	
	private String nomeProf;
	private String nomeDisciplina;
	private int numero;
	private int quantAlunos ;
	private Aluno [] alunos;
	
	public Turma(){
		alunos = new Aluno[100]; 
	    quantAlunos = 0;
	    nomeProf = null;
	    nomeDisciplina = null;
	    numero = 0;
	}
	public void cadastrarAluno(Aluno a){
		this.alunos[quantAlunos] = a;
		quantAlunos++;
	}
	
	public void imprimeListaAlunos(){
		System.out.println(alunos);
	}
	
	public void setDisciplina(String nomeD){	
		this.nomeDisciplina = nomeD;
	}
	public void setNumero(int num){
		this.numero = num;
	}
	public String getNomeDisciplina(){
		return this.nomeDisciplina;
	}
	public int getNumero(){
		return this.numero;
	}
	public double getMediaDaTurma(){ 
		double soma = 0;
		for (int k = 0; k< alunos.length; k++){
			soma += alunos[k].getMedia();
		}
		double media = soma/alunos.length;
		return media;
	}
}
