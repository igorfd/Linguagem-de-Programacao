import java.util.Scanner;
public class IdadeEmDias {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double idade = leitor.nextDouble();
		double ano, meses, dias;
		ano = (idade / 365);
		double resto = idade % 365;
		meses = resto/ 30;
		dias = resto % 30;
		System.out.println((int)ano + " ano(s)");
		System.out.println((int)meses + " mes(es)");
		System.out.println((int)dias + " dia(s)");
		leitor.close();
	}

}
