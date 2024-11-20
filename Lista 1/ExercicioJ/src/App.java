public class App {
    public static void main(String[] args) throws Exception {
        BancoDeDadosSimples bd = new BancoDeDadosSimples();
        bd.adicionarPessoa(new Pessoa("João", 30, 1.80f));
        bd.adicionarPessoa(new Pessoa("Maria", 25, 1.65f));
        bd.removerPessoa("João");
        bd.exibirPessoas();
    }
}
