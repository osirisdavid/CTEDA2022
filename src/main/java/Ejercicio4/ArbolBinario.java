package Ejercicio4;



public class ArbolBinario<T> {

    private T value;
    private ArbolBinario<T> hijoIzquierdo;
    private ArbolBinario<T> hijoDerecho;
    public static int counterLeaf;

    public ArbolBinario(T value) {
        this.value = value;
    }

    public ArbolBinario(T value, ArbolBinario<T> hijoIzquierdo, ArbolBinario<T> hijoDerecho) {
        this.value = value;
        this.hijoIzquierdo = hijoIzquierdo;
        this.hijoDerecho = hijoDerecho;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public ArbolBinario<T> getHijoIzquierdo() {
        return this.hijoIzquierdo;
    }

    public void setHijoIzquierdo(ArbolBinario<T> hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public ArbolBinario<T> getHijoDerecho() {
        return this.hijoDerecho;
    }

    public void setHijoDerecho(ArbolBinario<T> hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    public Boolean incluye(T dato) {
        Boolean res = false;
        if (this.value == dato) {
            return true;
        }
        if (this.hijoIzquierdo != null) {
            res = this.hijoIzquierdo.incluye(dato);
            
        }
        if (this.hijoDerecho != null && !res) {
            res = this.hijoDerecho.incluye(dato);
        }
        return res;
    }

    //Se procesa primero la raíz y luego sus hijos, izquierdo y derecho.
    public void preOrden() {
        System.out.println(this.value);
        if (this.hijoIzquierdo != null) {
            this.hijoIzquierdo.preOrden();
        }
        if (this.hijoDerecho != null) {
            this.hijoDerecho.preOrden();
        }
    }
//Se procesa el hijo izquierdo, luego la raíz y último el hijo derecho
    public void inOrden() {
        
        if (this.hijoIzquierdo != null) {
            
            this.hijoIzquierdo.inOrden();
        }
        System.out.println(this.value);
        if (this.hijoDerecho != null) {
            
            this.hijoDerecho.inOrden();
        }
    }
    
    //Se procesan primero los hijos, izquierdo y derecho, y luego la raíz
    public void postOrden() {
        if (this.hijoIzquierdo != null) {
            this.hijoIzquierdo.postOrden();
        }
        if (this.hijoDerecho != null) {
            this.hijoDerecho.postOrden();
        }
        System.out.println(this.value);
    }
    
    
    //Contar hojas
    public int contarHojas(){
        if(this.hijoIzquierdo == null && this.hijoDerecho == null){
            ++ArbolBinario.counterLeaf;
        }
        if(this.hijoIzquierdo!= null){
            this.hijoIzquierdo.contarHojas();
        }
        if(this.getHijoDerecho() != null){
            this.hijoDerecho.contarHojas();
        }
        return ArbolBinario.counterLeaf; 
    }
    
    
    
    public void entreNiveles(Cola<T> cola){
        cola.encolar(value);
        while(!cola.esVacia()){
            //cola.desencolar(value);
            System.out.println(value);
        }
    }
}
