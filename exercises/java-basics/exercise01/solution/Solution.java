import java.util.ArrayList;
import java.util.Comparator;

public class Solution {
    public static void main(String ...args) {

        // Eine Auflistung der geforderten Tiere erstellen: 
        Animal[] animals = {
            new Animal("Minka", 2, true),
            new Animal("Benita", 12, false),
            new Animal("Sushi", 5, true),
            new Animal("Brutus", 8, true),
            new Animal("Barney", 42, false)
            };

        /* 
            Alternative Definition der Tiere und Auflistung: 
            
            Animal minka = new Animal("Minka", 2, true);
            Animal benita = new Animal("Benita", 12, false);
            Animal sushi = new Animal("Sushi", 5, true);
            Animal brutus = new Animal("Brutus", 8, true);
            Animal barneyTheDinosaur = new Animal("Barney", 42, false);

            Animal[] animals = {minka, benita, sushi, brutus, barneyTheDinosaur};
        
        */

	// Ausgabe aller Haustiere:
	System.out.println("First requested output:");
        for (int i = 0; i < animals.length; i++) {
            if(animals[i].isPet()){
                System.out.println(animals[i].getName());   
            }
        };

	// Ausgabe der Liste in umgekehrter Reihenfolge:
	System.out.println("\nSecond requested output:");
        for (int i = animals.length - 1; i >= 0; i--){
            System.out.println(animals[i].getName());
        };

	// Bonus (Nutzen einer erweiterten und sortierten ArrayList und Nutzen einer eigenen Funktion zur String-Konkatenation aus der Animal Klasse)
	ArrayList<Animal> moreAnimals = new ArrayList<Animal>();

    moreAnimals.add(new Animal("Rikku", 2, true));
    moreAnimals.add(new Animal("Amy", 6, true));
    moreAnimals.add(new Animal("Medusa", 10, false));

	for (int i = 0; i < animals.length; i++) {
        	moreAnimals.add(animals[i]);   
        };

    moreAnimals.sort(Comparator.comparing(Animal::getName));

	System.out.println("\nBonus output:");
	moreAnimals.forEach(animal -> System.out.println(animal.createDescription()));	
    }
}