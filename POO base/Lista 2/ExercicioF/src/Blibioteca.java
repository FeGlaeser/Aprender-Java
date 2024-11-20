import java.util.LinkedList;

public class Blibioteca {
    LinkedList<Livro> livrosBliblioteca = new LinkedList<>();

    void adicionarLivros(Livro livro) {
        livrosBliblioteca.add(livro);
    }

    void emprestarLivro(String titulo) {
        for (Livro livro : livrosBliblioteca) {
            if (livro.getTitulo().equals(titulo)) {
                livro.emprestar();
                break;
            }
        }
    }

    void devolverLivro(String titulo) {
        for (Livro livro : livrosBliblioteca) {
            if (livro.getTitulo().equals(titulo)) {
                livro.devolver();
                break;
            }
        }
    }

    void listarLivros() {
        for (Livro livro : livrosBliblioteca) 
            System.out.print(livro.toString());
        System.out.println();
    }
}
