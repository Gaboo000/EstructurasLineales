import Ejercicio_1_sign.SignValidator;
import Ejercicio_2_sorting.StackSorter;
import Materia.Cola.Colagenerica;
import Materia.Cola.cola;
import Materia.ListasEnlazadas.ListaEnlazada;
import Materia.Models.Pantalla;
import Materia.Pilas.Pilas;
import Materia.Pilas.PilasGenerica;
import java.util.Stack;

import Ejercicio_03_linkedLists.LinkedListEjr;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Pilas pila = new Pilas();

        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);
        System.out.println("El elemento de la cima ce la pila es: "+pila.peek());
        System.out.println("El elemento eliminado de la pila es: "+pila.pop());
        System.out.println("El elemento de la cima de la pila es: "+pila.peek());


        System.out.println();


        ////implementacion de la pila generica
        //IMPLEMENTACION DE PILA GENERICA
        PilasGenerica<Pantalla> pilaPantallas = new PilasGenerica<>();

        pilaPantallas.push(new Pantalla(1,"Home Page", "/home"));
        pilaPantallas.push(new Pantalla(2,"Menu Page", "/menu"));
        pilaPantallas.push(new Pantalla(3,"Settings Page", "/home/menu/settings"));

        System.out.println("Estoy en la pantalla:\n\t "+pilaPantallas.peek().getNombre());
        System.out.println("Destruir pantalla:\n\t "+pilaPantallas.pop().getNombre());
        System.out.println("Estoy en la pantalla:\n\t "+pilaPantallas.peek().getNombre());


        //implementacion de cola generica tipo pantalla

        cola queue = new cola();
        queue.addNode(0);
        queue.addNode(20);
        queue.addNode(30);

        //mostrar el elemento en el frente 
        System.out.println("Elemento en frente: " + queue.peek());//10

        //retirar elementos de la cola 
        System.out.println("Elemento retirado: "+queue.remove());
        System.out.println("Elemento en el frente: "+queue.peek());
        
        System.out.println("Elemento retirado: "+queue.remove());
        System.out.println("Elemento retirado: "+queue.remove());

        // implementacion cola generica

        Colagenerica <Pantalla> queueGeneric = new Colagenerica<>(1);
        queueGeneric.addNode(new Pantalla(1,"Home page","/home"));
        queueGeneric.addNode(new Pantalla(2,"Menu page","/home/menu"));
        queueGeneric.addNode(new Pantalla(3,"Settings","/home/menu/settings"));
        System.out.println("Estoy en la pantalla \t");
                queueGeneric.peek().getNombre();
        System.out.println("Pantalla destruida \t");
                queueGeneric.peek().getNombre();
        queueGeneric.addNode(new Pantalla(4,"User page", "/home/menu/user"));
        System.out.println("Tamaño después de agregar: " + queueGeneric.getSize());
        
        System.out.println("Estoy en la pantalla:\t"+queueGeneric.peek().getNombre());
        System.out.println("Pantalla destruida:\t" +queueGeneric.remove().getNombre());
        System.out.println("Tamaño después de eliminar: " + queueGeneric.getSize());
        System.out.println("Pantalla destruida:\t" +queueGeneric.remove().getNombre());
        System.out.println("Tamaño después de eliminar: " + queueGeneric.getSize());
        System.out.println("Estoy en la pantalla:\t"+queueGeneric.peek().getNombre());
        System.out.println("Tamaño: " + queueGeneric.getSize());


        SignValidator validaror = new SignValidator();

        
        System.out.println(validaror.isValid("([]){}"));
        System.out.println(validaror.isValid("({)}"));
        


        StackSorter sorter = new StackSorter();

        
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        
        System.out.println("Stack original: " + stack);
        sorter.sortStack(stack);
        System.out.println("Stack ordenado: " + stack);


        ListaEnlazada lista = new ListaEnlazada();
        lista.addNode(1);
        lista.addNode(4);
        lista.addNode(3);
        lista.addNode(6);
        lista.print();
        lista.deleteNode(1);
        lista.print();
        lista.deleteNode(3);
        lista.print();




        LinkedListEjr linkedList = new LinkedListEjr();

        // Agregar elementos a la lista
        linkedList.push(6);
        linkedList.push(7);
        linkedList.push(5);
        linkedList.push(2);
        linkedList.push(1);

        //Imprime solo una posición de la lista
        /*
         * Posición a buscar
         * int posicion = 1;
         * System.out.println("Posición a buscar: " + posicion);
         * 
         * // Obtener el valor en la posición indicada
         * int valor = linkedList.getByPos(posicion);
         * System.out.println("Return: " + valor);
         */

        // Imprimir la lista
        System.out.println("Lista Enlazada con los datos:");
        linkedList.printList();

        // Imprimir todas ls posiciones
        for (int posicion = 0; posicion < linkedList.size(); posicion++) {
            // Obtener el valor en la posición indicada
            int valor = linkedList.getByPos(posicion);
            System.out.println("Posición: " + posicion + " | Valor: " + valor);
        }
        
    




        

    }



}
