import br.com.alura.farmacia.service.ProdutoService;

public class Main2 {
    public static void main(String[] args) {
        ProdutoService produtoService = new ProdutoService();
        System.out.println(produtoService.listar());

    }
}
