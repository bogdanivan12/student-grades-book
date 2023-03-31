import java.util.ArrayList;
import java.util.List;

public class NotaCompusa extends Nota {
    private List<Nota> note;

    public NotaCompusa() {
        super();
        this.note = new ArrayList<>();
    }

    public NotaCompusa(List<Nota> note) {
        super();
        this.note = note;
    }

    public List<Nota> getNote() {
        return note;
    }

    public void setNote(List<Nota> note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return super.toString() + "NotaCompusa{" +
                "note=" + note +
                '}';
    }
}
