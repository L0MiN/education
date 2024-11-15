// Definition eines Tieres: 

public class Animal {
    private String name;
    private int age;
    private boolean isPet;

    public Animal(String name, int age, boolean isPet){
        this.name = name;
        this.age = age;
        this.isPet = isPet;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isPet() {
        return this.isPet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    // Funktion zur Ausgabe einer Beschreibung des Tiers (durch String-Konkatenation):
    public String createDescription(){
    	return "Name: " + this.name + ", Alter: " + this.age + ", Haustier: " + (this.isPet ? "Ja" : "Nein");
    }
}