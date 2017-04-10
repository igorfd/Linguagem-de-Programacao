package teste1;

import java.util.Scanner;

public class LendoTeclado {
	public static void main(String[] args){
		Scanner in = new Scanner ( System.in );
		double num1, num2, num3, soma, subtracao;
		
		System.out.println("Insira um numero: ");
		num1 = in.nextDouble();
		
		System.out.println("Insira um numero: ");
		num2 = in.nextDouble();
		
		System.out.println("Insira um numero: ");
		num3 = in.nextDouble();
		
		soma = num1 + num2 + num3;
		System.out.println("Soma:" + soma);
		
		subtracao = num1 - num2 - num3;
		System.out.println("Subtração:" + subtracao);
		
		if (soma > 10){
			System.out.println("A soma é maior que 10!");
		}
		else{
			System.out.println("A soma não é maior que 10!");
		}
		
	}

}
