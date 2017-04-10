package exBanco;

public class TestaBanco {

	public static void main(String[] args) {
		Banco b = new Banco();
		Agencia a = new Agencia("44-3");
		Conta cEspecial1 = new ContaEspecial("333-9", "434454-74", 300.00);
		b.cadastrarAgencia(a);
		System.out.println(b.pesquisarAgencia(a.getNumeroAgencia()).toString());
		
		a.cadastrarConta(cEspecial1);
		
		if(cEspecial1.getSaldoDisponivel()== 300.00){
			System.out.println(true);
		}
		else{
			System.out.println(false);
		}
		
		Conta cEspecial2 = new ContaEspecial("444-5", "434454-74", 100.00);
		a.cadastrarConta(cEspecial2);
		System.out.println(cEspecial2.sacar(10.0));
		System.out.println(a.pesquisaContasDoCliente("434454-74").size());
		
		
		

	}

}
