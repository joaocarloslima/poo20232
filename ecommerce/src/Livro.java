import java.math.BigDecimal;

public class Livro extends Produto {   
    private String autor;

    public Livro(String nome, BigDecimal preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    @Override
    public static final void mostrarNomeDaLoja(){
        System.out.println(NOME_DA_LOJA);
    }

    @Override
    public String toString(){
        return super.toString() + " Autor:" + autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public BigDecimal calcularDesconto() {
        return getPreco().multiply(new BigDecimal(0.1));
    }

    
}
