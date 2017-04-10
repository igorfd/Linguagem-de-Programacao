package slides;

public class ImprimeMultiplos3 {

	public static void main(String[] args) {
		System.out.println("Imprimindo os multiplos de 3 até 100!");
		for (int k = 1; k <= 100; k++ ){
			if(k%3 == 0){
				System.out.println(k);
			}
		}

	}

}
