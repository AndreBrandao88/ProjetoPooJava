package fatec.poo.model;

/**
 *
 * @author Luiz
 */
public class Produto {
    private String codigo;
    private String descricao;
    private double qtdeEstoque;
    private String unidadeMedida;
    private double preco;
    private double estoqueMinino;

    public Produto(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQtdeEstoque(double qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setEstoqueMinino(double estoqueMinino) {
        this.estoqueMinino = estoqueMinino;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getQtdeEstoque() {
        return qtdeEstoque;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public double getPreco() {
        return preco;
    }

    public double getEstoqueMinino() {
        return estoqueMinino;
    }
    
}
