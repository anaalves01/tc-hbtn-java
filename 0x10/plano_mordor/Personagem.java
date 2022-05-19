import comida.Comida;
import humor.Feliz;
import humor.Humor;
import humor.Irritado;
import humor.MuitoFeliz;
import humor.Triste;

public class Personagem {

    private int pontosDeFelicidade;

    public int getPontosDeFelicidade() {
        return pontosDeFelicidade;
    }

    public void setPontosDeFelicidade(int pontosDeFelicidade) {
        this.pontosDeFelicidade = pontosDeFelicidade;
    }

    public void comer(Comida[] comidas) {
        for (Comida comida : comidas) {
            int pontos = this.getPontosDeFelicidade();
            setPontosDeFelicidade(pontos += comida.getPontosDeFelicidade());
        }
    }

    public Humor obterHumorAtual() {
        Humor humorAtual;
        if (this.getPontosDeFelicidade() < -5) {
            humorAtual = new Irritado();
        } else if (this.getPontosDeFelicidade() >= -5 && this.getPontosDeFelicidade() <= 0) {
            humorAtual = new Triste();
        } else if (this.getPontosDeFelicidade() >= 1 && this.getPontosDeFelicidade() <= 15) {
            humorAtual = new Feliz();
        } else {
            humorAtual = new MuitoFeliz();
        }
        return humorAtual;
    }

    @Override
    public String toString() {
        return getPontosDeFelicidade() + " - " + obterHumorAtual().getClass().getSimpleName();
    }

}