public class App {
    public static void main(String[] args) throws Exception {
        ContaBancaria contaFernando = new ContaBancaria("Fernando", -4);
        contaFernando.depositarDinheiro(500);
        System.out.print(contaFernando.toString());

        
    }
}
