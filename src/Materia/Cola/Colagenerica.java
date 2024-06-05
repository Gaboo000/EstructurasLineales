package Materia.Cola;

import java.util.NoSuchElementException;

import Materia.Models.NodoGenerico;

public class Colagenerica <T> {
    private NodoGenerico <T> first;
    private NodoGenerico <T> last;
    private int  size;

    



    public void setSize(int size) {
        this.size = size;
    }


    public Colagenerica(int size) {
        this.size = size;
    }


    public void addNode (T data){
        NodoGenerico<T> nuevoNodo = new NodoGenerico<>(data);
        if (isEmpty()) {
            first = nuevoNodo;
            last = nuevoNodo;     
        }else{
            last.next = nuevoNodo;
            last = nuevoNodo;
        }
        size++;
    }


    public T remove (){
        if (isEmpty()) {
            throw new NoSuchElementException("La cola está vacía. ");
        }
        T value = first.data;
        first = first.next;
        size--;

        if (first==null) {
            last = null;
        }
        return value;
    }

    public T peek (){
        if (isEmpty()){
            throw new NoSuchElementException("La cola esta vacia ");

        }
        return first.data;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public int getSize(){
        return size;
    }


    
}
