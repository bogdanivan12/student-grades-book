package ro.bogdanivan.application;

import ro.bogdanivan.model.Semestru;
import ro.bogdanivan.service.MaterieService;
import ro.bogdanivan.service.SemestruService;
import ro.bogdanivan.service.impl.MaterieServiceImpl;
import ro.bogdanivan.service.impl.SemestruServiceImpl;

public class Menu {

    private static Menu INSTANCE;

    private final SemestruService semestruService = new SemestruServiceImpl();

    private final MaterieService materieService = new MaterieServiceImpl();

    public static Menu getInstance() {
        return (INSTANCE == null ? new Menu() : INSTANCE);
    }

    public void intro() {
        System.out.println("INTRO");

        Semestru semestru1 = new Semestru(1, 1, null);
        semestruService.addElement(semestru1);
        Semestru semestru2 = new Semestru(1, 2, null);
        semestruService.addElement(semestru2);

        semestruService.getAllByAn(1).forEach(x -> System.out.println(x));
        System.out.println(semestruService.getElementByAnSemestru(1, 3));
    }
}
