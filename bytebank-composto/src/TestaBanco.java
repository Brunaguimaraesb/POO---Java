
public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente bruna = new Cliente();
		bruna.nome = "Bruna Guimaraes";
		bruna.cpf = "222.222.222-22";
		bruna.profissao = "programadora";
		
		Conta contaDaBruna = new Conta();
		contaDaBruna.deposita(100);
		
		contaDaBruna.titular = bruna;
		System.out.println(contaDaBruna.titular.nome);
		System.out.println(contaDaBruna.titular);
		System.out.println(bruna);

	}

}
