import javax.swing.JOptionPane;

public class Recursividade {
	// Criando um método para o fatorial
	public static int fatorial (int n){
		if(n <= 1){
			return 1; // essa é a condição para parar. Pois quando ele for 1 ou zero, ele apenas vai retornar o numero 1! 
		}
		int fator = fatorial(n-1) * n;// ele decrementa o n de um em um pra retornar para a mesma função, e multiplica pelo n do momento.
		return fator;
	}
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero fatorial: "));
		int fatorial = fatorial(num);
		JOptionPane.showMessageDialog(null, fatorial);
	}

}
