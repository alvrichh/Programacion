package model;

public interface Pila {
    void push(int x);
    int pop();
    boolean isEmpty();
}

public class PilaTabla implements Pila {
    private int[] pila;
    private int posicion;

    public PilaTabla() {
        pila = new int[10];
        posicion = -1;
    }

    @Override
    public void push(int x) {
        posicion++;
        pila[posicion] = x;
    }

    @Override
    public int pop() {
        int x = pila[posicion];
        posicion--;
        return x;
    }

    @Override
    public boolean isEmpty() {
        return posicion == -1;
    }
}

class PilaLista implements Pila {
    private static class Nodo {
        int dato;
        Nodo siguiente;

        Nodo(int x) {
            dato = x;
            siguiente = null;
        }
    }

    private Nodo raiz;

    public PilaLista() {
        raiz = null;
    }

    @Override
    public void push(int x) {
        Nodo nuevo = new Nodo(x);
        nuevo.siguiente = raiz;
        raiz = nuevo;
    }

    @Override
    public int pop() {
        int x = raiz.dato;
        raiz = raiz.siguiente;
        return x;
    }

    @Override
    public boolean isEmpty() {
        return raiz == null;
    }
}



