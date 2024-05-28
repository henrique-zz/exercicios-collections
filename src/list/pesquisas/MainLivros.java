package list.pesquisas;

public class MainLivros {
    public static void main(String[] args) throws ListaVaziaException {
        CatalogoLivros livros = new CatalogoLivros();

        livros.adicionarLivro("Autor 1","Livro 1",1999);
        livros.adicionarLivro("Autor 2","Livro 2",2002);
        livros.adicionarLivro("Autor 3","Livro 3",2003);
        livros.adicionarLivro("Autor 4","Livro 4",2004);
        livros.adicionarLivro("Autor 5","Livro 5",2005);


        System.out.println("Livros com o autor Autor 2: "+livros.pesquisarPorAutor("Autor 2"));
        System.out.println("Livro com o título Livro 5: " +livros.pesquisarPorTitulo("Livro 5"));
        System.out.println("Livros lançados no intervalo de 1999 a 2003: "+livros.pesquisarPorIntervaloAnos(1999,2003));

        //poderíamos também lançar a exception usando um try-catch
        //try{
        // código que lança as exceptions da classe catalogoLivros
        //} catch(ListaVaziaException e){
        // sout(mensagem desejada)
        //}

    }
}
