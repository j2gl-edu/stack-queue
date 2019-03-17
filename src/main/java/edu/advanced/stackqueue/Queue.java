package edu.advanced.stackqueue;

public class Queue {

    private Nodo head;
    private Nodo tail;
    private int size;

    public Queue() {
        this.head = null;
        this.tail = null;
        size = 0;
    }

    // Insertar
    public void add(int value) {
        Nodo aux = new Nodo();
        aux.setDato(value);
        aux.setLink(null);
        size++;
        if (isEmpty()) {
            head = aux;
            tail = aux;
        } else {
            tail.setLink(aux);
            tail = aux;
        }
    }

    // Quitar
    public int poll() {
        if (!isEmpty()) {
            int value = head.getDato();
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.getLink();
            }
            size--;
            return value;
        } else {
            return Integer.MAX_VALUE;
        }
    }

    // Frente
    public int peek() {
        if (!isEmpty()) {
            int value = head.getDato();
            return value;
        } else {
            return Integer.MAX_VALUE;
        }
    }

    // colaVacia
    public boolean isEmpty() {
        if ((head == null) && (tail == null)) {
            return true;
        }
        return false;
    }

    // Tamaño de cola
    public int getSize() {
        return size;
    }
}