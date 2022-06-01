import java.util.ArrayList;
import java.util.HashMap;

public class ListaTelefonica {

    private HashMap<String, ArrayList<Telefone>> listaTelefonica = new HashMap<>();

    public ListaTelefonica() { }

    public ListaTelefonica(HashMap<String, ArrayList<Telefone>> listaTelefonica) {
        this.listaTelefonica = listaTelefonica;
    }

    public HashMap<String, ArrayList<Telefone>> getListaTelefonica() {
        return listaTelefonica;
    }

    public void setListaTelefonica(HashMap<String, ArrayList<Telefone>> listaTelefonica) {
        this.listaTelefonica = listaTelefonica;
    }

    public void adicionarTelefone(String nome, Telefone telefone) {
        ArrayList<Telefone> telefones = new ArrayList<Telefone>();

        if (listaTelefonica.containsKey(nome)) {
            telefones = listaTelefonica.get(nome);
        }
        
        telefones.add(telefone);
        listaTelefonica.put(nome, telefones);
    }

    public ArrayList<Telefone> buscar(String nome) {
        return listaTelefonica.getOrDefault(nome, null);
    }

}
