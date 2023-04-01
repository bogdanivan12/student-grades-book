package ro.bogdanivan.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString
@EqualsAndHashCode
public class NotaSimpla extends NotaCompusa {

    private double valoare;
}
