public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.setPercentualDesconto(percentualDesconto);
        this.setItens(itens);
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public ItemPedido[] getItens() {
        return itens;
    }

    public void setItens(ItemPedido[] itens) {
        this.itens = itens;
    }

    public double calcularTotal() {
        double valorLiquido = 0, valorTotal = 0;

        for (ItemPedido itemPedido : itens) {
            valorLiquido = itemPedido.getProduto().obterPrecoLiquido();
            valorTotal += (valorLiquido * itemPedido.getQuantidade()); 
        }
        
        valorTotal -= ((percentualDesconto / 100) * valorTotal);

        return valorTotal;
    }

}
