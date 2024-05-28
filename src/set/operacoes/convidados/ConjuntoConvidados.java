package set.operacoes.convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoRemover = null;
        boolean encontrado = false;

        for(Convidado c: convidadoSet){
            if(codigoConvite == c.getCodigoConvite()){
                convidadoRemover = c;
                encontrado = true;
                break;
            }
        }
        if(encontrado) {
            convidadoSet.remove(convidadoRemover);
        } else {
            System.out.println("Código "+codigoConvite+" não existente.");
        }
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }
}
