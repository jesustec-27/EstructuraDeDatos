/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karenmm
 */


import java.util.LinkedList;

public class Error3Arreglado<T extends Comparable<? super T>> extends LinkedList<T> {
    private LinkedList<T> list; // La lista ordenada

    // Constructor: Recibe una lista y la ordena con Insertion Sort
    public Error3Arreglado(LinkedList<T> in) {
        list = new LinkedList<>(); // Se inicializa siempre para evitar NullPointerException

        if (in == null || in.isEmpty()) // Se manejan las listas vacias
            return;

        for (T e : in)
            list.add(e);

        int i, j;
        T temp;
        for (i = 0; i < list.size(); i++) {
            j = i;
            temp = list.get(j);
            while (j > 0 && list.get(j - 1).compareTo(temp) > 0) {
                list.set(j, list.get(j - 1));
                j--;
            }
            list.set(j, temp);
        }
    }

    // Unión de dos listas ordenadas
    public Error3Arreglado<T> makeUnion(Error3Arreglado<T> other) {
        LinkedList<T> mergedList = new LinkedList<>(); // Se crea una nueva lista en lugar de modificar el campo 'list'
        
        int i = 0, j = 0;
        while (i < this.list.size() && j < other.list.size()) {
            if (this.list.get(i).compareTo(other.list.get(j)) <= 0) {
                mergedList.add(this.list.get(i));
                i++;
            } else {
                mergedList.add(other.list.get(j));
                j++;
            }
        }
        while (i < this.list.size()) {
            mergedList.add(this.list.get(i));
            i++;
        }
        while (j < other.list.size()) {
            mergedList.add(other.list.get(j));
            j++;
        }
        
        return new Error3Arreglado<>(mergedList); // Se devuelve una nueva instancia con la lista unida
    }

    // Método para imprimir la lista
    public void print() {
        if (list.isEmpty()) { // Checamos que la lista no esté vacía antes de imprimir
            System.out.println("La lista está vacía.");
            return;
        }
        for (T e : list)
            System.out.println(e);
    }

    public static void main(String[] args) {
        LinkedList<Integer> lista1 = new LinkedList<>();
        lista1.add(3);
        lista1.add(1);
        lista1.add(4);
        lista1.add(2);

        LinkedList<Integer> lista2 = new LinkedList<>();
        lista2.add(6);
        lista2.add(5);
        lista2.add(8);
        lista2.add(7);

        Error3Arreglado<Integer> sll1 = new Error3Arreglado<>(lista1);
        Error3Arreglado<Integer> sll2 = new Error3Arreglado<>(lista2);
        Error3Arreglado<Integer> unionList = sll1.makeUnion(sll2);

        unionList.print(); // Ya imprime correctamente la lista ordenada unida
    }
}
