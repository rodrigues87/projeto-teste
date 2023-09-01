package assertcode;

import assertcode.entities.Carro;
import assertcode.entities.HistoricoDeDonos;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Carro carro = Carro
                .builder()
                .ano(2013)
                .cor("amarelo")
                .marca("ford")
                .historicoDeDonos(createDonosList())
                .build();
        
        List<String> donosDoCarro = carro.getHistoricoDeDonos().stream().map(HistoricoDeDonos::getNomeDono).toList();

        System.out.println(donosDoCarro);

        System.out.println(carro);
    }

    private static List<HistoricoDeDonos> createDonosList() {
        HistoricoDeDonos pedro = HistoricoDeDonos
                .builder()
                .nomeDono("PEDRO")
                .anoDeAquisicao(1987)
                .build();
        HistoricoDeDonos davi = HistoricoDeDonos
                .builder()
                .nomeDono("DAVI")
                .anoDeAquisicao(2013)
                .build();

        return List.of(pedro,davi);
    }
}