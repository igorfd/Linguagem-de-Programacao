package slides;
import javax.swing.JOptionPane;
public class MexendoComSwitch {

	public static void main(String[] args) {
		String dia = JOptionPane.showInputDialog("Qual o dia hoje?");
		switch(dia.toUpperCase()){
		case "SEGUNDA":
		case "TERÇA":
		case "QUARTA":
		case "QUINTA":
			System.out.println("Bom dia de trabalho!");
			break;
		case "SEXTA":
			System.out.println("Boa sexta!");
			break;
		case "SÁBADO":
		case "DOMINGO":
			System.out.println("Bom fim de semana!");
			
		}

	}

}
