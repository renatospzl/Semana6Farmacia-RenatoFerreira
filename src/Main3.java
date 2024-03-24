import br.com.alura.farmacia.service.ProdutoService;

public class Main3 {
    public static void main(String[] args) {
        ProdutoService produtoService = new ProdutoService();
        produtoService.editarPreco("Dipirona", 15.00);
        System.out.println(produtoService.listar());
    }
}
