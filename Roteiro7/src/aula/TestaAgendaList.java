package aula;

import javax.swing.JOptionPane;

public class TestaAgendaList {

	public static void main(String[] args) {
		Agenda agenda = new AgendaList();
		String nome = JOptionPane.showInputDialog("Nome: ");
		String dataAniversario = JOptionPane.showInputDialog("Data:(99/99)");
		Pessoa pessoa = new Pessoa(nome, "", dataAniversario);
		agenda.cadastraPessoa(pessoa);
		System.out.println(agenda.pesquisaAniversariantesDoDia("29/12").toString());
		Pessoa Ppessoa = agenda.pesquisaPessoa(JOptionPane.showInputDialog("Nome a ser pesquisado: "));
		if(Ppessoa == null){
			System.out.println("NOME NÃO ENCONTRADO");	
		}
		long fatorial = pessoa.fatorial(Integer.parseInt(JOptionPane.showInputDialog("Fatorial de: "))); 
		System.out.println(fatorial);
	}
}
