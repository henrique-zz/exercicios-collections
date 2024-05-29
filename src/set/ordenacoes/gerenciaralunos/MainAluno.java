package set.ordenacoes.gerenciaralunos;

public class MainAluno {
    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Henrique", 1234, 9);
        gerenciadorAlunos.adicionarAluno("Poliana", 1235, 10);
        gerenciadorAlunos.adicionarAluno("João", 1239, 4);
        gerenciadorAlunos.adicionarAluno("Maria", 9899, 6);

        System.out.println("Set de alunos ordenados por nome em ordem alfabética: " + gerenciadorAlunos.exibirPorNome());
        System.out.println("Set de alunos ordenados por nota: " + gerenciadorAlunos.exibirPorNota());

        gerenciadorAlunos.removerAluno(9899);

        gerenciadorAlunos.exibirAlunos();
    }
}
