/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karenmm
 */
import java.util.LinkedList;

public class Error1Erroneo {
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

        int marker = listOfItems.size(); // Aqui hay un ERROR pq Este índice es inválido

        if (listOfItems.size() > 2) {
            marker = listOfItems.size() - 1;
        }

        float current = listOfItems.pollLast(); // Saca el último elemento
        float previous = listOfItems.get(marker); // Aqui puede dar ERROR ya q puede estar fuera del rango

        filtered = previous + ALPHA * (current - previous);

        return filtered;
    }
}
