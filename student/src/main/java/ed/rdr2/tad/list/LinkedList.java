package ed.rdr2.tad.list;

import ed.rdr2.tad.IList;

/**
 * Implementación de {@link IList} mediante lista enlazada simple.
 *
 * <p><b>TODO:</b> Implementa todos los métodos marcados con TODO.
 * Recuerda que ya has implementado listas enlazadas en prácticas anteriores;
 * la estructura de nodos es análoga.</p>
 *
 * <p><b>PROHIBIDO:</b> usar {@code java.util.LinkedList}, {@code java.util.ArrayList}
 * u otras colecciones de {@code java.util.*} como estructura interna.</p>
 *
 * @param <T> tipo de elemento almacenado
 * @author Daniel Palacios Alonso
 */
public class LinkedList<T> implements IList<T> {

    // -------------------------------------------------------------------------
    // Nodo interno — ya proporcionado
    // -------------------------------------------------------------------------
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // -------------------------------------------------------------------------
    // Atributos — ya proporcionados
    // -------------------------------------------------------------------------
    private Node<T> head;
    private int size;

    /** Construye una lista vacía. */
    public LinkedList() {
        head = null;
        size = 0;
    }

    // -------------------------------------------------------------------------
    // TODO: Implementa los siguientes métodos
    // -------------------------------------------------------------------------

    /**
     * Inserta el elemento al final de la lista.
     * Recorre la lista hasta el último nodo y añade un nuevo nodo al final.
     * Si la lista está vacía, el nuevo nodo será la cabeza.
     *
     * @param element elemento a insertar
     */
    @Override
    public void addLast(T element) {
        // TODO: Implementa este método
        throw new UnsupportedOperationException("TODO: Implementar addLast");
    }

    /**
     * Inserta el elemento en la posición indicada (0-based).
     * Si index == 0, inserta al principio.
     * Si index == size, inserta al final.
     * Pista: recorre hasta el nodo en posición index-1 y reenlaza.
     *
     * @param index   posición de inserción
     * @param element elemento a insertar
     */
    @Override
    public void addAt(int index, T element) {
        // TODO: Implementa este método
        // Recuerda validar: if (index < 0 || index > size) lanzar IndexOutOfBoundsException
        throw new UnsupportedOperationException("TODO: Implementar addAt");
    }

    /**
     * Elimina la primera ocurrencia del elemento.
     * Recorre la lista comparando con equals().
     *
     * @param element elemento a eliminar
     * @return true si se eliminó, false si no existía
     */
    @Override
    public boolean remove(T element) {
        // TODO: Implementa este método
        throw new UnsupportedOperationException("TODO: Implementar remove");
    }

    /**
     * Devuelve el elemento en la posición indicada (0-based).
     *
     * @param index posición
     * @return elemento en esa posición
     */
    @Override
    public T get(int index) {
        // TODO: Implementa este método
        // Recuerda validar rango y lanzar IndexOutOfBoundsException
        throw new UnsupportedOperationException("TODO: Implementar get");
    }

    /** @return número de elementos en la lista */
    @Override
    public int size() {
        // TODO: Implementa este método
        throw new UnsupportedOperationException("TODO: Implementar size");
    }

    /** @return true si la lista está vacía */
    @Override
    public boolean isEmpty() {
        // TODO: Implementa este método
        throw new UnsupportedOperationException("TODO: Implementar isEmpty");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<T> current = head;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) sb.append(", ");
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
