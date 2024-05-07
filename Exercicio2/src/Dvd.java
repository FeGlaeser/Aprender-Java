public class Dvd {
    private Midia midiaDvd;
    private String autor;
    private double duracao;

    //criar Dvd
    public void CriarDvd(Midia midiaDvd, String autor, double duracao) {
        this.autor = autor;
        this.duracao = duracao;
        this.midiaDvd = midiaDvd;}
    
    //midiaDvd
    public Midia getMidiaDvd() {
        return this.midiaDvd;}
    public void setMidiaDvd(Midia midiaDvdNova) {
        this.midiaDvd = midiaDvdNova;}

    //autor
    public String getAutor() {
        return this.autor;}
    public void setAutor(String autorNovo) {
        this.autor = autorNovo;}
    
    //duração
    public double getDuracao() {
        return duracao;}
    public void setDuracao(int novaDuracao) {
        this.duracao = novaDuracao;}
 
}
