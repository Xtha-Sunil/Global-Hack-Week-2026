import java.util.*;

class Pet {
    private String name, type;
    private int age;
    private float hungerLevel, happinessLevel;

    public Pet(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.hungerLevel = 50.0f;
        this.happinessLevel = 50.0f;
    }
    public void play(){
        happinessLevel = Math.min(100.0f, happinessLevel + 10.0f);
        hungerLevel = Math.max(0.0f, hungerLevel - 5.0f);
        System.out.println(name + " is playing! Hunger: " + hungerLevel + ", Happiness: " + happinessLevel);
    }
    public void feed(){
        hungerLevel = Math.min(100.0f, hungerLevel + 15.0f);
        happinessLevel = Math.max(0.0f, happinessLevel - 2.0f);
        System.out.println(name + " is eating! Hunger: " + hungerLevel + ", Happiness: " + happinessLevel);
    }
    public void getStatus(){
        System.out.println("\n==============================");
        System.out.println("Pet Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Type: " + type);
        System.out.println("Hunger Level: " + hungerLevel);
        System.out.println("Happiness Level: " + happinessLevel);
        System.out.println("\n==============================");
    }

}

public class Main {
    public static void main(String[] args) {
        Pet garfield = new Pet("Garfield", 3, "Cat");
        Pet rocky = new Pet("Rocky", 5, "Dog");

        garfield.getStatus();
        garfield.play();
        garfield.feed();
        garfield.feed();
        garfield.play();
        garfield.getStatus();

        rocky.getStatus();
        rocky.feed();
        rocky.play();
        rocky.play();
        rocky.getStatus();
    }
}