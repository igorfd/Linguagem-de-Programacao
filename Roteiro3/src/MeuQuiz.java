import javax.swing.JOptionPane;

public class MeuQuiz {
	public static String [] carregaPerguntasDoQuiz (int quant) {
		String [] perguntas = new String[quant];
		for (int k = 0; k < quant; k++){
			perguntas [k] = JOptionPane.showInputDialog("Digite a pergunta " + (k+1) + ":" );
		}
		
		return perguntas;
	}
	public static String [] carregaGabaritoDoQuiz(int quant){
		String [] gabarito = new String[quant];
		for(int k= 0; k<quant; k++){
			gabarito [k] = JOptionPane.showInputDialog(null, "Digite a resposta da questão "+ (k+1));
		}
		return gabarito;
			
	}
	public static String [] responderQuiz (String [] perguntas){	
		String [] respostaUsuario = new String[perguntas.length];
		for (int k = 0; k < perguntas.length; k++){
			respostaUsuario [k] = JOptionPane.showInputDialog("Resposta da pergunta" + (k+1));
		}
		return respostaUsuario;
	}
	public static String corrigirRespostas(String [] perguntas, String [] gabarito, String [] respostas){
		String correcao;
		int soma = 0;
		for (int k = 0; k < perguntas.length; k++){
			if(gabarito[k].equals(respostas[k])){
				soma ++;
			}
		}
		double porcentagem = (soma/perguntas.length)*100;
		correcao = ""+ soma + " " + porcentagem + "%";
		return correcao;
	}
	
	public static void main(String[] args) {
		boolean sair = false;
		int entrada;
		String correcao;
		String [] perguntas = null;
		String [] gabarito = null;
		String [] respostasDoUsuario = null;
		int quant = Integer.parseInt(JOptionPane.showInputDialog("Digite quantas perguntas terão o quiz? "));
		while(sair == false){
			entrada = Integer.parseInt(JOptionPane.showInputDialog("MENU \n 1. Carregar perguntas do Quiz. \n 2.Carregar gabarito \n 3.Responder o quiz.\n 4. Corrigir respostas \n 5.Sair."));
			if(entrada == 5){
				sair = true;
				break;	
			}else{
				
			
				switch(entrada){
				
				case 1:
					perguntas = carregaPerguntasDoQuiz(quant);
					for (int k= 0; k < quant; k++){
						JOptionPane.showMessageDialog(null, "Pergunta "+ (k+1) + " " + perguntas[k]);
					}break;
					
				case 2:
					gabarito = carregaGabaritoDoQuiz(quant);
					for (int k = 0; k < quant; k++){
						JOptionPane.showMessageDialog(null,"Resposta da pergunta " + (k+1) + " " +  gabarito[k]);
					}break;
					
				case 3:
					perguntas = carregaPerguntasDoQuiz(quant);
					respostasDoUsuario = responderQuiz(perguntas);
					for (int k = 0; k < quant; k++){
						JOptionPane.showMessageDialog(null, "Resposta da " + (k+1) + " pergunta: "+ respostasDoUsuario[k]);
					}break;
					
				case 4:
					correcao = corrigirRespostas(perguntas ,gabarito , respostasDoUsuario);
					JOptionPane.showMessageDialog(null, "Você obtve: "+ correcao + "(pontos/ percentual de acerto)");
					break;
				
				case 5:
					 sair = true;
					 break;

				default:
					JOptionPane.showMessageDialog(null, "Número incorreto!");
					break;
				}
			}
			
		}
	}
}
