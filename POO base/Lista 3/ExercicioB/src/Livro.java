public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private boolean disponivel = true;

    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void emprestarLivro() {
        if (disponivel)
            this.disponivel = false;
    }

    public void devolverLivro() {
        if (!disponivel)
            this.disponivel = true;
    }

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public int getNumeroPaginas() {
        return this.numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "\nTitulo: " + this.titulo +
                "\nAutor: " + this.autor +
                "\nNúmero de Páginas: " + this.numeroPaginas +
                "\nDisponivel: " + this.disponivel;
    }
}
