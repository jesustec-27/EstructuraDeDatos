/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karenmm
 */

import java.util.LinkedList;

public class Error3Erroneo<T extends Comparable<? super T>> extends LinkedList<T> {
    private LinkedList<T> list; 

    // Constructor: Recibe una lista y la ordena con Insertion Sort
    public Error3Erroneo(LinkedList<T> in) {
        if (in.peek() == null || in.size() == 1) // Error pq Si la lista es vacía o de un solo elemento, salimos
            return;
        else {
            list = new LinkedList<T>(); // Aqui se inicializa aquí, pero solo si entramos en el else
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
    }

    // Unión de dos listas ordenadas
    public Error3Erroneo<T> makeUnion(Error3Erroneo<T> other) {
        list = new LinkedList<T>(); // Erro pq aquí redefinimos list, pero la clase original no la inicializó bien
        Error3Erroneo<T> temp = new Error3Erroneo<T>(list); //  list podría ser null
        int i = 0, j = 0;

        while (i < this.size() && j < other.size()) {
            if (this.get(i).compareTo(other.get(j)) <= 0) {
                temp.add(this.get(i));
                i++;
            } else {
                temp.add(other.get(j));
                j++;
            }
        }
        while (i < this.size()) {
            temp.add(this.get(i));
            i++;
        }
        while (j < other.size()) {
            temp.add(other.get(j));
            j++;
        }
        return temp;
    }

    // Método para imprimir la lista
    public void print() {
        for (T e : list) // Aqui si list es null se lanza NullPointerException
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

        Error3Erroneo<Integer> sll1 = new Error3Erroneo<>(lista1);
        Error3Erroneo<Integer> sll2 = new Error3Erroneo<>(lista2);
        Error3Erroneo<Integer> unionList = sll1.makeUnion(sll2);

        // Por lo mismo que no se inicializo bien puede dar un NullPointerException porque 'list' puede ser null
        unionList.print();
    }
}