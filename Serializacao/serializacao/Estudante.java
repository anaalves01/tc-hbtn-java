import java.io.Serializable;
import java.util.Objects;

public class Estudante implements Serializable {

    private static final long serialVersionUID = 1L;

    private int idade;
    private String nome;
    private transient String senha;

    public Estudante() { }

    public Estudante(int idade, String nome, String senha) {
        setIdade(idade);
        setNome(nome);
        setSenha(senha);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estudante estudante = (Estudante) o;
        return idade == estudante.idade && Objects.equals(nome, estudante.nome) && Objects.equals(senha, estudante.senha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idade, nome, senha);
    }

    @Override
    public String toString() {
        return String.format("Estudante { nome='%s', idade='%d', senha='%s' }", getNome(), getIdade(), getSenha());
    }

}
