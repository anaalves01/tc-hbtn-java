public class Jornal extends Midia {
    private int quantidadeArtigos;

    public Jornal() { }

    public Jornal(int quantidadeArtigos) {
        setQuantidadeArtigos(quantidadeArtigos);
    }

    public Jornal(String nome, int quantidadeArtigos) {
        super(nome);
        setQuantidadeArtigos(quantidadeArtigos);
    }

    public int getQuantidadeArtigos() {
        return quantidadeArtigos;
    }

    public void setQuantidadeArtigos(int quantidadeArtigos) {
        this.quantidadeArtigos = quantidadeArtigos;
    }

}
