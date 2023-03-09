import java.util.ArrayList;

public class Nota {
    private static int lastId = 0;
    private int idNota;
    private String denumire;
    private Double punctajObtinut, punctajMaxim, valoare, pondere, oficiu, pragTrecere;
    private ArrayList<Nota> note; // o nota poate avea mai multe note copil, simuland astfel structura arborescenta

    public Nota() {
        this.idNota = this.lastId++;
        this.denumire = "Nota finala";
        this.punctajObtinut = this.oficiu = this.valoare = 0d;
        this.pondere = this.punctajMaxim = 1d;
        this.pragTrecere = 5d;
        this.note = new ArrayList<Nota>();
    }

    public Nota(String denumire) {
        this.denumire = denumire;
        this.idNota = this.lastId++;
        this.punctajObtinut = this.oficiu = this.valoare = 0d;
        this.pondere = this.punctajMaxim = 1d;
        this.pragTrecere = 5d;
        this.note = new ArrayList<Nota>();
    }

    public Nota(Double oficiu) {
        this.oficiu = oficiu;
        this.idNota = this.lastId++;
        this.denumire = "Nota finala";
        this.punctajObtinut = this.valoare = 0d;
        this.pondere = this.punctajMaxim = 1d;
        this.pragTrecere = 5d;
        this.note = new ArrayList<Nota>();
    }

    public Nota(String denumire, Double punctajObtinut, Double punctajMaxim, Double pondere, Double oficiu, Double pragTrecere) {
        this.idNota = this.lastId++;
        this.denumire = denumire;
        this.punctajObtinut = punctajObtinut;
        this.punctajMaxim = punctajMaxim;
        this.pondere = pondere;
        this.oficiu = oficiu;
        this.pragTrecere = pragTrecere;
        this.valoare = this.punctajObtinut / this.punctajMaxim + this.oficiu;
        this.note = new ArrayList<Nota>();
    }

    public static int getLastId() {
        return lastId;
    }

    public int getIdNota() {
        return idNota;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public Double getPunctajObtinut() {
        return punctajObtinut;
    }

    public void setPunctajObtinut(Double punctajObtinut) {
        this.punctajObtinut = punctajObtinut;
    }

    public Double getPunctajMaxim() {
        return punctajMaxim;
    }

    public void setPunctajMaxim(Double punctajMaxim) {
        this.punctajMaxim = punctajMaxim;
    }

    public Double getValoare() {
        return valoare;
    }

    public Double getPondere() {
        return pondere;
    }

    public void setPondere(Double pondere) {
        this.pondere = pondere;
    }

    public Double getOficiu() {
        return oficiu;
    }

    public void setOficiu(Double oficiu) {
        this.oficiu = oficiu;
    }

    public Double getPragTrecere() {
        return pragTrecere;
    }

    public void setPragTrecere(Double pragTrecere) {
        this.pragTrecere = pragTrecere;
    }

    public ArrayList<Nota> getNote() {
        return note;
    }

    public void setNote(ArrayList<Nota> note) {
        this.note = note;
    }

    public void calculare() {
        if (this.note.isEmpty()) {
            this.valoare = this.punctajObtinut / this.punctajMaxim + this.oficiu;
            return;
        }
        Double suma = 0d;
        for (Nota nota: this.note) {
            nota.calculare();
            suma += nota.valoare;
        }
        this.punctajObtinut = suma;
        this.valoare = this.punctajObtinut / this.punctajMaxim + this.oficiu;
    }
}
