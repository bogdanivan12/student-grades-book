package ro.bogdanivan.service;

import ro.bogdanivan.model.Materie;
import ro.bogdanivan.model.NotaCompusa;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface NotaService {

    Optional<NotaCompusa> getElementById(UUID id);

    List<NotaCompusa> getElementByNume(String nume);

    Optional<NotaCompusa> getElementByMaterie(Materie materie);

    Optional<NotaCompusa> getElementByCopil(NotaCompusa copil);

    List<NotaCompusa> getAll();

    void addElement(NotaCompusa nota);

    void removeElementById(UUID id);

    void modificaElementById(UUID id, NotaCompusa nota);

}
