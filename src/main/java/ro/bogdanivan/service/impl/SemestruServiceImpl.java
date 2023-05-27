package ro.bogdanivan.service.impl;

import ro.bogdanivan.model.Semestru;
import ro.bogdanivan.service.SemestruService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

public class SemestruServiceImpl implements SemestruService {

    private static List<Semestru> semestruList = new ArrayList<>();


    @Override
    public Optional<Semestru> getElementById(UUID id) {
        for (Semestru semestru: semestruList) {
            if (id.equals(semestru.getId())) {
                return Optional.of(semestru);
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<Semestru> getElementByAnSemestru(int an, int semestru) {
        return semestruList.stream().filter(element -> element.getAn() == an && element.getSemestru() == semestru).findFirst();
    }

    @Override
    public List<Semestru> getAllByAn(int an) {
        return semestruList.stream().filter(x -> x.getAn() == an).toList();
    }

    @Override
    public List<Semestru> getAllBySemestru(int semestru) {
        return semestruList.stream().filter(x -> x.getSemestru() == semestru).toList();
    }

    @Override
    public List<Semestru> getAll() {
        return semestruList;
    }

    @Override
    public void addElement(Semestru semestru) {
        semestruList.add(semestru);
        semestruList.sort((a, b) -> a.getAn() * 10 + a.getSemestru() - b.getAn() * 10 - b.getSemestru());
    }

    @Override
    public void removeElementById(UUID id) {
        semestruList = semestruList.stream().filter(x -> !id.equals(x.getId())).collect(Collectors.toList());
    }
}
