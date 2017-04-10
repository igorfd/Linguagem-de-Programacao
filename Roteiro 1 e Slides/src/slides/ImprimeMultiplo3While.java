package slides;

public class ImprimeMultiplo3While {

	public static void main(String[] args) {
		System.out.println("Imprimindo os múltiplos de 3 até 100!");
		int k =1;
		while(k <= 100){
			if(k%3 == 0 ){
				System.out.println(k);
			}
			k ++;
		}

	}

}
