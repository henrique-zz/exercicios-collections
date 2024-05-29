package map.operacoes.agenda;

public class MainAgendaContatos {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Henrique",111);
        agendaContatos.adicionarContato("Poliana",222);
        agendaContatos.adicionarContato("João",333);
        agendaContatos.adicionarContato("Maria",444);

        agendaContatos.exibirContato();

        agendaContatos.removerContato("Maria");
        agendaContatos.exibirContato();

        System.out.println("O número é: "+agendaContatos.pesquisarPorNome("Henrique"));

    }
}
