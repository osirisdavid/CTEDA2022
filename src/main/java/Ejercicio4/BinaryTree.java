package Ejercicio4;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<T> {

    private T value;
    private BinaryTree<T> leftChild;
    private BinaryTree<T> rightChild;
    public static int counterLeaf;

    public BinaryTree(T value) {
        this.value = value;
    }

    public BinaryTree(T value, BinaryTree<T> leftSon, BinaryTree<T> rightSon) {
        this.value = value;
        this.leftChild = leftSon;
        this.rightChild = rightSon;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public BinaryTree<T> getLeftChild() {
        return this.leftChild;
    }

    public void setLeftChild(BinaryTree<T> leftChild) {
        this.leftChild = leftChild;
    }

    public BinaryTree<T> getRightChild() {
        return this.rightChild;
    }

    public void setRightChild(BinaryTree<T> rightChild) {
        this.rightChild = rightChild;
    }

    public Boolean incluye(T dato) {
        Boolean res = false;
        if (this.value == dato) {
            return true;
        }
        if (this.leftChild != null) {
            res = this.leftChild.incluye(dato);
            
        }
        if (this.rightChild != null && !res) {
            res = this.rightChild.incluye(dato);
        }
        return res;
    }

    //Se procesa primero la raíz y luego sus hijos, izquierdo y derecho.
    public void preOrden() {
        System.out.println(this.value);
        if (this.leftChild != null) {
            this.leftChild.preOrden();
        }
        if (this.rightChild != null) {
            this.rightChild.preOrden();
        }
    }
//Se procesa el hijo izquierdo, luego la raíz y último el hijo derecho
    public void inOrden() {
        
        if (this.leftChild != null) {
            
            this.leftChild.inOrden();
        }
        System.out.println(this.value);
        if (this.rightChild != null) {
            
            this.rightChild.inOrden();
        }
    }
    
    //Se procesan primero los hijos, izquierdo y derecho, y luego la raíz
    public void postOrden() {
        if (this.leftChild != null) {
            this.leftChild.postOrden();
        }
        if (this.rightChild != null) {
            this.rightChild.postOrden();
        }
        System.out.println(this.value);
    }
    
    
    //Contar hojas
    public int countLeaf(){
        if(this.leftChild == null && this.rightChild == null){
            System.out.println("counting leaf: " + ++BinaryTree.counterLeaf);
        }
        if(this.leftChild!= null){
            this.leftChild.countLeaf();
        }
        if(this.getRightChild() != null){
            this.rightChild.countLeaf();
        }
        return BinaryTree.counterLeaf; 
    }
    
    
    
    public void entreNiveles(){
        cola.encolar(value);
        while(!cola.esVacia()){
            cola.desencolar(value);
            System.out.println(value);
        }
    }
}
