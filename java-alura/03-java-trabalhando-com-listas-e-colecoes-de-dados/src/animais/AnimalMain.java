package animais;

import java.util.ArrayList;

public class AnimalMain {
    public static void main(String[] args) {
    Cachorro cachorro = new Cachorro("Cachorro","Macho", "Labrador", "Grande");
    Animal animal = new Cachorro("Cachorro", "Fêmea", "Beagle", "Médio");
    Animal outroAnimal = new Animal("Gato", "Femea");

    ArrayList<Animal> lista = new ArrayList<>();

    lista.add(cachorro);
    lista.add(animal);
    lista.add(outroAnimal);

    for (Animal elemento : lista) {
        System.out.println(elemento);
        if (elemento instanceof Cachorro cao) {
            System.out.println(cao.fazSom());
        }
    }

    }
}
