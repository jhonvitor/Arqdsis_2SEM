package br.usjt.arqdesis.clientep2.model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by asbonato on 9/18/16.
 */
public class Data {
    public static Cliente[] _lista;

    public static Cliente[] geraListaClientes(){
        if(_lista == null) {
            Cliente[] lista = new Cliente[21];
            lista[0] = new Cliente(1,"Carlos Drummond de Andrade","11 999941342","cda@usjt.br");
            lista[1] = new Cliente(2,"Manuel Bandeira","11 89353987","mb@usjt.br");
            lista[2] = new Cliente(3,"Olavo Bilac","23 987256345","ob@usjt.br");
            lista[3] = new Cliente(4,"Vinícius de Moraes","11 987345616","vm@usjt.br");
            lista[4] = new Cliente(5,"Cecília Meireles","11 923541247","cm@usjt.br");
            lista[5] = new Cliente(6,"Castro Alves","11 981233423","ca@usjt.br");
            lista[6] = new Cliente(7,"Gonçalves Dias","12 987652345","gd@usjt.br");
            lista[7] = new Cliente(8,"Ferreira Gullar","11 987234543","fg@usjt.br");
            lista[8] = new Cliente(9,"Machado de Assis","11 999981234","ma@usjt.br");
            lista[9] = new Cliente(10,"Mário de Andrade","11 989987365","man@usjt.br");
            lista[10] = new Cliente(11,"Cora Coralina","12 989763423","cc@usjt.br");
            lista[11] = new Cliente(12,"Manoel de Barros","14 768365276","mbar@usjt.br");
            lista[12] = new Cliente(13,"João Cabral de Melo Neto","11 987873123","jcmn@usjt.br");
            lista[13] = new Cliente(14,"Casimiro de Abreu","81 987698765","cab@usjt.br");
            lista[14] = new Cliente(15,"Paulo Leminski","62 9762323453","pl@usjt.br");
            lista[15] = new Cliente(16,"Álvares de Azevedo","11 32319878","aa@usjt.br");
            lista[16] = new Cliente(17,"Guilherme de Almeida","11 998787343","ga@usjt.br");
            lista[17] = new Cliente(18,"Alphonsus de Guimarães","11 966565777","ag@usjt.br");
            lista[18] = new Cliente(19,"Mário Quintana","51 999932778","mq@usjt.br");
            lista[19] = new Cliente(20,"Gregório de Matos","12 32138888","gm@usjt.br");
            lista[20] = new Cliente(21,"Augusto dos Anjos","11 994524141","aanj@usjt.br");

           // Arrays.sort(lista);

            _lista = lista;

        }
        return _lista;
    }

    public static Cliente[] buscaClientes(String chave){
        Cliente[] lista = geraListaClientes();
        if (chave == null || chave.length() == 0){
            return lista;
        } else {
            ArrayList<Cliente> subLista = new ArrayList<>();
            for(Cliente cliente:lista){
                if(cliente.getNome().toUpperCase().contains(chave.toUpperCase())){
                    subLista.add(cliente);
                }
            }
            return subLista.toArray(new Cliente[0]);
        }
    }
}
