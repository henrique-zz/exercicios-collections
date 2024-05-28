package set.operacoes.convidados;

public class MainConvidados {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Henrique", 111);
        conjuntoConvidados.adicionarConvidado("João", 112);
        conjuntoConvidados.adicionarConvidado("Maria", 113);
        conjuntoConvidados.adicionarConvidado("Jhonny", 114);

        System.out.println("Há "+conjuntoConvidados.contarConvidados()+" convidado(s) no Set.");
        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(114);

        System.out.println("Há "+conjuntoConvidados.contarConvidados()+" convidado(s) no Set.");
        conjuntoConvidados.exibirConvidados();
    }

}
