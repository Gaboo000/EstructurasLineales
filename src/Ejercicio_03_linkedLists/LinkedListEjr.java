package Ejercicio_03_linkedLists;
import Materia.Models.*;

public class LinkedListEjr {

    private Node head;


    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }


    public int getByPos(int posicion) {
        Node current = head;

        for (int i = size() - 1; i > posicion; i--) {
            current = current.next;

            if (current == null) {
                return -1;
            }
        }

        return current.value;

        
    }
    public int size() {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }


    public void printList() {
        Node current = head;
        System.out.print("Lista Enlazada con los datos: ");
        while (current != null) {
            System.out.print(current.value);
            if (current.next != null) {
                System.out.print("->");
            }
            current = current.next;
        }
        System.out.println();
    }


    
}
