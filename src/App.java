import Materia.Cola.Colagenerica;
import Materia.Cola.cola;
import Materia.Models.Pantalla;
import Materia.Pilas.Pilas;
import Materia.Pilas.PilasGenerica;

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

        

    }



}
