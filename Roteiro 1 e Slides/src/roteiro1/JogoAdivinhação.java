package roteiro1;
import javax.swing.JOptionPane;
public class JogoAdivinha��o {

	public static void main(String[] args) {
		int numProcurado = -1, numChute = -2, pontos = 100;
		
		boolean advinhou = false;
		while (numProcurado < 0 || numProcurado > 100){
			numProcurado = Integer.parseInt(JOptionPane.showInputDialog("Jogador1: \nDigite o n�mero a ser descoberto!"));
		while (advinhou == false){
			numChute = Integer.parseInt(JOptionPane.showInputDialog("Jogador 2:  \nChute um n�mero:"));
			if(numChute == numProcurado){
			advinhou = true;
			JOptionPane.showMessageDialog(null,  "Parab�ns Jogador 2, voc� advinhou o n�mero!\nSua Pontua��o foi: "+ pontos +" Pontos!" );
			}else{
				pontos -= 5;
				if(numChute < numProcurado){
					JOptionPane.showMessageDialog(null, "O n�mero procurado � maior que o seu chute!\nTente Novamente :)" );
				}else{
					JOptionPane.showMessageDialog(null, "O n�mero procurado � menor que o seu chute!\nTente Novamente :)");
				}
			}
			
			
		}
		}
	}

}
