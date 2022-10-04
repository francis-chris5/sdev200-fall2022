/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectexample3;

/**
 *
 * @author franc
 */
public class Gorilla extends Animal implements Noisy{

    public Gorilla() {
    }

    @Override
    public String makeSound() {
        return "grunt-sigh";
    }

    public Gorilla(String name, int age, double weight, Covering covering, boolean checkup) {
        super(name, age, weight, covering, checkup);
    }
    
}
