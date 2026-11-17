import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Comparators {
    public static final Comparator<Estudiante> C2 = (a, b) -> {
        int r = a.getNombre().compareTo(b.getNombre());
        return (r != 0) ? r : a.getCodigo().compareTo(b.getCodigo());
    };

    // C3: nota asc, sin desempate
    public static final Comparator<Estudiante> C3 =
            Comparator.comparingDouble(Estudiante::getNota);

    // C4: nota desc; nombre asc
    public static final Comparator<Estudiante> C4 =
            Comparator.comparingDouble(Estudiante::getNota).reversed()
                      .thenComparing(Estudiante::getNombre);

    // C5: edad asc; nombre desc
    public static final Comparator<Estudiante> C5 =
            Comparator.comparingInt(Estudiante::getEdad)
                      .thenComparing(Estudiante::getNombre, Comparator.reverseOrder());

    // C6: carrera asc; nota desc; nombre asc; código asc
    public static final Comparator<Estudiante> C6 =
            Comparator.comparing(Estudiante::getCarrera)
                      .thenComparing(Estudiante::getNota, Comparator.reverseOrder())
                      .thenComparing(Estudiante::getNombre)
                      .thenComparing(Estudiante::getCodigo);

    // C7: nota ajustada desc; nombre asc; código asc
    private static double notaAjustada(Estudiante e) {
        return "Computacion".equals(e.getCarrera())
                ? Math.min(10.0, e.getNota() + 0.5)
                : e.getNota();
    }

    public static final Comparator<Estudiante> C7 = (a, b) -> {
        int r = Double.compare(notaAjustada(b), notaAjustada(a));
        if (r != 0) return r;
        r = a.getNombre().compareTo(b.getNombre());
        return (r != 0) ? r : a.getCodigo().compareTo(b.getCodigo());
    };
}