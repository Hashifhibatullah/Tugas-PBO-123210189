/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS TUF GAMING
 */
class Dog extends Animal implements Mammal {
    
     public Dog(String name, int age) {
        super(name, age);
    }
    
    @Override
    public void Bersuara() {
        System.out.println(nama + " Bersuara : Guk Gukk!!");
    }
    
    @Override
    public void Makan() {
        System.out.println(nama + " Sedang Makan");
    }
    
    @Override
    public void Tidur() {
        System.out.println(nama + " Sedang Tidur");
    }
    
    @Override
    public void groom() {
        System.out.println(nama + " Sedang Grooming");
    }
}
