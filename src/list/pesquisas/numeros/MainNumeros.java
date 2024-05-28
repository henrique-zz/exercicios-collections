package list.pesquisas.numeros;

public class MainNumeros {
    public static void main(String[] args) {
        SomaNumeros numeros = new SomaNumeros();

        numeros.adicionarNumero(1);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(7);
        numeros.adicionarNumero(9);
        numeros.adicionarNumero(-1);

        numeros.exibirNumeros();

        System.out.println("Soma dos números da lista: "+numeros.calcularSoma());
        System.out.println("Maior número da lista: "+numeros.encontrarMaiorNumero());
        System.out.println("Menor número da lista: "+numeros.encontrarMenorNumero());
    }
}
