package list.operacoes;

public class MainCarrinhoCompras {
    public static void main(String[] args) throws ItemException {
        CarrinhoCompras carrinho = new CarrinhoCompras();
        carrinho.adicionarItem("Maçã",3,4.50);
        carrinho.adicionarItem("Banana",10,2.50);
        carrinho.adicionarItem("Carne",2,25.50);
        carrinho.adicionarItem("Leite",3,8.50);

        carrinho.exibirItens();
        System.out.println("Valor total do carrinho: "+carrinho.calcularValorTotal());

        carrinho.removerItem("Carne");

        carrinho.exibirItens();
        System.out.println("Valor total do carrinho: "+carrinho.calcularValorTotal());
    }

}
