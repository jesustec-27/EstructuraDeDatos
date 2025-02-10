/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareas;
import java.util.LinkedList;
/*@author Gabriela Puch */
public class CasoAplicativo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println("Lista inicial: " + list);

        int index = 5; 
        if (index >= 0 && index < list.size()) { 
            System.out.println("Elemento en la posicion " + index + 
                    ": " + list.get(index));
        } else {
            System.out.println("Indice fuera de rango");
        }
    }
}
    

