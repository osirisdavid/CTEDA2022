
import Ejercicio4.ArbolBinario;





public class TestBinaryTree {
    public static void main(String[] args) {
        var nodo8 = new ArbolBinario(8, null, null);
        var nodo7 = new ArbolBinario(7, null, nodo8);
        var nodo6 = new ArbolBinario(6, null, null);
        var nodo5 = new ArbolBinario(5, null, null);
        var nodo4 = new ArbolBinario(4, null, null);
        var nodo3 = new ArbolBinario(3, nodo6, nodo7);
        var nodo2 = new ArbolBinario(2, nodo4, nodo5);
        var nodo1 = new ArbolBinario(1, nodo2, nodo3);
        
        
//        System.out.println("¿Incluye 5? " + nodo1.incluye(7));
        
//        nodo1.preOrden();
        
//        nodo1.inOrden();
        
//        nodo1.postOrden();
        
        System.out.println("Contando hojas: " + nodo1.contarHojas());        
        
           
        
        
    }
}
