package ro.bogdanivan.model;

import lombok.*;
import lombok.experimental.SuperBuilder;
import ro.bogdanivan.model.abstracts.Persoana;
import ro.bogdanivan.model.enums.GradDidactic;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString
@EqualsAndHashCode
public class Profesor extends Persoana {

    private GradDidactic grad;
}
