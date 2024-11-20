public class ContaBancaria {
    String numeroConta;
    double saudo;

    ContaBancaria(String numeroConta, double saudo) {
        this.numeroConta = numeroConta;
        this.saudo = saudo;
    }

    void depositar(double valor) {
        this.saudo += valor;
    }
    void sacar(double valor) {
        this.saudo -= valor;
    }
    void exibirSaldo() {
        System.out.println(saudo);
    }
}