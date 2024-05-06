public class Midia {
    private String titulo;
    private int anoDeLancamento;
    private boolean emprestimoDisponivel;

    //metodo para criar
    public void criarMidia(String titulo, int anoDeLancamento, boolean emprestimoDisponivel) {
        this.anoDeLancamento = anoDeLancamento;
        this.titulo = titulo;
        this.emprestimoDisponivel = emprestimoDisponivel;}

    //titulo
    public void setTitulo(String titulo){
        this.titulo = titulo;}
    public String getTitulo() {
        return this.titulo;}

    //anoDeLancamento
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;}
    public int getAnoDeLancamento() {
        return this.anoDeLancamento;}

    //emprestimoDisponivel
    public void setEmprestimoDisponivel(boolean emprestimoDisponivel) {
        this.emprestimoDisponivel = emprestimoDisponivel;}
    public boolean getEmprestimoDisponivel() {
        return emprestimoDisponivel;}
}
