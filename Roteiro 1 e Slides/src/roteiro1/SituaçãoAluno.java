package roteiro1;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;


public class SituaçãoAluno {

	
	public static int carregarQuantNotas (){
		int quant = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de notas: "));
		return quant;
	}
	public static double [] carregarArrayDeNotas(int tamanhoDoArray){
		double [] notas = new double[tamanhoDoArray];
		for (int k = 0; k<tamanhoDoArray; k++){
			notas[k]= Double.parseDouble(JOptionPane.showInputDialog((k+1) +"ª Nota: "));
		}
		return notas;
	}
	public static double calculaSomaDasNotas (double [] notas){
		double soma = 0;
		for (int k = 0; k < notas.length; k++){
			soma += notas [k];
		}
		return soma;
	}
	public static double calculaMedia ( double soma, int quantNotas){
		double media = soma/ quantNotas;
		return media;
	}
	public static void testaSituacaoAluno (double media){
		if (media >= 7.0 && media <= 10.0){
			JOptionPane.showMessageDialog(null, "Você foi APROVADO com média: "+ media +"!!");
		}else if(media < 7.0 && media >= 4.0){
			JOptionPane.showMessageDialog(null, "Você está na final com média: "+ media);
			JOptionPane.showMessageDialog(null, "Você precisa de " + CalculaNotaPraFinal(media) + " na prova final");
		}else if(media > 0){
			JOptionPane.showMessageDialog(null, "Você foi reprovado por media, com média: "+ media);
		}else{
			JOptionPane.showMessageDialog(null, "Notas inválidas!");
		}
		
	}
	public static double CalculaNotaPraFinal (double media){
		double notaPraPassar = (5 - 0.6*media)/0.4;
		
		return notaPraPassar;	
	}
	public static double doubleTwo (double numero){
		DecimalFormat df = new DecimalFormat("#0.00");
		double doubleFormatado = Double.parseDouble(df.format(numero));
		return doubleFormatado;
	/////////////////////////////////////////////////////////////////?????????????????????????????????????????????????	
	}

	
	
	
	
	
	
	
	

	public static void main (String [] args){
		int n = carregarQuantNotas();
		double [] notas = carregarArrayDeNotas(n);
		double soma = calculaSomaDasNotas(notas);
		double media = calculaMedia(soma, n);
		testaSituacaoAluno(media);
		
	}	
		
		

	}

