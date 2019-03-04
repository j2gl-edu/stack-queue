package edu.advanced.stackqueue;

public class Main {

    public static void main(String[] args) {
        System.out.println("Stack Queue Example");
        
        Cola cola = new Cola();
        Pila pila = new Pila();

        for (int i = 1; i <= 10; i++) {
            cola.insertar(i);
            pila.push(i);
        }

        System.out.println("Queue: ");
        while (!cola.estaVacia()) {
            System.out.println(cola.extraer());
        }

        System.out.println();

        System.out.println("Stack: ");
        while (!pila.estaVacia()) {
            System.out.println(pila.pop());
        }
    }

}