package slides;
import java.util.Scanner;
public class MexendoComSwitchScanner {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Qual dia � hoje?");
		String dia = leitor.nextLine();
		switch(dia.toUpperCase()){
		case "SEGUNDA":
		case "TER�A":
		case "QUARTA":
		case "QUINTA":
			System.out.println("Bom dia de trabalho!");
			break;
		case "SEXTA":
			System.out.println("Boa sexta!");
			break;
		case "S�BADO":
		case "SABADO":
		case "DOMINGO":
			System.out.println("Bom fim de semana!");
		
		}
		leitor.close();
	}

}
