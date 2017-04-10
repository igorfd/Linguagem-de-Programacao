import java.util.Scanner;
public class Ex1012 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double A, B, C , pi = 3.14159;
		A = Double.parseDouble(leitor.nextLine());
		B = Double.parseDouble(leitor.nextLine());
		C = Double.parseDouble(leitor.nextLine());
		double AreaTriangulo = (A*C)/2,
		AreaCirculo = pi*(C*C),
		AreaTrapezio = ((A+B)*C)/2,
		AreaQuadrado = B*B,
		AreaRetangulo = B*A;
		System.out.printf("TRIANGULO: %.3f\n", AreaTriangulo);
		System.out.printf("CIRCULO: %.3f \n", AreaCirculo);
		System.out.printf("TRAPEZIO: %.3f\n", AreaTrapezio);
		System.out.printf("QUADRADO: %.3f\n", AreaQuadrado);
		System.out.printf("RETANGULO: %.3f\n", AreaRetangulo);
		
		
		
		
		leitor.close();
	}

}
