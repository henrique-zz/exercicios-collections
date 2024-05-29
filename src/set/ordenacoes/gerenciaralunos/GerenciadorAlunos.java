package set.ordenacoes.gerenciaralunos;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media){
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        boolean encontrado = false;
        if(!alunoSet.isEmpty()){
            for(Aluno a : alunoSet){
                if(a.getMatricula() == matricula){
                    encontrado = true;
                    alunoSet.remove(a);
                    System.out.println("Aluno(a) com a matrícula: " +a.getMatricula()+ " removido(a).");
                    break;
                }
            }

            if(!encontrado){
                System.out.println("O(a) aluno(a) não foi encontrado(a).");
            }
        } else {
            throw new RuntimeException("\nERRO\nLista vazia.");
        }
    }

    public Set<Aluno> exibirPorNome(){
        if(alunoSet.isEmpty()){
            throw new RuntimeException("\nERRO\nLista vazia.");
        }
        Set<Aluno> alunoPorNome = new TreeSet<>(alunoSet);
        return alunoPorNome;
    }

    public Set<Aluno> exibirPorNota(){
        if(alunoSet.isEmpty()){
            throw new RuntimeException("\nERRO\nLista vazia.");
        }
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorNota());
        alunoPorNota.addAll(alunoSet);
        return alunoPorNota;
    }

    public void exibirAlunos(){
        System.out.println(alunoSet);
    }
}
