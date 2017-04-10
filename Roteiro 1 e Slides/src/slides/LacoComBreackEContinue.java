package slides;
import javax.swing.JOptionPane;
public class LacoComBreackEContinue {

	public static void main(String[] args) {
		while(true){
			String opcao = JOptionPane.showInputDialog("Digite uma opção: \n1. Jogar\n2.Ranking\n3.Sair");
			if(opcao.equals("1")){
				System.out.println("Entrando no jogo...");
				
			}else if(opcao.equals("2")){
				System.out.println("Mostrando Ranking...");
				
			}else if(opcao.equals("3")){
				break;
			}else{
				System.out.println("Opção inválida...");
				continue;
			}
			System.out.println("Você está jogando o jogo X");
		}
		System.out.println("Até mais!");
	}

}
