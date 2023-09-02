import java.math.BigDecimal;

public class App {
    public static void main(String[] args) throws Exception {
        var livro = new Livro("Meu Livro", new BigDecimal(10), "Joao");
        System.out.println( livro );

        var eletronico = new Eletronico("IPhone", new BigDecimal(10000), "Apple", "12");
        System.out.println( eletronico );

        System.err.println(Produto.nomeDaLoja);

        Produto.mostrarNomeDaLoja();

        //var produto = new Produto("Produto Genérico", new BigDecimal(10));

    }
}
