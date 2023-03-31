import java.util.HashSet;
import java.util.Set;

public class Semestru {
    private Integer an, semestru;
    private Set<Materie> materii;

    public Semestru(Integer an, Integer semestru) {
        this.an = an;
        this.semestru = semestru;
        this.materii = new HashSet<>();
    }

    public Semestru(Integer an, Integer semestru, Set<Materie> materii) {
        this.an = an;
        this.semestru = semestru;
        this.materii = materii;
    }

    public Integer getAn() {
        return an;
    }

    public void setAn(Integer an) {
        this.an = an;
    }

    public Integer getSemestru() {
        return semestru;
    }

    public void setSemestru(Integer semestru) {
        this.semestru = semestru;
    }

    public Set<Materie> getMaterii() {
        return materii;
    }

    public void setMaterii(Set<Materie> materii) {
        this.materii = materii;
    }

    @Override
    public String toString() {
        return "Semestru{" +
                "an=" + an +
                ", semestru=" + semestru +
                ", materii=" + materii +
                '}';
    }
}
