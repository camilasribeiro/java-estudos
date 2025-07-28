package listas;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        ArrayList<String> listaString = new ArrayList<>();
        listaString.add("Java");
        listaString.add("Python");
        listaString.add("C++");

        System.out.println("Lista de Strings: ");
        for (String elemento : listaString) {
            System.out.println(elemento);
        }

        Collections.sort(listaString);
        System.out.println("\nLista de Strings ordenada: ");
        for (String elemento : listaString) {
            System.out.println(elemento);
        }

        ArrayList<Integer> listaInteiros = new ArrayList<>();
        listaInteiros.add(5);
        listaInteiros.add(15);
        listaInteiros.add(8);

        System.out.println("\nLista de inteiros:");
        for (int elemento : listaInteiros) {
            System.out.println(elemento);
        }

        Collections.sort(listaInteiros);
        System.out.println("\nLista de inteiros ordenada:");
        for (int elemento : listaInteiros) {
            System.out.println(elemento);
        }

        List<String> listaArrayList = new ArrayList<>();
        listaArrayList.add("Elemento 1");
        listaArrayList.add("Elemento 2");
        listaArrayList.add("Elemento 3");

        List<String> listaLinkedList = new LinkedList<>();
        listaLinkedList.add("Elemento A");
        listaLinkedList.add("Elemento B");
        listaLinkedList.add("Elemento C");

        System.out.println("\nArrayList: " + listaArrayList);
        System.out.println("\nLinkedList: " + listaLinkedList);

        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("\nArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("\nLinkedList: " + listaPolimorfica);
    }
}