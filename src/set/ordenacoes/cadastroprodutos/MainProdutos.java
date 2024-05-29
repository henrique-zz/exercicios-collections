package set.ordenacoes.cadastroprodutos;

public class MainProdutos {
    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();

        cadastro.adicionarProduto("Ameixa",1L,2.20,7);
        cadastro.adicionarProduto("Carne",2L,5.20,3);
        cadastro.adicionarProduto("Frango",3L,7.20,5);
        cadastro.adicionarProduto("Banana",9L,6.20,9);

        cadastro.exibirProdutos();
        System.out.println("Produtos organizados por nome: "+cadastro.exibirProdutosPorNome());
        System.out.println("Produtos organizados por preço: "+cadastro.exibirProdutosPorPreco());

    }
}
