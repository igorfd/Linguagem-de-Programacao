package roteiro1;
import javax.swing.JOptionPane;
public class JogoAdivinhação {

	public static void main(String[] args) {
		int numProcurado = -1, numChute = -2, pontos = 100;
		
		boolean advinhou = false;
		while (numProcurado < 0 || numProcurado > 100){
			numProcurado = Integer.parseInt(JOptionPane.showInputDialog("Jogador1: \nDigite o número a ser descoberto!"));
		while (advinhou == false){
			numChute = Integer.parseInt(JOptionPane.showInputDialog("Jogador 2:  \nChute um número:"));
			if(numChute == numProcurado){
			advinhou = true;
			JOptionPane.showMessageDialog(null,  "Parabéns Jogador 2, você advinhou o número!\nSua Pontuação foi: "+ pontos +" Pontos!" );
			}else{
				pontos -= 5;
				if(numChute < numProcurado){
					JOptionPane.showMessageDialog(null, "O número procurado é maior que o seu chute!\nTente Novamente :)" );
				}else{
					JOptionPane.showMessageDialog(null, "O número procurado é menor que o seu chute!\nTente Novamente :)");
				}
			}
			
			
		}
		}
	}

}
