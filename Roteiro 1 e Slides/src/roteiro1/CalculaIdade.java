package roteiro1;
import javax.swing.JOptionPane;

public class CalculaIdade {
	public static void main (String[] args){
		int ano,  idade;
		String nome = JOptionPane.showInputDialog("Qual seu nome?");
		ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Em que ano você nasceu?", "****"));
		idade = 2016 - ano;
		JOptionPane.showMessageDialog(null, nome + " tem " + idade + " anos!");
		
		
		
		
	}
}
