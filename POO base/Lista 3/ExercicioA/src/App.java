public class App {
    public static void main(String[] args) throws Exception {
        ContaBancario fernando = new ContaBancario("Fernando Glaeser da Silva");

        fernando.depositarValor(100);

        System.out.println(fernando.toString());

        fernando.sacarValor(100);

        System.out.println(fernando.toString());


        fernando.sacarValor(111);

        System.out.println(fernando.toString());


        fernando.depositarValor(4000);

        System.out.println(fernando.toString());
    }
}
