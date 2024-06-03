package Materia.Pilas;

import java.util.EmptyStackException;

import Materia.Models.NodoGenerico;

public class PilasGenerica <T> {
    private NodoGenerico <T> top;

    public PilasGenerica(){
        top = null;

    }

    public void push (T dato){
        NodoGenerico <T> nuevoNodo = new NodoGenerico<T>(dato);
        nuevoNodo.next =top;
        top = nuevoNodo;
    }

    public boolean isEmpty(){
        return top == null;

    }

    public T pop(){
        if (isEmpty()){
            System.out.println("Esta pila esta vacia");
            throw new EmptyStackException();

        }

        T data = top.data;
        top = top.next;
        return data;
    }
    
}
