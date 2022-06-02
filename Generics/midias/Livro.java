public class Livro extends Midia {
    private int edicao;

    public Livro() { }

    public Livro(int edicao) {
        setEdicao(edicao);
    }

    public Livro(String nome, int edicao) {
        super(nome);
        setEdicao(edicao);
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }


}
