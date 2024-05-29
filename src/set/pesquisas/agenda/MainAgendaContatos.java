package set.pesquisas.agenda;

public class MainAgendaContatos {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Poliana", 12345);
        agendaContatos.adicionarContato("Henrique Sampaio", 54321);
        agendaContatos.adicionarContato("Poliana Miranda", 43251);
        agendaContatos.adicionarContato("Poliana Puton", 32451);
        agendaContatos.adicionarContato("Henrique", 21345);

        agendaContatos.exibirContatos();

        System.out.println("Pesquisando pelo nome: "+agendaContatos.pesquisarPorNome("Poliana"));
        System.out.println("Contato a ter o número atualizado: "+agendaContatos.pesquisarPorNome("Henrique Sampaio"));
        System.out.println("Contato atualizado: "+agendaContatos.atualizarNumeroContato("Henrique",0));

        agendaContatos.exibirContatos();
    }
}
