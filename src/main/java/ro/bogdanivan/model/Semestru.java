package ro.bogdanivan.model;

import lombok.*;
import lombok.experimental.SuperBuilder;
import ro.bogdanivan.model.abstracts.AbstractEntity;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString
@EqualsAndHashCode
public class Semestru extends AbstractEntity {

    private int an;

    private int semestru;

    private List<Materie> materii;
}
