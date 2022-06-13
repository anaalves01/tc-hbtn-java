import java.util.*;
import java.util.stream.*;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {
        return pedido.getProdutos().stream().filter(x -> x.getCategoria().equals(CategoriaProduto.LIVRO)).collect(Collectors.toList());
    }
    
}
