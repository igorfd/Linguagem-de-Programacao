package slides;
import javax.swing.JOptionPane;
public class OiMundoJOptionPane {

	public static void main(String[] args) {
		System.out.println("Seja Bem Vindo(a)!");
		String nome = JOptionPane.showInputDialog("Qual o seu nome?");
		System.out.println("Oi " + nome);
		
	}

}
