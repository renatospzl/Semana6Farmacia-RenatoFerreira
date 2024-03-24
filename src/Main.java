import br.com.alura.farmacia.modelos.Produto;
import br.com.alura.farmacia.service.ProdutoService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Teste projeto farmácia");


        Produto produto = new Produto("Losartana", "Medley", 18.50);
        ProdutoService produtoService = new ProdutoService();
        produtoService.cadastrar(produto);

    }
}
