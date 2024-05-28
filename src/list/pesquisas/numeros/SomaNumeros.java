package list.pesquisas.numeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> listaNumeros;

    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        if(!listaNumeros.isEmpty()) {
            for (int i : listaNumeros) {
                soma += i;
            }
            return soma;
        } else {
            throw new RuntimeException("\nERRO\nA lista está vazia");
        }
    }

    public int encontrarMaiorNumero(){
        int maiorNum = Integer.MIN_VALUE;
        if(!listaNumeros.isEmpty()) {
            for (int i : listaNumeros) {
                if (i > maiorNum) {
                    maiorNum = i;
                }
            }
            return maiorNum;
        } else {
            throw new RuntimeException("\nERRO\nA lista está vazia");
        }
    }

    public int encontrarMenorNumero(){
        int menorNum = Integer.MAX_VALUE;
        if(!listaNumeros.isEmpty()) {
            for (int i : listaNumeros) {
                if (i < menorNum) {
                    menorNum = i;
                }
            }
            return menorNum;
        } else {
            throw new RuntimeException("\nERRO\nA lista está vazia");
        }
    }

    public void exibirNumeros(){
        if(!listaNumeros.isEmpty()) {
            System.out.println(listaNumeros);
        } else {
            System.out.println("A lista está vazia.");
        }
    }
}
