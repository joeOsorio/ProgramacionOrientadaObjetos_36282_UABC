package interfaces;
// ========== INTERFACES ==========

/**
 * Interfaz para operaciones CRUD genéricas
 */
public interface OperacionesCRUD<T> {

    void agregar(T objeto);

    T buscar(int id);

    boolean actualizar(int id, T objeto);

    boolean eliminar(int id);

    void listar();
}
