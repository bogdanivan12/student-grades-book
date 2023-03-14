import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Imobil imobil1 = new Imobil();
        imobil1.setAdresa(new Adresa("Strada1 nr 1", "F7"));
        List<Incapere> incaperi = new ArrayList<>();
        Incapere incapere1 = new Incapere(TipIncapere.CAMERA, 3, 20d);
        Incapere incapere2 = new Incapere(TipIncapere.BAIE, 1, 5d);
        incaperi.add(incapere1);
        incaperi.add(incapere2);
        imobil1.setIncaperi(incaperi);
        imobil1.setTipImobil(TipImobil.BLOC);
        imobil1.setPretVanzare(10000d);
        imobil1.setPretInchiriere(200d);
    }
}