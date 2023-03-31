import java.util.HashMap;
import java.util.Map;

public class Materie {
    private Map<Profesor, TipCurs> profesori;
    private Nota nota;

    public Materie() {
        this.profesori = new HashMap<>();
        this.nota = new Nota();
    }

    public Materie(Nota nota) {
        this.nota = nota;
        this.profesori = new HashMap<>();
    }

    public Map<Profesor, TipCurs> getProfesori() {
        return profesori;
    }

    public void setProfesori(Map<Profesor, TipCurs> profesori) {
        this.profesori = profesori;
    }

    public Nota getNota() {
        return nota;
    }

    public void setNota(Nota nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Materie{" +
                "profesori=" + profesori +
                ", nota=" + nota +
                '}';
    }
}
