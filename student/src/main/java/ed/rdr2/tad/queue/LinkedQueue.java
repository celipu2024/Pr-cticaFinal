package ed.rdr2.tad.queue;

import ed.rdr2.tad.IQueue;
import java.util.NoSuchElementException;

/**
 * Implementación de {@link IQueue} mediante lista enlazada simple.
 * Comportamiento FIFO: {@code enqueue} añade al final, {@code dequeue} extrae del frente.
 *
 * <p><b>TODO:</b> Implementa todos los métodos marcados con TODO.
 * Recuerda que el puntero {@code front} apunta al primero y
 * {@code rear} al último nodo de la cola.</p>
 *
 * <p><b>PROHIBIDO:</b> usar colecciones de {@code java.util.*} como estructura interna.</p>
 *
 * @param <T> tipo de elemento almacenado
 * @author Daniel Palacios Alonso
 */
public class LinkedQueue<T> implements IQueue<T> {

    private static class Node<T> {
        T data;
        Node<T> next;
        Node(T data) { this.data = data; }
    }

    private Node<T> front;
    private Node<T> rear;
    private int size;

    /** Construye una cola vacía. */
    public LinkedQueue() {
        front = null;
        rear  = null;
        size  = 0;
    }

    /**
     * Añade un elemento al final de la cola (FIFO).
     * Si la cola está vacía, front y rear apuntan al mismo nodo.
     */
    @Override
    public void enqueue(T element) {
        // TODO: Implementa este método
        throw new UnsupportedOperationException("TODO: Implementar enqueue");
    }

    /**
     * Extrae y devuelve el elemento del frente (FIFO).
     * Si queda vacía, actualiza rear a null.
     *
     * @throws NoSuchElementException si la cola está vacía
     */
    @Override
    public T dequeue() {
        // TODO: Implementa este método
        // Si isEmpty() → throw new NoSuchElementException("Queue is empty")
        throw new UnsupportedOperationException("TODO: Implementar dequeue");
    }

    /**
     * Consulta el elemento del frente sin extraerlo.
     *
     * @throws NoSuchElementException si la cola está vacía
     */
    @Override
    public T peek() {
        // TODO: Implementa este método
        throw new UnsupportedOperationException("TODO: Implementar peek");
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
