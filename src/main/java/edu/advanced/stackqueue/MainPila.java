package edu.advanced.stackqueue;

public class MainPila {

    public static void main(String[] args) {
        // Ejemplo de uso de la Pila
        Pila p = new Pila();
        p.push(1);
        p.push(10);
        p.push(20);
        p.imprimir();
        System.out.println(p.pop());
        System.out.println("vacia " + p.estaVacia());
        System.out.println(p.pop());
        System.out.println(p.pop());
        System.out.println(p.pop());
        System.out.println("vacia " + p.estaVacia());
    }
}
