package controleDeTurma;

import java.util.Scanner;

public class ControleDeTurma {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		Turma t = new Turma();
		System.out.println("Digite o nome da disciplina");
		t.setDisciplina(leitor.nextLine());
		System.out.println("Qual o n�mero da turma?");
		t.setNumero(Integer.parseInt(leitor.nextLine()));
		System.out.println("Quantos alunos tem a turma?");
		int qtde = Integer.parseInt(leitor.nextLine());
		for (int k=0; k< qtde; k++){
			Aluno a = new Aluno();
			System.out.println("Qual o nome do aluno?");
			a.setNome(leitor.nextLine());
			System.out.println("Qual a matricula do aluno?");
			a.setMatricula(leitor.nextLine());
			int numNotas = 3;
			double [] notas = new double [numNotas];
			System.out.println("Digite as 3 notas do aluno");
			for (int j=0; j<numNotas; j++){
				System.out.println("Digite a nota "+(j+1));
				notas[j] = Double.parseDouble(leitor.nextLine());
			}
			a.setNotas(notas);
			System.out.println("A m�dia do aluno "+a.getNome()+" � "+a.getMedia());
			t.cadastrarAluno(a);
		}
		System.out.println("A m�dia da turma "+t.getNumero()+ " da disciplina "+t.getNomeDisciplina()+" � "+t.getMediaDaTurma());
                t.imprimeListaAlunos();
                leitor.close(); 

	}
}
