import javax.swing.JOptionPane;

public class ProgramaAgenda {

	public static void main(String[] args) {
		//1
		Agenda a = new Agenda();
		//2
		int n = Integer.parseInt(JOptionPane.showInputDialog("Numero de contatos a serem cadastrados:"));
		//3
		for (int k =0; k< n; k++){
			Contato contato = new Contato();
			Telefone telefone = new Telefone();
			contato.setNome(JOptionPane.showInputDialog("Nome:"));
			contato.setEmail(JOptionPane.showInputDialog("Email:"));
			telefone.setPrefixo(JOptionPane.showInputDialog("Pref:"));
			telefone.setNumero(JOptionPane.showInputDialog("Numero:"));
			telefone.setOperadora(JOptionPane.showInputDialog("Op:"));
			contato.setTelefone(telefone);
			a.cadastraContato(contato);
			
		}
		
		//4
		int quantDeNumCadastrados = a.getNumeroDeContatosCadastrados();
		System.out.println(quantDeNumCadastrados + " números cadastrados!");
		
		//5
		String op = JOptionPane.showInputDialog("Pesquisa contatos da operadora:" );
		
		//6
		int quantContatosOp = a.getQuantDeContDaOperadora(op);
		 System.out.println(quantContatosOp + " contatos da "+ op);
		
		//7
		Contato [] lista = new Contato[n];
		lista = a.pesquisaContatosDaOperadora(op);
		for (int k = 0; k< lista.length; k++){
			System.out.println(lista[k].getNome());
		}
				
		//8
		char letra = JOptionPane.showInputDialog("Pesquisa contatos que começam com a letra: ").charAt(0);
		
		//9 ***** Tá errado çaporra
		int tamanhoDaLista = a.pesquisaContatosComecandoComALetra(letra).length;
		System.out.println(tamanhoDaLista + " começados pela letra " + letra);
		
		//10 *****
		Contato [] lista2 = new Contato[tamanhoDaLista];
		lista2 = a.pesquisaContatosComecandoComALetra(letra);
		for (int k = 0; k < tamanhoDaLista ; k++ ){
			System.out.println(lista2 [k].getNome());
		}
		
		//11
		String pref = JOptionPane.showInputDialog("Pesquisa contatos com o prefixo:" );
		
		//12
		int quantContatosPref = a.getQuantDeContDoPrefixo(pref);
		System.out.println(quantContatosPref + "numeros com o prefixo " + pref);
		
		//13
		Contato [] lista3 = new Contato [quantContatosPref];
		lista3 = a.pesquisaContatosDoPrefixo(pref);
		for (int k = 0; k < quantContatosPref; k++ ){
			System.out.println("Nome: " + lista3[k].getNome());
			System.out.println("Prefixo: " + lista3[k].getTelefone().getPrefixo());
			System.out.println("Telefone: " + lista3[k].getTelefone().getNumero());
		}
		
		//14
		String nomeContato = JOptionPane.showInputDialog("Pesquisar contatos pelo nome: ");
		
		//15
		for (int k = 0; k < n; k++){
			System.out.println(a.PesqTelefoneDoContato(nomeContato));
		}
	}
	
}
