/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dependence;

/**
 *
 * @author A455LF-WIN10
 */
public class Person {
    private String nama;
    
    Person(String nama){
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void jualMotor(Motor m){
        m.jualMotor();
        System.out.println("oleh " + getNama());
    }
     public void display(Motor m){
        System.out.println("Motor " + getNama());
        System.out.println("Nama : " + m.getNama());
        System.out.println("Warna : " + m.getWarna());
        System.out.println("Jenis : " + m.getJenis());
        System.out.println();
    }
}
