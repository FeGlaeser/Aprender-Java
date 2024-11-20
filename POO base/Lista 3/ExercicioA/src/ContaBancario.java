public class ContaBancario {
    public String titular;
    private double saldo;

    public ContaBancario(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public ContaBancario(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public void depositarValor(double valor) {
        this.saldo += valor;
    }

    public void sacarValor(double valor) {
        if (this.saldo - valor < 0) 
            System.out.println("Saldo insuficiente para saque.");
        else 
            this.saldo -= valor;
    }

    @Override
    public String toString() {
        return "\nTitular: " + this.titular +"\nSaldo: " + this.saldo + " R$";
    }
}