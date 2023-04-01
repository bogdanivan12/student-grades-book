package ro.bogdanivan.service.impl;

import ro.bogdanivan.model.Profesor;
import ro.bogdanivan.model.enums.GradDidactic;
import ro.bogdanivan.service.ProfesorService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

public class ProfesorServiceImpl implements ProfesorService {

    private static List<Profesor> profesorList = new ArrayList<>();

    @Override
    public Optional<Profesor> getElementById(UUID id) {
        return profesorList.stream().filter(elem -> id.equals(elem.getId())).findFirst();
    }

    @Override
    public Optional<Profesor> getElementByNume(String nume) {
        return profesorList.stream().filter(elem -> nume.equals(elem.getNume())).findFirst();
    }

    @Override
    public List<Profesor> getAll() {
        return profesorList;
    }

    @Override
    public List<Profesor> getElementByGrad(GradDidactic grad) {
        return profesorList.stream().filter(elem -> grad.equals(elem.getGrad())).toList();
    }

    @Override
    public void removeElementById(UUID id) {
        profesorList = profesorList.stream().filter(elem -> !id.equals(elem.getId())).collect(Collectors.toList());
    }

    @Override
    public void addElement(Profesor profesor) {
        profesorList.add(profesor);
    }

    @Override
    public void modificaElementById(UUID id, Profesor profesor) {
        removeElementById(id);
        addElement(profesor);
    }
}
