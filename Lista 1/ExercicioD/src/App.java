public class App {
    public static void main(String[] args) throws Exception {
        ContaBancaria conta1 = new ContaBancaria("12345-6", 500.00);
        conta1.depositar(150.00);
        conta1.sacar(100.00);
        conta1.exibirSaldo();
    }
}
