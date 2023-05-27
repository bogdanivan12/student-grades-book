package ro.bogdanivan.model;

import lombok.*;
import lombok.experimental.SuperBuilder;
import ro.bogdanivan.model.abstracts.Persoana;
import ro.bogdanivan.model.enums.GradDidactic;
import ro.bogdanivan.model.enums.TipCurs;

import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString
@EqualsAndHashCode
public class Profesor extends Persoana {

    private GradDidactic grad;

    private Map<Materie, TipCurs> materii;
}
