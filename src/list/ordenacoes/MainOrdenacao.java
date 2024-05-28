package list.ordenacoes;

public class MainOrdenacao {
    public static void main(String[] args) {
        OrdenacaoPessoas op = new OrdenacaoPessoas();
        op.adicionarPessoa("Henrique",19,1.80);
        op.adicionarPessoa("Pessoa 2",16,1.60);
        op.adicionarPessoa("Pessoa 3",22,1.83);
        op.adicionarPessoa("Pessoa 4",30,1.55);

        System.out.println("Lista normal: "+op.pessoaList);
        System.out.println("Pessoas ordenadas por altura: "+op.ordenarPorAltura());
        System.out.println("Pessoas ordenadas por idade: "+op.ordenarPorIdade());
    }

}
