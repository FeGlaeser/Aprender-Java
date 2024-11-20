public class ContaBancaria {
    private String titular;
    private double saldo;
    
    ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        if (saldo >= 0)
            this.saldo = saldo;
        else {
            System.out.println("Uma conta não pode ser gerada com saldo negativo");
        }
    }

    void depositarDinheiro(double valorDeposito) {
        this.saldo = this.saldo + valorDeposito;
    }

    void sacarDinheiro(double valorSaque) {
        if (this.saldo > 0)
            this.saldo = this.saldo - valorSaque;
        else {
            System.out.print("Impossivel realizar o saque, saldo insuficiente.");
        }

    }

    String getTitular() {
        return this.titular;
    }

    void setTitular(String titular) {
        this.titular = titular;
    }

    double getSaldo() {
        return this.saldo;
    }

    void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Nome do Titular: " + this.titular + "\nSaldo da conta: " + this.saldo + " R$";
    }
}