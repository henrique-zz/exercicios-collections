package list.ordenacoes.numeros;

public class MainNumerosOrdenacao {
    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(6);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(11);

        System.out.print("Lista original: ");
        ordenacaoNumeros.exibirNumeros();

        System.out.println("Ordem ascendente: "+ordenacaoNumeros.ordenarAscendente());
        System.out.println("Ordem descendente: "+ordenacaoNumeros.ordenarDescendente());

    }
}
