package titulos;

import java.util.ArrayList;
import java.util.Collections;

public class TituloMain {
    public static void main(String[] args) {
        Titulo titulo1 = new Titulo("Camila");
        Titulo titulo2 = new Titulo("Amanda");
        Titulo titulo3 = new Titulo("Beatriz");

        ArrayList<Titulo> listaDeTitulos = new ArrayList<>();
        listaDeTitulos.add(titulo1);
        listaDeTitulos.add(titulo2);
        listaDeTitulos.add(titulo3);

        System.out.println("Lista de títulos: ");
        for (Titulo elemento : listaDeTitulos) {
            System.out.println(elemento);
        }

        Collections.sort(listaDeTitulos);
        System.out.println("\nLista de títulos ordenada: ");
        for (Titulo elemento : listaDeTitulos) {
            System.out.println(elemento);
        }
    }
}