package jogoDaForca;

import java.util.Scanner;

/*Construa um jogo de forca. O jogo deve ler a palavra a ser adivinhada. Depois, vai perguntando ao jogador a 
 * letra da palavra. Quanto mais rápido acertar, mais pontos ganha. A medida em que erra uma letra, vai perdendo
 *  vidas (parte do corpo do boneco da forca) até o máximo permitido. Dica: Você pode usar os métodos "charAt(k)"  
 *  ou "indexOf" ou "contains" de String.
 */
public class Jogo {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String palavra = leitor.nextLine();
		int tamPalavra = palavra.length();
		int numVidas = 6;
		boolean adivinhou = false;
		char [] tabuleiro = new char[tamPalavra];
		for (int i=0; i < tamPalavra; i++){
			tabuleiro[i] = '-';
		}
		System.out.println(tabuleiro);
		while (!adivinhou){
			String entrada = leitor.nextLine();
			char letra = entrada.charAt(0);
			for (int i = 0; i < tamPalavra; i++){
				if (palavra.charAt(i) == (letra)){ 
					tabuleiro[i] = letra;
				}else { 
					tabuleiro[i] = '-';
					if (tabuleiro[i] == '-'){
						
				}else{
					adivinhou = true;
				}
					
			}
			
		}
		System.out.println(tabuleiro);
			System.out.println("Vidas restantes: " + numVidas);
		}
		leitor.close();
	}

}
