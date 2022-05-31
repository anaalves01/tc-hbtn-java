import java.util.*;

public class Cliente {

    private String nome;
    private ArrayList<Double> transacoes = new ArrayList<Double>();

    public Cliente() { }

    public Cliente(String nome, double valorInicialTransacao) {
        this.nome = nome;
        this.transacoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Double> getTransacoes() {
        return transacoes;
    }

    public void setTransacoes(ArrayList<Double> transacoes) {
        this.transacoes = transacoes;
    }
    
    public void adicionarTransacao(double valorTransacao) {
        this.transacoes.add(valorTransacao);
    }

}
