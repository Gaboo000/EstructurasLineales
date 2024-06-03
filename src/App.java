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
        PilasGenerica<Pantalla> pilaPantallas = new PilasGenerica<>();
        pilaPantallas.push(new Pantalla("Home Page", "/home"));
        pilaPantallas.push(new Pantalla("Home Page", "/home"));
        pilaPantallas.push(new Pantalla("Home Page", "/home"));
        pilaPantallas.push(new Pantalla("Home Page", "/home"));
        pilaPantallas.push(new Pantalla("Home Page", "/home"));
        pilaPantallas.push(new Pantalla("Home Page", "/home"));
        pilaPantallas.push(new Pantalla("Home Page", "/home"));

    }


}
