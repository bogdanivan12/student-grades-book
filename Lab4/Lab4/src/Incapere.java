public class Incapere {
    private TipIncapere tipIncapere;
    private Integer cantitate; // nr incaperi
    private Double dimensiune;

    public Incapere(TipIncapere tipIncapere, Integer cantitate, Double dimensiune) {
        this.tipIncapere = tipIncapere;
        this.cantitate = cantitate;
        this.dimensiune = dimensiune;
    }

    public TipIncapere getTipIncapere() {
        return tipIncapere;
    }

    public void setTipIncapere(TipIncapere tipIncapere) {
        this.tipIncapere = tipIncapere;
    }

    public Integer getCantitate() {
        return cantitate;
    }

    public void setCantitate(Integer cantitate) {
        this.cantitate = cantitate;
    }

    public Double getDimensiune() {
        return dimensiune;
    }

    public void setDimensiune(Double dimensiune) {
        this.dimensiune = dimensiune;
    }
}
