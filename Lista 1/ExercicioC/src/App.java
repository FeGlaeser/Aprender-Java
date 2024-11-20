public class App {
    public static void main(String[] args) throws Exception {
        Carro carro1 = new Carro("Civic", "Prata", 2021);
        Carro carro2 = new Carro("Corolla", "Preto", 2020);
        carro1.exibirDetalhes();
        carro2.exibirDetalhes();
    }
}
