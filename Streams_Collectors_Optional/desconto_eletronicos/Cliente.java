public class Cliente {
    
    private int codigo;
    private String nome;
    private boolean premium;
    
    public Cliente() {}

    public Cliente(int codigo, String nome, boolean premium) {
        setCodigo(codigo);
        setNome(nome);
        setPremium(premium);
    }

    public int getCodigo() {
        return codigo;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public boolean isPremium() {
        return premium;
    }


    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigo;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + (premium ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cliente other = (Cliente) obj;
        if (codigo != other.codigo)
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (premium != other.premium)
            return false;
        return true;
    }
    
}
