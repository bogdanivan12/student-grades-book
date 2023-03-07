public class Aliment {
    private Long dataExp;
    private String ingrediente;
    private Double pret, calorii;

    public Long getDataExp() {
        return dataExp;
    }

    public void setDataExp(Long dataExp) {
        this.dataExp = dataExp;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public Double getPret() {
        return pret;
    }

    public void setPret(Double pret) {
        this.pret = pret;
    }

    public Double getCalorii() {
        return calorii;
    }

    public void setCalorii(Double calorii) {
        this.calorii = calorii;
    }

    public Aliment(Long dataExp, String ingrediente, Double pret, Double calorii) {
        this.dataExp = dataExp;
        this.ingrediente = ingrediente;
        this.pret = pret;
        this.calorii = calorii;
    }

    public Aliment() {
        this.dataExp = 0l;
        this.ingrediente = "";
        this.pret = 0d;
        this.calorii = 0d;
    }
}