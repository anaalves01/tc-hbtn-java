import java.util.ArrayList;

public class Pedido {

    private ArrayList<PedidoCookie> cookies = new ArrayList<PedidoCookie>();
    
    public Pedido() { }

    public Pedido(ArrayList<PedidoCookie> cookies) {
        this.cookies = cookies;
    }

    public void adicionarPedidoCookie(PedidoCookie pedidoCookie) {
        cookies.add(pedidoCookie);
    }

    public int removerSabor(String sabor) {
        int totalDeCaixas = 0;
        
        for (PedidoCookie pedidoCookie : cookies) {
            if (pedidoCookie.getSabor().equals(sabor))
                totalDeCaixas += pedidoCookie.getQuantidadeCaixas();
        }

        cookies.removeIf(pedido -> pedido.getSabor().equals(sabor));

        return totalDeCaixas;
    }

    public int obterTotalCaixas() {
        int totalDeCaixas = 0;

        for (PedidoCookie pedidoCookie : cookies) {
            totalDeCaixas += pedidoCookie.getQuantidadeCaixas();
        }

        return totalDeCaixas;
    }

}