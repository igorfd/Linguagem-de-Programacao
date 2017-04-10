import javax.swing.JOptionPane;

public class AgendaMenu {
	 
    public static void main(String[] args) {
         
        AgendaList minhaAgenda = new AgendaList();
         
        boolean acabou =false;
        while (!acabou){
            String opcao = JOptionPane.showInputDialog("Qual a opção desejada?\n"
            		+ "1.Cadastrar contato\n"
            		+ "2.Pesquisar telefone de contato\n"
            		+ "3.Remove contato\n"
            		+ "4.Mostrar todos os contatos\n"
            		+ "5.Pesquisar numero de contatos cadastrados\n"
            		+ "6.Pesquisar numero de contatos da operadora\n"
            		+ "7.Pesquisar numero de contatos com o prefixo\n"
            		+ "8.Pesquisar contato pelo numero\n"
            		+ "9.Pesquisar contatos começados pela letra\n"
            		+ "10.Pesquisar contato da operadora\n"
            		+ "11.Pesquisar contato pelo prefixo"
            		+ "12.Pesquisar contatos com nomes iniciados com\n"
            		+ "13.Pesquisar contatos com nomes terminados em\n"
            		+ "14.Sair");
            
            if (opcao.equals("1")){
               String nome = JOptionPane.showInputDialog("Qual o nome do contato?");
                String email = JOptionPane.showInputDialog("Qual o email do contato?");
                Contato c = new Contato();
                c.setNome(nome);
                c.setEmail(email);
                String prefixo = JOptionPane.showInputDialog("Qual o prefixo?");
                String numero =  JOptionPane.showInputDialog("Qual o número?");
                String operadora =  JOptionPane.showInputDialog("Qual a operadora?");
                Telefone tel = new Telefone(prefixo,numero,operadora);
                c.setTelefone(tel);
                 
                minhaAgenda.cadastrarContato(c);
            } else if (opcao.equals("2")){
                String nomeContato = JOptionPane.showInputDialog( "Qual o nome do contato a pesquisar?");
                Telefone telEncontrado = minhaAgenda.PesquisaTelefoneDoContato(nomeContato);
                if (telEncontrado != null){
                    JOptionPane.showMessageDialog(null,telEncontrado.toString());
                } else {
                    JOptionPane.showMessageDialog(null,"Não foi encontrado telefone para:"+nomeContato);
                }
            } else if (opcao.equals("3")){
                String nomeDoContatoARemover = JOptionPane.showInputDialog("Qual o nome do contato a remover?");
                int numeroContatosAntes =  minhaAgenda.getNumeroDeContatosCadastrados();
                minhaAgenda.removerContato(nomeDoContatoARemover);
                int numContatosDepois = minhaAgenda.getNumeroDeContatosCadastrados();
                if (numContatosDepois < numeroContatosAntes){
                    JOptionPane.showMessageDialog(null, "Contato removido com sucesso");
                     
                } else {
                    JOptionPane.showMessageDialog(null, "Contato não removido");
                }
            
            }else if(opcao.equals("4")){
            	JOptionPane.showMessageDialog(null, minhaAgenda.getContatos());
            }
            else if(opcao.equals("5")){
            	JOptionPane.showMessageDialog(null, minhaAgenda.getNumeroDeContatosCadastrados());
            }
            else if(opcao.equals("6")){
            	String op = JOptionPane.showInputDialog("Operadora:");
            	JOptionPane.showMessageDialog(null, minhaAgenda.getQuantDeContDaOperadora(op));
            }
            else if(opcao.equals("7")){
            	String pref = JOptionPane.showInputDialog("Prefixo:");
            	JOptionPane.showMessageDialog(null, minhaAgenda.getQuantDeContDoPrefixo(pref));
            }
            else if(opcao.equals("8")){
            	String pref = JOptionPane.showInputDialog("Pref:");
            	String num = JOptionPane.showInputDialog("Num:");
            	JOptionPane.showMessageDialog(null, minhaAgenda.pesquisaNomePeloNum(pref, num));
            }
            else if(opcao.equals("9")){
            	char letra = JOptionPane.showInputDialog("Letra:").charAt(0);
            	JOptionPane.showMessageDialog(null, minhaAgenda.pesquisaContatosComecandoComALetra(letra));
            }
            else if(opcao.equals("10")){
            	String op = JOptionPane.showInputDialog("Op:");
            	JOptionPane.showMessageDialog(null, minhaAgenda.pesquisaContatosDaOperadora(op));
            }
            else if(opcao.equals("11")){
            	String pref = JOptionPane.showInputDialog("Pref:");
            	JOptionPane.showMessageDialog(null, minhaAgenda.pesquisaContatosDaOperadora(pref));
            }
            else if (opcao.equals("12")){
            	String s = JOptionPane.showInputDialog("Faça sua busca:");
            	JOptionPane.showMessageDialog(null, minhaAgenda.pesquisaContatosIniciadosCom(s));
            }
            else if (opcao.equals("13")){
            	String s = JOptionPane.showInputDialog("Faça sua busca:");
            	JOptionPane.showMessageDialog(null, minhaAgenda.pesquisaContatosTerminadoEm(s));
            }
            else if (opcao.equals("14")){
                acabou = true;
            }
             
        }
    }
}
