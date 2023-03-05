/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS TUF GAMING
 */
abstract class Animal {
 protected String nama;
    protected int umur;
    
    public Animal(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    
    public abstract void Bersuara();
    
    public void move() {
        System.out.println(nama + " Bergerak");
    }   
}
