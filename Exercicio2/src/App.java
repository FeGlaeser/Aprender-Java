
public class App {
    public static void main(String[] args) {
        Midia novMidia = new Midia();
        novMidia.criarMidia("A viagem", 2005, true);
        Livro novoLivro = new Livro();
        Dvd novoDvd = new Dvd();

        novoDvd.CriarDvd(novMidia, "Fernando Glaeser", 4);
        novoLivro.criarLivro("Fernando glaeser", 256, novMidia);
        System.out.println("Midia");
        System.out.println(novMidia.getTitulo());
        System.out.println(novMidia.getAnoDeLancamento());
        System.out.println(novMidia.getEmprestimoDisponivel());

        System.out.println("Livro");
        System.out.println(novoLivro.getAutor());
        System.out.println(novoLivro.getNumeroDePaginas());
        System.out.println(novoLivro.getMidiaLivro());

        System.out.println("Dvd");
        System.out.println(novoDvd.getMidiaDvd());
        System.out.println(novoDvd.getAutor());
        System.out.println(novoDvd.getDuracao());
        

    }
}
