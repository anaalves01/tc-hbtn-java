import java.util.*;

public class Blog {

    List<Post> postagens = new ArrayList<>();

    public Blog() { }

    public Blog(List<Post> postagens) {
        setPostagens(postagens);
    }

    public List<Post> getPostagens() {
        return postagens;
    }

    public void setPostagens(List<Post> postagens) {
        this.postagens = postagens;
    }

    public void adicionarPostagem(Post post) {
        getPostagens().add(post);
    }

    public Set<String> obterTodosAutores() {
        Set<String> autores = new TreeSet<>();

        for (Post post : getPostagens()) {
            autores.add(post.getAutor());
        }

        return autores;
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        Map<String, Integer> contagem = new TreeMap<>();

        for (String categoria : getCategoria()) {
            if (contagem.containsKey(categoria)) {
                Integer contador = contagem.get(categoria);
                contagem.put(categoria, contador++);
            } else {
                contagem.put(categoria, 1);
            }
        }

        return contagem;
    }

    private List<String> getCategoria() {
        List<String> categorias = new ArrayList<>();

        for (Post post : getPostagens()) {
            categorias.add(post.getCategoria());
        }

        return categorias;
    }

}
