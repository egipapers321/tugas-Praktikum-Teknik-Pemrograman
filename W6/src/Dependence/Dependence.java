/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Dependence;

/**
 *
 * @author Egi Satria
 */
public class Dependence {
    public static void main(String[] args) {
        // TODO code application logic here
        Person person = new Person ("Egi");
        Motor motor = new Motor ("vario", "matic", "Merah");
        person.print(motor);
        Person person2 = new Person("Ferdy");
        Motor motor2 = new Motor("Rx King", "kupling", "Hitam");
        person2.print(motor2);
        person2.jualMotor(motor2);
        System.out.println();
    }
    
}
//