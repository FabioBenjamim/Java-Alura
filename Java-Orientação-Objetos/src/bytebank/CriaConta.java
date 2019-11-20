package bytebank;
public class CriaConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta(8947,739060);
        primeiraConta.deposita(500);
        System.out.println(primeiraConta.getSaldo());

        primeiraConta.deposita(700);
        System.out.println(primeiraConta.getSaldo());

        Conta segundaConta = new Conta(8948,739061);
        segundaConta.deposita(150);

        System.out.println("primeira conta tem " + primeiraConta.getSaldo());
        System.out.println("segunda conta tem " + segundaConta.getSaldo());

        System.out.println("referenciar: " + primeiraConta);
    }

}