import br.com.alura.farmacia.service.ProdutoService;

public class Main4 {
    public static void main(String[] args) {
        ProdutoService produtoService = new ProdutoService();
        produtoService.deletar("Dipirona");
        System.out.println(produtoService.listar());
    }
}
