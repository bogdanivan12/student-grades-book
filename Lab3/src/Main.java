import java.util.List;

public class Main {
    public static void main(String[] args) {
        var list = List.of(new Lapte(), new Carne(), new Cereale(), new Aliment());

        list.stream()
                .sorted((e1, e2) -> (int) (e1.getCalorii() - e2.getCalorii()))
                .toList();
    }
}