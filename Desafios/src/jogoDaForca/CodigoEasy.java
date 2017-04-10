package jogoDaForca;
import java.util.Scanner;
import java.util.Random;
public class CodigoEasy {

	public static void main(String[] args) {
		int erros = 0,
		acertos = 0,
		limErros = 7;
		Scanner input = new Scanner(System.in);
		
		
		//Array com as palavras a serem sorteadas
		String[] listaPalavras = {"papel", "miojo", "milho", "bolsa"};
		String [] dicas = {"É branco." , "É instantâneo." , "Sem ele, assistir filme não é tão legal.", "Toda mulher tem."};
		//sorteamos uma palavra do array
		Random gerador = new Random();
		int indice = gerador.nextInt(listaPalavras.length);
		String palavraSorteada = listaPalavras[indice];
		
		System.out.println("Dica: "+ dicas[indice]+ " Com "+ listaPalavras[indice].length() + " letras.");
 		     
		while(erros < limErros && acertos < palavraSorteada.length()){
		        System.out.println("Escolha uma letra: ");
		        String letra = input.nextLine();

		        //aqui verificamos se a palavra contem a letra digitada
		        //o 'contains()'verifica se determinada sequência de caracteres existe dentro daquela String
		        // use o .toLowerCase() pra garantir igualdade
		        if (palavraSorteada.toLowerCase().contains(letra.toLowerCase())) {
		            
		        	
		        	System.out.println("Letra : " + letra);
		            acertos++;
		        }else {
		            erros++;
		            System.out.println("Letra errada: " + letra + " - você ainda tem " + (5-erros) +" chances");
		        }

		    }

		    //pra fechar informamos se ganhou ou perdeu e a palavra correta
		    //esse operador chama-se ternario ('condição' ? true : false) ' Se erro == 5 retorna 'PERDEU' senão retorna "GANHOU"
		   	System.out.println("Fim de jogo ! Você " + (erros == 5 ? "Perdeu" : "Ganhou !") + " a resposta é : " + palavraSorteada);
		    input.close();
		
		}
	

}
