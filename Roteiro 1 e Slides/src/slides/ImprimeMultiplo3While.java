package slides;

public class ImprimeMultiplo3While {

	public static void main(String[] args) {
		System.out.println("Imprimindo os m�ltiplos de 3 at� 100!");
		int k =1;
		while(k <= 100){
			if(k%3 == 0 ){
				System.out.println(k);
			}
			k ++;
		}

	}

}
