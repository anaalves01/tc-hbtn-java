public class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;

    public PersonagemGame(int saudeAtualInicial, String nomeInicial) {
        this.setSaudeAtual(saudeAtualInicial);
        this.setNome(nomeInicial);
    }

    public int getSaudeAtual() {
        return this.saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;

        if (this.saudeAtual > 0) {
            this.status = "vivo";
        } else {
            this.status = "morto";
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome == "") {   
        } else {
            this.nome = nome;
        }
    }

    public String getStatus() {
        return this.status;
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