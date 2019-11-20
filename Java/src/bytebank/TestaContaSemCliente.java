package bytebank;
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta(8947,739060);
		System.out.println(contaDaMarcela.getSaldo());

		contaDaMarcela.setTitular(new Cliente());
		System.out.println(contaDaMarcela.getTitular());

		contaDaMarcela.getTitular().setNome("Jonathan");
		System.out.println(contaDaMarcela.getTitular().getNome());

	}
}