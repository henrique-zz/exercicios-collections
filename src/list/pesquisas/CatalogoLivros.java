package list.pesquisas;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    List<Livro> livroList = new ArrayList<>();

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String autor, String titulo, int anoPublicacao){
        livroList.add(new Livro(autor, titulo, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) throws ListaVaziaException{
        List<Livro> livroAutor = new ArrayList<>();

        if(!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livroAutor.add(l);
                }
            }
        } else {
            throw new ListaVaziaException("\nERRO\nA lista está vazia.");
        }
        return livroAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) throws ListaVaziaException{
        List<Livro> livroAnos = new ArrayList<>();

        if(!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livroAnos.add(l);
                }
            }
        } else {
            throw new ListaVaziaException("\nERRO\nA lista está vazia.");
        }

        return livroAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) throws ListaVaziaException {
        Livro livro = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livro = l;
                    break; //quebramos o loop, pois neste exemplo queremos retornar o primeiro livro encontrado com o título mencionado
                }
            }
        } else {
            throw new ListaVaziaException("\nERRO\nA lista está vazia.");
        }

        return livro;
    }

    public List<Livro> getLivroList() {
        return livroList;
    }

    public void setLivroList(List<Livro> livroList) {
        this.livroList = livroList;
    }
}
