package map.ordenacoes.agendaeventos;

import java.time.LocalDate;

public class MainAgendaEventos {
    public static void main(String[] args) {
        AgendaEventos eventos = new AgendaEventos();

        eventos.adicionarEvento(LocalDate.of(2025, 1,22),"Circo","Evento 1");
        eventos.adicionarEvento(LocalDate.of(2025, 1,29),"Festa","Evento 1");
        eventos.adicionarEvento(LocalDate.of(2025, 3,5),"Feira","Evento 1");
        eventos.adicionarEvento(LocalDate.of(2025, 2,1),"Show","Evento 1");

        eventos.exibirAgenda();
        eventos.obterProxEvento();
    }
}
