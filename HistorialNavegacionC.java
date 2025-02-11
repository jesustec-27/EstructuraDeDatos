/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas;
import java.util.LinkedList;
/*@author Gabriela Puch*/

public class HistorialNavegacionC {
    private LinkedList<String> historial;
    private int posicionActual;

    public HistorialNavegacionC() {
        historial = new LinkedList<>();
        posicionActual = -1; 
    }

    public String visitar(String url) {
        while (historial.size() > posicionActual + 1) {
            historial.removeLast();
        }

        historial.add(url);
        posicionActual++;
        System.out.println("Visitando: " + url);
        return null;
    }

    public void retroceder() {
        if (posicionActual > 0) {
            posicionActual--;
            System.out.println("Retrocediendo a: " + historial.get(posicionActual));
        } else {
            System.out.println("No hay páginas anteriores.");
        }
    }

    public void avanzar() {
        if (posicionActual < historial.size() - 1) {
            posicionActual++;
            System.out.println("Avanzando a: " + historial.get(posicionActual));
        } else {
            System.out.println("No hay páginas siguientes.");
        }
    }

    public static void main(String[] args) {
        HistorialNavegacionC historial = new HistorialNavegacionC();

        historial.visitar("google.com");
        historial.visitar("youtube.com");
        historial.visitar("linkedin.com");
        historial.retroceder();  
        historial.retroceder();  
        historial.avanzar();  
        historial.visitar("github.com");  
        historial.avanzar(); 
    }
}
