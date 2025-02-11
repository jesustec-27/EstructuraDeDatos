/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas;
import java.util.LinkedList;

/* @author Gabriela Puch*/

public class HistorialNavegacion {
    private LinkedList<String> historial;
    private int posicionActual; 

    public HistorialNavegacion() {
        historial = new LinkedList<>();
        posicionActual = -1; 
    }

    public void visitarPagina(String url) {
        
        while (historial.size() > posicionActual + 1) {
            historial.removeLast(); 
        }
        historial.add(url);
        posicionActual++;
        System.out.println("Visitando: " + url);
    }

    public void retroceder() {
        if (posicionActual > 0) {
            posicionActual--;
            System.out.println("Retrocediendo a: " + historial.get(posicionActual));
        } else {
            System.out.println("No hay páginas previas.");
        }
    }

    public void avanzar() {
       posicionActual++;  
       System.out.println("Avanzando a: " + historial.get(posicionActual));
    }

    public static void main(String[] args) {
        HistorialNavegacion historial= new HistorialNavegacion();
        historial.visitarPagina("google.com");
        historial.visitarPagina("youtube.com");
        historial.visitarPagina("linkedin.com");
       
        historial.retroceder();
        historial.retroceder();
        historial.avanzar();
        historial.visitarPagina("github.com");
        historial.avanzar(); 
       

    }
}
