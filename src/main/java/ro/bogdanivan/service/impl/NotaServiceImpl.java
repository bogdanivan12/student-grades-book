package ro.bogdanivan.service.impl;

import ro.bogdanivan.model.Materie;
import ro.bogdanivan.model.NotaCompusa;
import ro.bogdanivan.service.NotaService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

public class NotaServiceImpl implements NotaService {

    private static List<NotaCompusa> notaList;

    @Override
    public Optional<NotaCompusa> getElementById(UUID id) {
        return notaList.stream().filter(elem -> id.equals(elem.getId())).findFirst();
    }

    @Override
    public List<NotaCompusa> getElementByNume(String nume) {
        return notaList.stream().filter(elem -> nume.equals(elem.getNume())).collect(Collectors.toList());
    }

    @Override
    public Optional<NotaCompusa> getElementByMaterie(Materie materie) {
        return notaList.stream().filter(elem -> materie.equals(elem.getMaterie())).findFirst();
    }

    @Override
    public Optional<NotaCompusa> getElementByCopil(NotaCompusa copil) {
        return notaList.stream().filter(elem -> elem.getNote().contains(copil)).findFirst();
    }

    @Override
    public List<NotaCompusa> getAll() {
        return notaList;
    }

    @Override
    public void addElement(NotaCompusa nota) {
        notaList.add(nota);
    }

    @Override
    public void removeElementById(UUID id) {
        notaList = notaList.stream().filter(elem -> !id.equals(elem.getId())).collect(Collectors.toList());
    }

    @Override
    public void modificaElementById(UUID id, NotaCompusa nota) {
        removeElementById(id);
        addElement(nota);
    }
}
