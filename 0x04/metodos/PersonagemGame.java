public class PersonagemGame {
    private int saudeAtual;
    private String nome;

    public int getSaudeAtual() {
        return this.saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void receberCura(int quantidadeDeCura) {
        if ((this.saudeAtual + quantidadeDeCura) > 100) {
            this.setSaudeAtual(100);
        } else {
            this.setSaudeAtual(this.saudeAtual + quantidadeDeCura);
        }
    }

    public void tomarDano(int quantidadeDeDano) {
        if (this.saudeAtual <= quantidadeDeDano) {
            this.setSaudeAtual(0);
        } else {
            this.setSaudeAtual(this.saudeAtual - quantidadeDeDano);
        }
    }

}