package slides;
import javax.swing.JOptionPane;
public class FazendoContas {

	public static void main(String[] args) {
		double num1 = Double.parseDouble(JOptionPane.showInputDialog("Qual o primeiro número?"));
		double num2 = Double.parseDouble(JOptionPane.showInputDialog("Qual o segundo número?"));
		double soma = (num1 + num2), diferenca = (num1 - num2), produto = (num1 * num2), quociente = (num1 / num2); 
		System.out.println("Soma: "+ soma);
		System.out.println("Diferença: "+ diferenca);
		System.out.println("Produto: " + produto);
		System.out.println("Quociente: " + quociente);
	}

}
