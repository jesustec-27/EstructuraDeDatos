/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karenmm
 */
import java.util.LinkedList;

public class Error1Arreglado {
    public static void main(String[] args) {
        LinkedList<Float> valores = new LinkedList<>();
        
        // valores para probar
        valores.add(1.0f);
        valores.add(2.5f);
        valores.add(3.2f);
        valores.add(4.1f);
        valores.add(5.0f);

        float resultado = filterValue(valores);
        
        System.out.println("Valor filtrado: " + resultado);
    }

    private static float filterValue(LinkedList<Float> listOfItems) {
        final float ALPHA = 0.2f;
        float filtered;

        // Verificar si no esta vacia
        if (listOfItems.isEmpty()) {
            return 0; // Si no devuelve 0
        } 
        
        // Si solo hay uno se devuelve el mismo
        if (listOfItems.size() == 1) {
            return listOfItems.getFirst();
        }

        float current = listOfItems.pollLast(); // Sacamos el ultimo

        int marker = listOfItems.size() - 1; // Se ajusta el índice

        float previous = listOfItems.get(marker); // Ahora siempre es un índice válido

        filtered = previous + ALPHA * (current - previous);

        return filtered;
    }
}

