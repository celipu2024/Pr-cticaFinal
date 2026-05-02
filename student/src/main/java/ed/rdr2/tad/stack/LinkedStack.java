package ed.rdr2.tad.stack;

import ed.rdr2.tad.IStack;
import java.util.NoSuchElementException;

/**
 * Implementación de {@link IStack} mediante lista enlazada simple.
 * Comportamiento LIFO: {@code push} y {@code pop/undo} operan sobre la cima.
 *
 * <p><b>TODO:</b> Implementa todos los métodos marcados con TODO.
 * El puntero {@code top} apunta siempre al nodo de la cima.</p>
 *
 * <p><b>PROHIBIDO:</b> usar colecciones de {@code java.util.*} como estructura interna.</p>
 *
 * @param <T> tipo de elemento almacenado
 * @author Daniel Palacios Alonso
 */
public class LinkedStack<T> implements IStack<T> {

    private static class Node<T> {
        T data;
        Node<T> next;
        Node(T data) { this.data = data; }
    }

    private Node<T> top;
    private int size;

    /** Construye una pila vacía. */
    public LinkedStack() {
        top  = null;
        size = 0;
    }

    /**
     * Apila un elemento en la cima (LIFO).
     * El nuevo nodo apunta al antiguo top; top pasa a ser el nuevo nodo.
     */
    @Override
    public void push(T element) {
        // TODO: Implementa este método
        throw new UnsupportedOperationException("TODO: Implementar push");
    }

    /**
     * Extrae y devuelve el elemento de la cima (LIFO).
     *
     * @throws NoSuchElementException si la pila está vacía
     */
    @Override
    public T pop() {
        // TODO: Implementa este método
        throw new UnsupportedOperationException("TODO: Implementar pop");
    }

    /**
     * Consulta la cima sin extraerla.
     *
     * @throws NoSuchElementException si la pila está vacía
     */
    @Override
    public T peek() {
        // TODO: Implementa este método
        throw new UnsupportedOperationException("TODO: Implementar peek");
    }

    /**
     * Deshace la última acción. Semánticamente equivalente a {@link #pop()}.
     *
     * @throws NoSuchElementException si la pila está vacía
     */
    @Override
    public T undo() {
        // TODO: Implementa este método (pista: llama a pop())
        throw new UnsupportedOperationException("TODO: Implementar undo");
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
}
