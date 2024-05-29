package map.ordenacoes.agendaeventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String atracao, String nome) {
        eventosMap.put(data, new Evento(atracao, nome));
    }

    public void obterProxEvento() {
        /* Set<LocalDate> dateSet = eventosMap.keySet(); //preenche o set com todas as chaves do Map
           Collection<Evento> valores = eventosMap.values(); //preenche a Collection com todos os valores do Map */
        //porém essa abordagem não funciona direito, pois assim a chave não conheceria seu respectivo valor pois são duas estruturas diferentes

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;

        Map<LocalDate,Evento> eventosPorData = new TreeMap<>(eventosMap); //organizando de menor à maior data, por isso o método abaixo funciona

        for(Map.Entry<LocalDate,Evento> mapEntry : eventosPorData.entrySet()){ //entrySet cria um Set de Map.Entry, onde cada chave conhece o valor
            if(mapEntry.getKey().isEqual(dataAtual) || mapEntry.getKey().isAfter(dataAtual)){ //key = data
                proximaData = mapEntry.getKey();
                proximoEvento = mapEntry.getValue();
                System.out.println("O próximo evento " +mapEntry.getValue()+ " acontecerá na data: " + mapEntry.getKey()); //value = Evento
                break;
            }
        }

    }

    public void exibirAgenda() { //da menor à maior data
        Map<LocalDate,Evento> eventosPorData = new TreeMap<>(eventosMap); //isso já organiza as datas em ordem crescente, visto que a classe LocalDate já faz isso para nós
        System.out.println(eventosPorData);
    }
}
