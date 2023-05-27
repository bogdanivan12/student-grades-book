package ro.bogdanivan.model;

import lombok.*;
import lombok.experimental.SuperBuilder;
import ro.bogdanivan.model.abstracts.AbstractEntity;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
@ToString
@EqualsAndHashCode
public class NotaCompusa extends AbstractEntity {

    private List<NotaCompusa> note;

    private String nume;

    private Materie materie;

    private NotaCompusa notaParinte;

    private double pondere = 1d;

    public double getValoare() {
        double valoare = 0d;
        for (NotaCompusa nota: note) {
            valoare += nota.getValoare() * nota.pondere;
        }
        return valoare;
    }
}
