package bytebank;
public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.setNome("Marcelo Benjamim");
		paulo.setCpf("248.852.050-00");
		paulo.setProfissao("programador");

		Conta contaDoPaulo = new Conta(8947,739060);
		contaDoPaulo.deposita(100);

		contaDoPaulo.setTitular(paulo);
		System.out.println(contaDoPaulo.getTitular().getNome());
		System.out.println(contaDoPaulo.getTitular());

	}
}