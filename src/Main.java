public class Main {
    public static void main(String[] args) {
        Nota nota1 = new Nota(0.1),
                nota2 = new Nota("Examen", 5d, 6d, 0.5, 0d, 5d),
                nota3 = new Nota("Laborator", 10d, 20d, 0.4, 0d, 10d),
                nota4 = new Nota("Teme", 15d, 20d, 0.4, 0d, 0d),
                nota5 = new Nota("Colocviu", 60d, 100d, 0.6, 0d, 50d);
        nota3.getNote().add(nota4);
        nota3.getNote().add(nota5);
        nota1.getNote().add(nota2);
        nota1.getNote().add(nota3);
        nota1.calculare();
        System.out.println(nota1.getValoare());
        System.out.println(nota1.getNote().get(0).getValoare());
        System.out.println(nota1.getNote().get(1).getValoare());
    }
}