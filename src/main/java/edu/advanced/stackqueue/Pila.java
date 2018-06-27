package edu.advanced.stackqueue;

public class Pila {

    private Nodo inicio;
    private int tamanio;

    // inicia la pila
    public Pila() {
        inicio = null;
    }

    // agrega un elemento a la pila
    public void push(int valor) {
        Nodo nuevo;
        nuevo = new Nodo();
        nuevo.setDato(valor);
        // es el primer elemento
        if (inicio == null) {
            nuevo.setLink(null);
            inicio = nuevo;
        } else { // ya existen elementos
            nuevo.setLink(inicio);
            // el nuevo elemento es el inicio de la pila
            inicio = nuevo;
        }
        tamanio++;
    }

    // devuelve el elemento eliminado de la pila
    public int pop() {
        // verifica que existan elementos en la pila
        if (inicio != null) {
            int valor = inicio.getDato();
            // redirecciona el inicio al elemento siguiente
            inicio = inicio.getLink();
            return valor;
        } else {
            // devuelve un valor que identifique un error
            return Integer.MAX_VALUE;
        }
    }

    // si
    public boolean estaVacia() {
        return (inicio == null);
    }

    public void limpiar() {
        inicio = null;
        tamanio = 0;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void imprimir() {
        Nodo temp = inicio;
        System.out.println(" Listado de todos los elementos de la pila.");
        while (temp != null) {
            System.out.print(temp.getDato() + " - ");
            temp = temp.getLink();
        }
        System.out.println();
    }

    public int getTamanio() {
        return tamanio;
    }
}
