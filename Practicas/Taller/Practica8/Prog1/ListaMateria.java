
import java.util.ArrayList;

public class ListaMateria {

    private ArrayList<Materia> materias;

    public ListaMateria() {
        this.materias = new ArrayList<>();
    }

    public void agregarMateria(Materia materia) {
        materias.add(materia);
    }

    public void eliminarMateria(String nombre) {
        materias.removeIf(m -> m.getNombre().equalsIgnoreCase(nombre));
    }

    public Materia buscarMateria(String nombre) {
        for (Materia materia : materias) {
            if (materia.getNombre().equalsIgnoreCase(nombre)) {
                return materia;
            }
        }
        return null;
    }

    public void mostrarMaterias() {
        for (Materia materia : materias) {
            System.out.println(materia);
        }
    }
}
