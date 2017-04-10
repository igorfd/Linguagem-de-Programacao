import java.util.Scanner;

import javax.swing.JOptionPane; 
public class IntroduçãoJava {

	public static void main(String[] args) {
		/*Scanner in = new Scanner (System. in);
		double num1, num2, num3;
		System.out.println("Digite sua 1ª nota: ");
		num1 = in.nextDouble();
		System.out.println("Digite sua 2ª nota: ");
		num2 = in.nextDouble();
		System.out.println("Digite sua 3ª nota: ");
		num3 = in.nextDouble();
		
		
		System.out.println((num1 + num2 + num3)/3);
		*/
		System.out.println("e aew");
		String nome = JOptionPane.showInputDialog("Qual seu nome?");
		double nota1, nota2, nota3, media;
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Qual sua primeira nota?"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Qual sua segunda nota?"));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("Qual sua terceira nota?"));
		media = ((nota1 + nota2 + nota3)/3);
		JOptionPane.showMessageDialog(null, "Sua media é"+ media);
	}

}
