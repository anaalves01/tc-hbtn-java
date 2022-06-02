import java.util.*;

public class Armazem<T> implements Armazenavel<T> {

    private Map<String, T> map = new TreeMap<>();
    
    public Armazem() { }

    public Armazem(Map<String, T> map) {
        this.map = map;
    }

    public Map<String, T> getMap() {
        return map;
    }

    public void setMap(Map<String, T> map) {
        this.map = map;
    }

    @Override
    public void adicionarAoInventario(String nome, T valor) {
        map.put(nome, valor);
    }

    @Override
    public T obterDoInventario(String nome) {
        return map.get(nome);
    }
    
    
}
