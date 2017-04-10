package jogoDaForca;
import java.util.Random;
import java.util.Scanner;


public class Codigo {

    private static Scanner ler;

	public static void main(String[] args) {
        String [] palavra = {"bolsa", "banana", "esfera", "dado"};
        String [] dicas = {"Toda mulher tem.", "Amarelo quando mole e verde quando dura.", "Tem apenas dois lados.", "Alguns são viciados." };
        String letra;
    	int numDeLetras, numDeTentativas = 6;
    	
    	Random gerador = new Random();
    	ler = new Scanner(System.in);
    	
       	int indice = gerador.nextInt(4);
    	
    	System.out.println(dicas[indice] + " Com "+ palavra[indice].length()+ " letras!");
    	numDeLetras = palavra[indice].length();
    	
    	String resposta = "";
    	String [] tentativas = new String[numDeTentativas];
    	
    	for (int k = 0; k < numDeLetras; k ++){
    		resposta = "";
    		System.out.println("Escolha uma letra: ");
    		tentativas[k] = ler.nextLine();
    		for(int j = 0; j < numDeLetras; j++){
    			letra = "" + palavra[indice].charAt(j);
    			boolean encontrou = false;
    			int i = 0;
    			for (i = 0; i < tentativas.length; i++ ){    				
    				if (letra.equals(tentativas[i])){
    					encontrou = true;
    					
    					break;
    				}	
    			}
    			if (encontrou){
                    encontrou = false;
                    resposta += " " + tentativas[i] + " ";
                }else {
                    resposta += " _ ";
                }
            }

            System.out.println(resposta);
            if (!resposta.contains("_")) {
                System.out.println("Parabéns, você encontrou a palavra!!");
                return;
            }
        }
    	ler.close();
    	System.out.println("Fim de Jogo! Acabaram suas chances!");
    		   		
   }
}



