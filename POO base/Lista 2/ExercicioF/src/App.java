public class App {
    public static void main(String[] args) throws Exception {
        Blibioteca blibioteca = new Blibioteca();

        blibioteca.adicionarLivros(new Livro("A arte da guerra", "Sun Tzu"));
        blibioteca.adicionarLivros(new Livro("Call of Carlos", "HP Lovecraft"));

        blibioteca.listarLivros();

        blibioteca.emprestarLivro("A arte da guerra");

        blibioteca.listarLivros();

        blibioteca.devolverLivro("A arte da guerra");

        blibioteca.listarLivros();

    }
}
