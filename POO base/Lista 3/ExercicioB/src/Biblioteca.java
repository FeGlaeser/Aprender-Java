import java.util.LinkedList;

public class Biblioteca {
    private static LinkedList<Livro> listaLivros = new LinkedList<>();

    public static void AdicionarLivros(Livro livro) {
        listaLivros.add(livro);
    }

    public static void listarLivros() {
        for (Livro livro : listaLivros) {
            if (livro.isDisponivel())
                System.out.println(livro.toString());
        }
    }
}