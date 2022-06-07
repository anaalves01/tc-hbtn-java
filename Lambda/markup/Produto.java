import java.util.function.*;

public class Produto {

    private String nome;
    private Double preco;
    private Double percentualMarkUp = 0.1;

    public Supplier<Double> precoComMarkUp = () -> getPreco() + (getPreco() * getPercentualMarkUp());
    public Consumer<Double> atualizarMarkUp = (Double valor) -> setPercentualMarkUp(valor/100);

    public Produto() { }

    public Produto(Double preco, String nome) {
        setPreco(preco);
        setNome(nome);
    }

    public Produto(String nome, Double preco, Double percentualMarkUp) {
        setNome(nome);
        setPreco(preco);
        setPercentualMarkUp(percentualMarkUp);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getPercentualMarkUp() {
        return percentualMarkUp;
    }

    public void setPercentualMarkUp(Double percentualMarkUp) {
        this.percentualMarkUp = percentualMarkUp;
    }
    
}
