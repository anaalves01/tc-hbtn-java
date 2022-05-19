package comida;

public class Comida {

    protected int pontosDeFelicidade;

    public Comida() {}

    public Comida(int pontosDeFelicidade) {
        this.setPontosDeFelicidade(pontosDeFelicidade);
    }

    public int getPontosDeFelicidade() {
        return pontosDeFelicidade;
    }

    public void setPontosDeFelicidade(int pontosDeFelicidade) {
        this.pontosDeFelicidade = pontosDeFelicidade;
    }
    
}