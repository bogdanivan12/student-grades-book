package ro.bogdanivan.service.impl;

import ro.bogdanivan.model.Materie;
import ro.bogdanivan.model.Semestru;
import ro.bogdanivan.service.MaterieService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

public class MaterieServiceImpl implements MaterieService {

    private static List<Materie> materieList = new ArrayList<>();

    @Override
    public List<Materie> getMateriiBySemestru(Semestru semestru) {
        return materieList.stream().filter(element -> element.getSemestru().equals(semestru)).toList();
    }

    @Override
    public Optional<Materie> getMaterieById(UUID id) {
        return materieList.stream().filter(elem -> elem.getId().equals(id)).findFirst();
    }

    @Override
    public Optional<Materie> getMaterieByNume(String nume) {
        return materieList.stream().filter(elem -> elem.getNume().equals(nume)).findFirst();
    }

    @Override
    public List<Materie> getAll() {
        return materieList;
    }

    @Override
    public void addElement(Materie materie) {
        materieList.add(materie);
    }

    @Override
    public void removeElementById(UUID id) {
        materieList = materieList.stream().filter(elem -> !id.equals(elem.getId())).collect(Collectors.toList());
    }

    @Override
    public void modificaElementById(UUID id, Materie materie) {
        removeElementById(id);
        addElement(materie);
    }
}
