

package Ejercicio4;

public class TestBinaryTree {
    public static void main(String[] args) {
        var nodo8 = new BinaryTree(8, null, null);
        var nodo7 = new BinaryTree(7, null, nodo8);
        var nodo6 = new BinaryTree(6, null, null);
        var nodo5 = new BinaryTree(5, null, null);
        var nodo4 = new BinaryTree(4, null, null);
        var nodo3 = new BinaryTree(3, nodo6, nodo7);
        var nodo2 = new BinaryTree(2, nodo4, nodo5);
        var nodo1 = new BinaryTree(1, nodo2, nodo3);
        
        
//        System.out.println("¿Incluye 5? " + nodo1.incluye(7));
        
//        nodo1.preOrden();
        
//        nodo1.inOrden();
        
//        nodo1.postOrden();
        
        System.out.println("Amount of tree leaf: " + nodo1.countLeaf());        
        
           
        
        
    }
}
