package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Cola<T> {

    private final List<T> datos;

    public Cola() {
        this.datos = new ArrayList();
    }

    public void encolar(T elem) {
        this.datos.add(elem);
    }

    public T desencolar() {
        T temp = this.datos.get(0);
        this.datos.remove(0);
        return temp;
    }

    public T tope() {
        return this.datos.get(0);
    }

    public Boolean esVacia() {
        return this.datos.isEmpty();
    }
}
