package ro.bogdanivan.service;

import ro.bogdanivan.model.Profesor;
import ro.bogdanivan.model.enums.GradDidactic;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProfesorService {

    Optional<Profesor> getElementById(UUID id);

    Optional<Profesor> getElementByNume(String nume);

    List<Profesor> getAll();

    List<Profesor> getElementByGrad(GradDidactic grad);

    void removeElementById(UUID id);

    void modificaElementById(UUID id, Profesor profesor);

    void addElement(Profesor profesor);
}
