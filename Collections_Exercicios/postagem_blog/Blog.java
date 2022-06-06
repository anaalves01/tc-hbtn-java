import java.util.*;

public class Blog {

    private Set<Post> postagens;

    public Blog() { 
        setPostagens(new HashSet<>());
    }

    public Blog(Set<Post> postagens) {
        setPostagens(postagens);
    }

    public Set<Post> getPostagens() {
        return postagens;
    }

    public void setPostagens(Set<Post> postagens) {
        this.postagens = postagens;
    }

    public void adicionarPostagem(Post post) {
        if (postagens.contains(post)) {
            throw new IllegalArgumentException("Postagem jah existente");
        }

        getPostagens().add(post);
    }

    public Set<Autor> obterTodosAutores() {
        Set<Autor> autores = new TreeSet<>();

        for (Post post : getPostagens()) {
            autores.add(post.getAutor());
        }

        return autores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias, Integer> contagem = new TreeMap<>();

        for (Categorias categoria : getCategoria()) {
            if (contagem.containsKey(categoria)) {
                contagem.put(categoria, contagem.get(categoria) + 1);
            } else {
                contagem.put(categoria, 1);
            }
        }

        return contagem;
    }

    private List<Categorias> getCategoria() {
        List<Categorias> categorias = new ArrayList<>();

        for (Post post : getPostagens()) {
            categorias.add(post.getCategoria());
        }

        return categorias;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria) {
        Set<Post> posts = new TreeSet<>();

        for (Post post : getPostagens()) {
            if (post.getCategoria().equals(categoria)) {
                posts.add(post);
            }
        }

        return posts;
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> posts = new TreeSet<>();

        for (Post post : getPostagens()) {
            if (post.getAutor().equals(autor)) {
                posts.add(post);
            }
        }

        return posts;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> posts = new TreeMap<>();

        for (Post post : getPostagens()) {
            if (posts.containsKey(post.getCategoria())) {
                posts.get(post.getCategoria()).add(post);
            } else {
                posts.put(post.getCategoria(), obterPostsPorCategoria(post.getCategoria()));
            }
        }

        return posts;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> posts = new TreeMap<>();

        for (Post post : getPostagens()) {
            if (posts.containsKey(post.getAutor())) {
                posts.get(post.getAutor()).add(post);
            } else {
                posts.put(post.getAutor(), obterPostsPorAutor(post.getAutor()));
            }
        }

        return posts;
    }

}
