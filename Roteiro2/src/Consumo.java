import java.util.Scanner;
public class Consumo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int X; 
		double Y;
		double consumo;
		X = input.nextInt();
		Y = input.nextDouble();
		consumo = X / Y;
		
		System.out.printf("%.3f km/l\n", consumo);
	input.close();
	}

}
