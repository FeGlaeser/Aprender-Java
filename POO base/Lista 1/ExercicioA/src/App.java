public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa1 = new Pessoa("João", 25, 1.75);
        pessoa1.exibirInfo();
        pessoa1.alterarIdade(26);
        pessoa1.exibirInfo();
    }
}
