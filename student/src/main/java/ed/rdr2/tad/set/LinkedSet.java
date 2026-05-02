package ed.rdr2.tad.set;

import ed.rdr2.tad.ISet;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementación de {@link ISet} mediante lista enlazada simple sin duplicados.
 *
 * <p>
 * <b>TODO:</b> Implementa todos los métodos marcados con TODO.
 * Recuerda que la unicidad se garantiza comprobando {@code contains}
 * antes de insertar, usando el método {@code equals} del tipo T.
 * </p>
 *
 * @param <T> tipo de elemento almacenado
 * @author Daniel Palacios Alonso
 */
public class LinkedSet<T> implements ISet<T> {

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> head;
    private int size;

    /** Construye un conjunto vacío. */
    public LinkedSet() {
        head = null;
        size = 0;
    }

    /**
     * Añade el elemento si no existe ya en el conjunto (usa equals).
     * Si ya existe, la operación no tiene ningún efecto.
     */
    @Override
    public void add(T element) {
        // TODO: Implementa este método
        // Pista: if (contains(element)) return; → luego añade al final
        throw new UnsupportedOperationException("TODO: Implementar add");
    }

    /**
     * Elimina la primera ocurrencia del elemento.
     *
     * @return true si se eliminó, false si no existía
     */
    @Override
    public boolean remove(T element) {
        // TODO: Implementa este método
        throw new UnsupportedOperationException("TODO: Implementar remove");
    }

    /**
     * Comprueba si el elemento pertenece al conjunto (usa equals).
     *
     * @return true si el elemento está en el conjunto
     */
    @Override
    public boolean contains(T element) {
        // TODO: Implementa este método
        throw new UnsupportedOperationException("TODO: Implementar contains");
    }

    @Override
    public int size() {
        // TODO: Implementa este método
        throw new UnsupportedOperationException("TODO: Implementar size");
    }

    @Override
    public boolean isEmpty() {
        // TODO: Implementa este método
        throw new UnsupportedOperationException("TODO: Implementar isEmpty");
    }

    /**
     * Devuelve los elementos como lista de Java (solo para salida/tests).
     * Recorre la lista enlazada y añade cada elemento a un ArrayList.
     */
    @Override
    public List<T> toList() {
        // TODO: Implementa este método
        throw new UnsupportedOperationException("TODO: Implementar toList");
    }
}
