import java.math.BigDecimal;


public final class Produto {
    public static final String NOME_DA_LOJA = "Senac Commerce";
    private String nome;
    private BigDecimal preco;

    public static final void mostrarNomeDaLoja(){
        System.out.println(NOME_DA_LOJA);
    }
    
    public Produto(String nome, BigDecimal preco) {
        this.nome = nome;
        this.preco = preco;

    }

    // public abstract BigDecimal calcularDesconto();

    @Override
    public String toString(){
        return "Nome:" + nome + " Preco: " + preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    


}
