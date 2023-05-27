package ro.bogdanivan.application;

import ro.bogdanivan.model.Materie;
import ro.bogdanivan.model.NotaSimpla;
import ro.bogdanivan.model.Profesor;
import ro.bogdanivan.model.Semestru;
import ro.bogdanivan.model.enums.GradDidactic;
import ro.bogdanivan.model.enums.TipCurs;
import ro.bogdanivan.service.MaterieService;
import ro.bogdanivan.service.NotaService;
import ro.bogdanivan.service.ProfesorService;
import ro.bogdanivan.service.SemestruService;
import ro.bogdanivan.service.impl.MaterieServiceImpl;
import ro.bogdanivan.service.impl.NotaServiceImpl;
import ro.bogdanivan.service.impl.ProfesorServiceImpl;
import ro.bogdanivan.service.impl.SemestruServiceImpl;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class Menu {

    private static Menu INSTANCE;

    private final SemestruService semestruService = new SemestruServiceImpl();

    private final MaterieService materieService = new MaterieServiceImpl();

    private final ProfesorService profesorService = new ProfesorServiceImpl();

    private final NotaService notaService = new NotaServiceImpl();

    public static Menu getInstance() {
        return (INSTANCE == null ? new Menu() : INSTANCE);
    }

    public void intro() {
        Scanner s = new Scanner(System.in);

        while (true) {
            clear();
            System.out.println("---------- MENIU ----------\n");
            System.out.println("1. Adaugati semestru");
            System.out.println("2. Adaugati materie");
            System.out.println("3. Adaugati profesor");
            System.out.println("4. Adaugati nota");
            System.out.println("5. Calculati nota");
            System.out.println("6. Afisati profesorii");
            System.out.println("7. Cautati profesori dupa grad");
            System.out.println("8. Afisati materiile");
            System.out.println("9. Sterge semestru");
            System.out.println("10. Afisati materiile dintr-un semestru");
            System.out.println("11. Stergeti materie");
            System.out.println("12. Afisare semestre");
            System.out.println("x. Iesire");

            System.out.println("\n\n-> ");
            int optiune = s.nextInt();
            clear();
            switch (optiune) {
                case 1:
                    adaugaSemestru();
                    break;

                case 2:
                    adaugaMaterie();
                    break;

                case 3:
                    adaugaProfesor();
                    break;

                case 4:
                    adaugaNota();
                    break;

                case 5:
                    calculareNota();
                    break;

                case 6:
                    afisareProfesori();
                    break;

                case 7:
                    cautaProfesoriGrad();
                    break;

                case 8:
                    afisareMaterii();
                    break;

                case 9:
                    stergereSemestru();
                    break;

                case 10:
                    afisareMateriiSemestru();
                    break;

                case 11:
                    stergereMaterie();
                    break;

                case 12:
                    afisareSemestre();
                    break;

                default:
                    return;
            }
        }
    }

    void clear() {
        for (int i = 0; i < 100; ++i) {
            System.out.println();
        }
    }

    void adaugaSemestru() {
        Scanner s = new Scanner(System.in);
        System.out.println("---------- MENIU ----------\n");
        System.out.println("Introduceti anul:");
        int an = s.nextInt();
        System.out.println("Introduceti semestrul:");
        int sem = s.nextInt();
        Semestru nou = Semestru.builder().an(an).semestru(sem).build();
        semestruService.addElement(nou);
    }

    void adaugaProfesor() {
        Scanner s = new Scanner(System.in);
        System.out.println("---------- MENIU ----------\n");
        System.out.println("Introduceti numele:");
        String nume = s.next();
        System.out.println("Introduceti prenumele:");
        String prenume = s.next();
        System.out.println("Introduceti email-ul:");
        String email = s.next();

        System.out.println("Alegeti grad didactic:");
        System.out.println("1. Preparator");
        System.out.println("2. Asistent");
        System.out.println("3. Lector");
        System.out.println("4. Conferentiar");
        System.out.println("5. Profesor");
        int optiuneGrad = s.nextInt();
        GradDidactic grad = switch (optiuneGrad) {
            case 1 -> GradDidactic.PREPARATOR;
            case 2 -> GradDidactic.ASISTENT;
            case 3 -> GradDidactic.LECTOR;
            case 4 -> GradDidactic.CONFERENTIAR;
            case 5 -> GradDidactic.PROFESOR;
            default -> GradDidactic.PROFESOR;
        };

        Profesor profesorNou = Profesor.builder().nume(nume).prenume(prenume).email(email).grad(grad).build();

        do {
            System.out.println("Introduceti numele materiei predate:");
            String numeMaterie = s.next();
            Optional<Materie> materie = materieService.getMaterieByNume(numeMaterie);

            System.out.println("Alegeti tip curs predat:");
            System.out.println("1. Curs");
            System.out.println("2. Seminar");
            System.out.println("3. Laborator");
            int optiuneCurs = s.nextInt();
            TipCurs tipCurs = switch (optiuneCurs) {
                case 1 -> TipCurs.CURS;
                case 2 -> TipCurs.SEMINAR;
                case 3 -> TipCurs.LABORATOR;
                default -> TipCurs.CURS;
            };
            Map<Materie, TipCurs> materii = profesorNou.getMaterii();
            if (!materie.equals(Optional.empty())) {
                materii.put(materie.get(), tipCurs);
                profesorNou.setMaterii(materii);
            } else {
                profesorService.addElement(profesorNou);
                return;
            }
        } while (true);
    }

    void afisareProfesori() {
        System.out.println("---------- MENIU ----------\n");
        profesorService.getAll().forEach(prof -> System.out.println(prof));
        Scanner s = new Scanner(System.in);
        s.next();
    }

    void afisareSemestre() {
        System.out.println("---------- MENIU ----------\n");
        semestruService.getAll().forEach(sem -> System.out.println(sem));
        Scanner s = new Scanner(System.in);
        s.next();
    }

    void stergereMaterie() {
        Scanner s = new Scanner(System.in);
        System.out.println("---------- MENIU ----------\n");
        System.out.println("Introduceti numele materiei:");
        String nume = s.next();
        materieService.removeElementById(materieService.getMaterieByNume(nume).get().getId());
    }

    void afisareMateriiSemestru() {
        Scanner s = new Scanner(System.in);
        System.out.println("---------- MENIU ----------\n");
        System.out.println("Introduceti anul:");
        int an = s.nextInt();
        System.out.println("Introduceti semestrul:");
        int sem = s.nextInt();
        Semestru semestru = Semestru.builder().an(an).semestru(sem).build();
        materieService.getMateriiBySemestru(semestru).forEach(elem -> System.out.println(elem));
        s.next();
    }

    void afisareMaterii() {
        System.out.println("---------- MENIU ----------\n");
        materieService.getAll().forEach(materie -> System.out.println(materie));
        Scanner s = new Scanner(System.in);
        s.next();
    }

    void calculareNota() {
        System.out.println("---------- MENIU ----------\n");
        Scanner s = new Scanner(System.in);
        System.out.println("Introduceti numele materiei:");
        String nume = s.next();
        System.out.println(notaService.getElementByMaterie(materieService.getMaterieByNume(nume).get()).get().getValoare());
    }

    void adaugaMaterie() {
        System.out.println("---------- MENIU ----------\n");
        Scanner s = new Scanner(System.in);
        System.out.println("Introduceti numele materiei:");
        String nume = s.next();
        System.out.println("Introduceti numarul de credite:");
        int credite = s.nextInt();
        System.out.println("Introduceti anul:");
        int an = s.nextInt();
        System.out.println("Introduceti semestrul:");
        int sem = s.nextInt();

        Materie materieNoua = Materie.builder().nume(nume).credite(credite).semestru(semestruService.getElementByAnSemestru(an, sem).get()).build();

        do {
            System.out.println("Introduceti tipul de curs:");
            System.out.println("1. Curs");
            System.out.println("2. Seminar");
            System.out.println("3. Laborator");
            int optiuneCurs = s.nextInt();
            TipCurs tipCurs = switch (optiuneCurs) {
                case 1 -> TipCurs.CURS;
                case 2 -> TipCurs.SEMINAR;
                case 3 -> TipCurs.LABORATOR;
                default -> TipCurs.CURS;
            };

            System.out.println("Introduceti numele profesorului");
            String numeProfesor = s.next();
            Map<TipCurs, Profesor> profesori = materieNoua.getProfesori();

            Optional<Profesor> profesor = profesorService.getElementByNume(numeProfesor);
            if (!profesor.equals(Optional.empty())) {
                profesori.put(tipCurs, profesor.get());
                materieNoua.setProfesori(profesori);
            } else {
                materieService.addElement(materieNoua);
                return;
            }
        } while (true);
    }

    void cautaProfesoriGrad() {
        System.out.println("---------- MENIU ----------\n");
        Scanner s = new Scanner(System.in);
        System.out.println("Alegeti grad didactic:");
        System.out.println("1. Preparator");
        System.out.println("2. Asistent");
        System.out.println("3. Lector");
        System.out.println("4. Conferentiar");
        System.out.println("5. Profesor");

        int optiuneGrad = s.nextInt();
        List<Profesor> profesori = profesorService.getElementByGrad(switch (optiuneGrad) {
            case 1 -> GradDidactic.PREPARATOR;
            case 2 -> GradDidactic.ASISTENT;
            case 3 -> GradDidactic.LECTOR;
            case 4 -> GradDidactic.CONFERENTIAR;
            case 5 -> GradDidactic.PROFESOR;
            default -> GradDidactic.PROFESOR;
        });

        profesori.forEach(elem -> System.out.println(elem));
        s.next();
    }

    void stergereSemestru() {
        System.out.println("---------- MENIU ----------\n");
        Scanner s = new Scanner(System.in);
        System.out.println("Introduceti anul:");
        int an = s.nextInt();
        System.out.println("Introduceti semestrul:");
        int sem = s.nextInt();

        Optional<Semestru> semestru = semestruService.getElementByAnSemestru(an, sem);
        if (!semestru.equals(Optional.empty())) {
            semestruService.removeElementById(semestru.get().getId());
        }
    }

    void adaugaNota() {
        System.out.println("---------- MENIU ----------\n");
        Scanner s = new Scanner(System.in);
        System.out.println("Selectati tipul de nota:");
        System.out.println("1. Nota simpla");
        System.out.println("2. Nota compusa");
        int tip = s.nextInt();
        System.out.println("Introduceti numele materiei:");
        String nume = s.next();
        Optional<Materie> materie = materieService.getMaterieByNume(nume);
        if (tip == 1) {
            System.out.println("Introduceti valoarea notei:");
            double val = s.nextDouble();
            if (materie.equals(Optional.empty())) {
                return;
            }
            NotaSimpla notaSimpla = NotaSimpla.builder().valoare(val).notaParinte(notaService.getElementByMaterie(materie.get()).get()).build();
            notaService.getElementByMaterie(materie.get()).get().getNote().add(notaSimpla);
            return;
        }

    }
}
