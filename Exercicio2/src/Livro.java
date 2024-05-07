public class Livro {
    private Midia midiaLivro;
    private int numeroPaginas;
    private String autor;

    //criar livro
    public void criarLivro(String autor, int numeroPaginas, Midia midia) {
        this.autor = autor;
        this.midiaLivro = midia;
        this.numeroPaginas = numeroPaginas;}
    
    //numero de paginas
    public void setNumeroDepaginas(int novoNumero) {
        this.numeroPaginas = novoNumero;}
    public int getNumeroDePaginas() {
        return this.numeroPaginas;}
    
    //midiaDvd
    public Midia getMidiaLivro() {
        return this.midiaLivro;}
    public void setMidiaLivro(Midia midiaDvdNova) {
        this.midiaLivro = midiaDvdNova;}

    //autor
    public void setAutor(String novoAutor) {
        this.autor = novoAutor;}
    public String getAutor() {
        return this.autor;}
    
}
