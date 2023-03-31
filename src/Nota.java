public class Nota {
    private Double valoare, prag, pondere;

    public Nota() {
        this.valoare = 10d;
        this.prag = 5d;
        this.pondere = 1d;
    }

    public Nota(Double valoare) {
        this.valoare = valoare;
        this.prag = 5d;
        this.pondere = 1d;
    }

    public Nota(Double valoare, Double prag, Double pondere) {
        this.valoare = valoare;
        this.prag = prag;
        this.pondere = pondere;
    }

    public Double getValoare() {
        return valoare;
    }

    public void setValoare(Double valoare) {
        this.valoare = valoare;
    }

    public Double getPrag() {
        return prag;
    }

    public void setPrag(Double prag) {
        this.prag = prag;
    }

    public Double getPondere() {
        return pondere;
    }

    public void setPondere(Double pondere) {
        this.pondere = pondere;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "valoare=" + valoare +
                ", prag=" + prag +
                ", pondere=" + pondere +
                '}';
    }
}
