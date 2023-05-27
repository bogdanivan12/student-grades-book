package ro.bogdanivan.service;

import ro.bogdanivan.model.Materie;
import ro.bogdanivan.model.Profesor;
import ro.bogdanivan.model.Semestru;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface MaterieService {

    List<Materie> getMateriiBySemestru(Semestru semestru);

    Optional<Materie> getMaterieById(UUID id);

    Optional<Materie> getMaterieByNume(String nume);

    List<Materie> getAll();

    void addElement(Materie materie);

    void removeElementById(UUID id);

    void modificaElementById(UUID id, Materie materie);

    List<Materie> getMaterieByProfesor(Profesor profesor);
}
