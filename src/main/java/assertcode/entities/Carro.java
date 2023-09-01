package assertcode.entities;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Carro {
    private String cor;

    private int ano;

    private String marca;

    private List<HistoricoDeDonos> historicoDeDonos;
}
