package edu.advanced.stackqueue;

public class Cola {

    private Nodo frente;
    private Nodo fondo;

    // inicializa la cola, con el frente y fondo a null
    public Cola() {
        frente = null;
        fondo = null;
    }

    public boolean estaVacia() {
        return (frente == null);
    }

    public void insertar(int info) {
        Nodo nuevo;
        nuevo = new Nodo();
        nuevo.setDato(info);
        nuevo.setLink(null);
        if (estaVacia()) {
            frente = nuevo;
            fondo = nuevo;
        } else {
            fondo.setLink(nuevo);
            fondo = nuevo;
        }
    }

    public int extraer() {
        if (!estaVacia()) {
            int informacion = frente.getDato();
            if (frente == fondo) {
                frente = null;
                fondo = null;
            } else {
                frente = frente.getLink();
            }

            return informacion;
        } else
            return Integer.MAX_VALUE;
    }

    public void imprimir() {
        Nodo temp = frente;
        System.out.println("Listado de todos los elementos de la cola.");
        while (temp != null) {
            System.out.print(temp.getDato() + " - ");
            temp = temp.getLink();
        }
        System.out.println();
    }

    public static void main(String[] ar) {
        Cola cola1 = new Cola();
        cola1.insertar(5);
        cola1.insertar(10);
        cola1.insertar(50);
        cola1.imprimir();

        System.out.println("Extraemos uno de la cola:" + cola1.extraer());
        cola1.imprimir();
    }
}
