import java.util.HashMap;
import java.util.HashSet;

public class ListaTelefonica {

    private HashMap<String, HashSet<Telefone>> listaTelefonica;

    public ListaTelefonica() {
        setListaTelefonica(new HashMap<>());
    }

    public void setListaTelefonica(HashMap<String, HashSet<Telefone>> listaTelefonica) {
        this.listaTelefonica = listaTelefonica;
    }

    public void adicionarTelefone(String nome, Telefone telefone) {
            if (this.listaTelefonica.containsKey(nome)) {
                if (this.listaTelefonica.get(nome).contains(telefone)) {
                    throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
                } else {
                    for (String s : this.listaTelefonica.keySet()) {
                        if (s.equals(nome))
                            continue;

                        if (this.listaTelefonica.get(s).contains(telefone))
                            throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
                    }
                    this.listaTelefonica.get(nome).add(telefone);
                }
            } else {
                HashSet<Telefone> telefones = new HashSet<>();
                telefones.add(telefone);
                this.listaTelefonica.put(nome, telefones);
            }
    }

    public HashSet<Telefone> buscar(String nome) {
        return listaTelefonica.getOrDefault(nome, null);
    }

}
