import java.util.ArrayList;
import java.util.List;

public class Imobil {
    private TipImobil tipImobil;
    private List<Incapere> incaperi;
    private Adresa adresa;
    private Double pretVanzare, pretInchiriere;

    public Imobil() {
        this.adresa = null;
        this.tipImobil = null;
        this.incaperi = new ArrayList<>();
        this.pretInchiriere = 0d;
        this.pretVanzare = 0d;
    }

    public TipImobil getTipImobil() {
        return tipImobil;
    }

    public void setTipImobil(TipImobil tipImobil) {
        this.tipImobil = tipImobil;
    }

    public List<Incapere> getIncaperi() {
        return incaperi;
    }

    public void setIncaperi(List<Incapere> incaperi) {
        this.incaperi = incaperi;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

    public Double getPretVanzare() {
        return pretVanzare;
    }

    public void setPretVanzare(Double pretVanzare) {
        this.pretVanzare = pretVanzare;
    }

    public Double getPretInchiriere() {
        return pretInchiriere;
    }

    public void setPretInchiriere(Double pretInchiriere) {
        this.pretInchiriere = pretInchiriere;
    }

    public Double dimensiune() {
        Double dim = 0d;
        for (int i = 0; i < incaperi.size(); ++i) {
            dim += incaperi.get(i).getDimensiune();
        }
        return dim;
    }
}
