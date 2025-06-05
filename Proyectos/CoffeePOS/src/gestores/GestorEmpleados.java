/**
 * Gestor de empleados
 */
package gestores;

import interfaces.OperacionesCRUD;
import java.util.*;
import modelos.*;

public class GestorEmpleados implements OperacionesCRUD<Empleado> {

    private final List<Empleado> empleados;

    public GestorEmpleados() {
        this.empleados = new ArrayList<>();
    }

    @Override
    public void agregar(Empleado empleado) {
        empleados.add(empleado);
        System.out.println("Empleado registrado: " + empleado.getNombre());
    }

    @Override
    public Empleado buscar(int id) {
        return empleados.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public boolean actualizar(int id, Empleado empleado) {
        Empleado existente = buscar(id);
        if (existente != null) {
            existente.setNombre(empleado.getNombre());
            existente.setSalario(empleado.getSalario());
            System.out.println("Empleado actualizado: " + existente.getNombre());
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        Empleado empleado = buscar(id);
        if (empleado != null) {
            empleados.remove(empleado);
            System.out.println("Empleado eliminado: " + empleado.getNombre());
            return true;
        }
        return false;
    }

    @Override
    public void listar() {
        System.out.println("\n=== LISTA DE EMPLEADOS ===");
        empleados.forEach(System.out::println);
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }
}
