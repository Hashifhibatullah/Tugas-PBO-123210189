/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS TUF GAMING
 */
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        
        Dog dog1 = new Dog("Jamal", 3);
        Cat cat1 = new Cat("Bambang", 2);
        
        
        animals.add(dog1);
        animals.add(cat1);
        
        
        for (Animal animal : animals) {
            animal.move();
            animal.Bersuara();
            
            if (animal instanceof Mammal) {
                Mammal mammal = (Mammal) animal;
                mammal.Makan();
                mammal.Tidur();
                mammal.groom();
            }
        }
    }
}
