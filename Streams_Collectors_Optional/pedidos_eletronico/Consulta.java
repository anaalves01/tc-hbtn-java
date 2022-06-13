import java.util.*;
import java.util.stream.*;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {
        return pedido.getProdutos().stream().filter(x -> x.getCategoria().equals(CategoriaProduto.LIVRO)).collect(Collectors.toList());
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> produtos) {
        return produtos.stream().max(Comparator.comparing(Produto::getPreco)).orElse(null);
    }

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, double precoMinimo) {
        return produtos.stream().filter(x -> x.getPreco() >= precoMinimo).collect(Collectors.toList());
    }

    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedidos) {
        return pedidos.stream().filter(x -> x.getProdutos().stream().anyMatch(p -> p.getCategoria().equals(CategoriaProduto.ELETRONICO))).collect(Collectors.toList());
    }
    
}
