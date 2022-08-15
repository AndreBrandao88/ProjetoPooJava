package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Luiz
 */
public class Pedido {
    private String numero;
    private String dataEmissao;
    private String dataPagto;
    private boolean formaPagto;
    private boolean situacao;
    private Cliente cliente;
    private Vendedor vendedor;
    private ArrayList<ItemPedido> itensPedidos;
    
    public Pedido(String numero, String dataEmissao) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        itensPedidos = new ArrayList<>();
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setDataPagto(String dataPagto) {
        this.dataPagto = dataPagto;
    }

    public void setFormaPagto(boolean formaPagto) {
        this.formaPagto = formaPagto;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public String getNumero() {
        return numero;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public String getDataPagto() {
        return dataPagto;
    }

    public boolean isFormaPagto() {
        return formaPagto;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }
    
    public void addItemPedido(ItemPedido i){
        itensPedidos.add(i);
        i.setPedido(this);
        double valor = i.getQtdeVendida() * i.getProduto().getPreco();
        cliente.setLimiteDisp(cliente.getLimiteDisp() - valor);
    }
}
