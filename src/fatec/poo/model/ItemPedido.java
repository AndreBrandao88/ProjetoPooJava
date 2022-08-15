package fatec.poo.model;

/**
 *
 * @author Luiz
 */
public class ItemPedido {
    private int sequencia;
    private double qtdeVendida;
    private Pedido pedido;
    private Produto produto;

    public ItemPedido(int sequencia, double qtdeVendida,Produto produto) {
        this.sequencia = sequencia;
        this.qtdeVendida = qtdeVendida;
        this.produto = produto;
    }

    public void setQtdeVendida(double qtdeVendida) {
        this.qtdeVendida = qtdeVendida;
    }

    public int getSequencia() {
        return sequencia;
    }

    public double getQtdeVendida() {
        return qtdeVendida;
    }

    public Pedido getPedido() {
        return pedido;
    }
    
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    public void setProduto(Produto produto) {
        this.produto = produto;
        produto.setQtdeEstoque(produto.getQtdeEstoque() - this.qtdeVendida);
    }

    public Produto getProduto() {
        return produto;
    }
    
}
