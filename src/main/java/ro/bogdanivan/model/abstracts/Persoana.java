package ro.bogdanivan.model.abstracts;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString
@EqualsAndHashCode
public abstract class Persoana extends AbstractEntity {

    private String nume;

    private String prenume;

    private String email;
}
