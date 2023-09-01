package assertcode.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class HistoricoDeDonos {
    private String nomeDono;
    private int anoDeAquisicao;
}
