
public class TestaGetESet {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente bruna = new Cliente();
		//conta.titular = bruna;
		bruna.setNome("bruna guimaraes");
		
		conta.setTitular(bruna);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programadora");
		//agora em duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programadora");
		
		System.out.println(titularDaConta);
		System.out.println(bruna);
		System.out.println(conta.getTitular());
	}

}
