public class Video extends Midia {
    private int duracao;

    public Video() { }

    public Video(int duracao) {
        setDuracao(duracao);
    }

    public Video(String nome, int duracao) {
        super(nome);
        setDuracao(duracao);
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
}
