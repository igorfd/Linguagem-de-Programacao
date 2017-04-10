package agendaExercicio;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class TestaAgenda {
	public static void main (String [] args){
		Agenda agenda = new AgendaList();
		String nome  = JOptionPane.showInputDialog("Nome: ");
		String telefone  = JOptionPane.showInputDialog("Telefone: ");
		String op  = JOptionPane.showInputDialog("Op: ");
		Contato c = new Contato(nome,telefone,op);
		agenda.cadastraContato(c);
		List <Contato> lista = new ArrayList<Contato>();
		lista = agenda.pesquisaContatosOperadora("OI");
		for (Contato contato: lista){
			System.out.println(contato.toString());
			
		}
		
	}
}
