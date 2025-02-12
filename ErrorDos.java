/*Se intenta implementar una estructura de datos de LinkedList en Java.
Se está creando una clase que maneja nodos y tiene operaciones para insertar, eliminar 
y mostrar los elementos de la lista.
Cuando intenta ejecutar el código, se encuentra con advertencias de compilación 
(unchecked warning). 
Aunque el código parece  funcionar indica que hay un problema potencial 
que podría llevar a fallos en el futuro. */


/* import java.util.LinkedList;

class LL{
public static void main(String[] args){

    //creating a new linked list object
    LinkedList LLobj = new LinkedList();

    //adding data to linked list
    LLobj.add("T");
    LLobj.add("H");
    LLobj.add("I");
    LLobj.add("S");
    LLobj.add(" ");
    LLobj.add("I");
    LLobj.add("S");
    LLobj.add(" ");
    LLobj.add("A");
    LLobj.add(" ");
    LLobj.add("L");
    LLobj.add("I");
    LLobj.add("N");
    LLobj.add("K");
    LLobj.add("E");
    LLobj.add("D");
    LLobj.add("-");
    LLobj.add("L");
    LLobj.add("I");
    LLobj.add("S");
    LLobj.add("T");

    //printing the linked list
    System.out.println(LLobj);

    //Implementing more functions to add data
    LLobj.addFirst("#");
    LLobj.addLast("#");
    LLobj.add(5,"$");

    //printing the linked list
    System.out.println(LLobj);

    //removing data
    LLobj.remove("$");
    LLobj.remove("#");
    LLobj.remove("#");

    //printing the linked list
    System.out.println(LLobj);
    }
} */

/*La advertencia que ocurre es porque se utiliza un tipo sin especificar, un tipo 
genérico para LinkedList. Para resolver esto, se debe declarar la lista 
con un tipo específico, como LinkedList<String>, para indicar 
que solo almacenará objetos de tipo String. Esto asegura la seguridad de 
tipos y elimina las advertencias de tipo no comprobado.
¿Cómo solucionarlo?
		LinkedList<String> LLobj = new LinkedList<>()
Esto eliminara las advertencias, y el compilador sabrá que solo se permiten 
objetos String en la lista.*/

