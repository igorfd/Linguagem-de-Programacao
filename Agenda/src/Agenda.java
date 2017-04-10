import javax.swing.JOptionPane;
public class Agenda {
	private static void ImprimeContatos(Contato [] contatos, int numContatos){
		for(int k = 0; k < numContatos; k++){
			System.out.println("Nome: " + contatos[k].getNome() 
				+ "\nTelefone:" + contatos[k].getTelefone() 
				+ "\nCelular: "+ contatos[k].getCelular()
				+ "\nEmail: "+ contatos[k].getEmail()+ "\n");
		}
	}
	private static void PesquisaContatos(Contato [] contatos, int numContatos){
		String pesquisa = JOptionPane.showInputDialog("Pesquisar:");
		for (int k = 0; k < numContatos ; k++){
			if(contatos[k].getNome().contains(pesquisa)){
				System.out.println("Nome: " + contatos[k].getNome() 
						+ "\nTelefone:" + contatos[k].getTelefone() 
						+ "\nCelular: "+ contatos[k].getCelular()
						+ "\nEmail: "+ contatos[k].getEmail()+ "\n");
			}
		}
	}
	public static void main(String[] args) {
		boolean acabou = false;
		int maxContatos = 100;
		int numContatos = 0;
		Contato []contatos = new Contato [maxContatos];
		
		while(!acabou && numContatos < maxContatos){
			Contato c = new Contato ();

			c.setNome(JOptionPane.showInputDialog("Nome:"));
			c.setTelefone(JOptionPane.showInputDialog("Telefone:"));
			c.setCelular(JOptionPane.showInputDialog("Celular:"));
			c.setEmail(JOptionPane.showInputDialog("Email:"));
			contatos[numContatos] = c;			
			numContatos ++;			
			String continua = JOptionPane.showInputDialog("Cadastrar mais contatos?" , "S/N");
			if (continua.toUpperCase().charAt(0) == 'N'){
				acabou = !acabou;
			}
			
		}
		boolean loop = true;
		while (loop){
			int menu = Integer.parseInt(JOptionPane.showInputDialog("1 - Todos os contatos \n"
					+ "2- Pesquisar contato\n3.Sair"));
			switch (menu){
			case 1:
				ImprimeContatos(contatos,numContatos);
				break;
			case 2:
				PesquisaContatos(contatos,numContatos);
				break;
			case 3:
				loop = false;
			default:
				System.out.println("Opção inválida");
				break;
			}
		}
		
	}

}
