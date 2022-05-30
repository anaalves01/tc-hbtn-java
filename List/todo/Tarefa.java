public class Tarefa {

    private String descricao;
    private boolean estahFeita;
    private int identificador;

    public Tarefa() { }

    public Tarefa(String descricao, int identificador) {
        this.descricao = descricao;
        this.identificador = identificador;
    }

    public Tarefa(String descricao, boolean estahFeita, int identificador) {
        this.descricao = descricao;
        this.estahFeita = estahFeita;
        this.identificador = identificador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isEstahFeita() {
        return estahFeita;
    }

    public void setEstahFeita(boolean estahFeita) {
        this.estahFeita = estahFeita;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void modificarDescricao(String modificacao) throws Exception {
        if (modificacao.equals("") || modificacao.isEmpty() || modificacao.equals(null)) {
            throw new IllegalArgumentException("Descricao de tarefa invalida");
        } else {
            this.descricao = modificacao;
        }
    }

}
