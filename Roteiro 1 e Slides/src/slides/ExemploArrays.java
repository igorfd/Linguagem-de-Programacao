package slides;
import javax.swing.JOptionPane;
public class ExemploArrays {

	public static void main(String[] args) {
		System.out.println("Vamos ler e guardar 10 nomes?");
		int quantNomes= 10;
		String[] nomes= new String[10];
		for (int k=0; k < quantNomes; k++){
			nomes[k]= JOptionPane.showInputDialog("Digite um nome:");
		}
		System.out.println("Foram lidos os nomes a seguir:");
		for (int k=0; k< nomes.length; k++){
			System.out.println(nomes[k]);
		}
	}

}
