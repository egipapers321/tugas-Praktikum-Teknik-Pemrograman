/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum7_1;

public class Cat extends Animal{
	public void sound() {
		System.out.println("Meow");
	}
	public static void main(String args[]) {
		Animal obj = new Cat();
		obj.sound();
	}
}
