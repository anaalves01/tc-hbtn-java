import java.util.*;

public class Biblioteca<T> extends Midia {

    private List<T> listaMidias = new ArrayList<>();

    public Biblioteca() { }

    public Biblioteca(List<T> listaMidias) {
        setListaMidias(listaMidias);
    }

    public List<T> getListaMidias() {
        return listaMidias;
    }

    public void setListaMidias(List<T> listaMidias) {
        this.listaMidias = listaMidias;
    }

    public void adicionarMidia(T midia) {
        getListaMidias().add(midia);
    }

    public List<T> obterListaMidias() {
        return getListaMidias();
    }
    
}
