package Materia.Cola;

import java.util.NoSuchElementException;

import Materia.Models.Node;

public class cola {
    private Node first;
    private Node last;


    public cola (){
        this.first=null;
        this.last =null;

    }

    public void addNode (int value){
        Node nuevoNodo = new Node( value);
        if (isEmpty()){
            first = nuevoNodo;
            last = nuevoNodo;

        }else{
            last.next = nuevoNodo;
            last= nuevoNodo;

        }

    }

    public int remove(){
        if ( isEmpty()){
            throw new NoSuchElementException("La cola esta vacia");

        }

        int value = first.value;
        first= first.next;
        if(first == null){
            last = null;
        }
        return value;
    }
    
    public int peek(){
        if(isEmpty()    ){
            throw new  NoSuchElementException("La cola esta vacia ");

        }
        return first.value;

    }
    public boolean isEmpty(){
        return first== null;
    }
    
}
