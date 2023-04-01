package ro.bogdanivan.model;

import lombok.*;
import lombok.experimental.SuperBuilder;
import ro.bogdanivan.model.abstracts.AbstractEntity;
import ro.bogdanivan.model.enums.TipCurs;

import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString
@EqualsAndHashCode
public class Materie extends AbstractEntity {

    private Map<TipCurs, Profesor> profesori;

    private String nume;

    private int credite;

    private NotaCompusa nota;

    private Semestru semestru;
}
