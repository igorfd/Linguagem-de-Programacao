package jogoDaMemoria;
import java.util.Scanner;
import java.util.Random;
public class JogoDaMemoria {

	public static void main(String[] args) {
		Random gerador = new Random();
		int [] cartas = {1, 1, 2, 2, 3, 3};
		
		
		for (int i = 0; i < cartas.length ; i ++ ){
			int indice = gerador.nextInt(cartas.length);
			int temporario = cartas[i];
			cartas[i] = cartas[indice];
			cartas [indice] = temporario;
		}
		for (int k = 0; k < cartas.length ; k++){
			System.out.println(cartas [k]);
		}
	}

}
