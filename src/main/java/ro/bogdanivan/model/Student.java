package ro.bogdanivan.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import ro.bogdanivan.model.abstracts.Persoana;

import java.util.List;

@ToString
@Getter
@Setter
public class Student extends Persoana {

    private String nrMatricol;

    private static Student INSTANCE;

    public static Student getInstance() {
        return (INSTANCE == null ? new Student() : INSTANCE);
    }

}
