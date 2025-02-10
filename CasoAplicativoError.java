/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareas;
import java.util.LinkedList;
/*@author Gabriela Puch*/
public class CasoAplicativoError {
    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<>();
        
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println("Lista inicial: " + list);

        System.out.println("Elemento en la posicion 5: " + list.get(5));
    }
}
