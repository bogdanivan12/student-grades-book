package ro.bogdanivan.service;

import ro.bogdanivan.model.Semestru;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface SemestruService {

    Optional<Semestru> getElementById(UUID id);

    Optional<Semestru> getElementByAnSemestru(int an, int semestru);

    List<Semestru> getAllByAn(int an);

    List<Semestru> getAllBySemestru(int semestru);

    List<Semestru> getAll();

    void addElement(Semestru semestru);

    void removeElementById(UUID id);
}
