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

    public void apresentarResumoPedido() {
        double totalProdutos = 0, totalItens = 0, desconto = 0, valorFinalComDesconto = 0;

        System.out.println("------- RESUMO PEDIDO -------");
        for (ItemPedido itemPedido : itens) {
            totalItens = itemPedido.getQuantidade() * itemPedido.getProduto().obterPrecoLiquido();
            totalProdutos += totalItens;

            System.out.printf("Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %s  Total: %.2f\n", 
            itemPedido.getProduto().getClass().getSimpleName(),
            itemPedido.getProduto().getTitulo(),
            itemPedido.getProduto().obterPrecoLiquido(),
            itemPedido.getQuantidade(),
            totalItens
            );
        }

        desconto = (percentualDesconto / 100) * totalProdutos;
        valorFinalComDesconto = totalProdutos - desconto;

        System.out.printf("----------------------------\nDESCONTO: %.2f\nTOTAL PRODUTOS: %.2f\n----------------------------\nTOTAL PEDIDO: %.2f\n----------------------------\n",
        desconto,
        totalProdutos,
        valorFinalComDesconto);

    }

}
