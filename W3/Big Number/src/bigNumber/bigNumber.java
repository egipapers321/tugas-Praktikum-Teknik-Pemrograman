package bigNumber;
import java.util.*;
import java.math.BigInteger;//untuk membuat tipe data BigInteger

/**
* author:  Egi Satria Dharma Yudha Wicaksana
* version:  1.0
* since 2022-02-11
*/

public class bigNumber {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        //membuat variabel dengan tipe data BigInteger dan memasukan input angka
        System.out.println("input angka pertama : ");
        
        BigInteger a = keyboard.nextBigInteger();
        
        System.out.println("input angka kedua : ");
        
        BigInteger b = keyboard.nextBigInteger();
       
        BigInteger p = a.add(b);//menginisialisasi p sebagai hasil dari a + b
        BigInteger q = a.multiply(b);//menginisialisasi q sebagai hasil dari a * b
        
        //print nilai p dan q
        System.out.println("hasil p = "+p); 
        System.out.println("hasil q = "+q);
        System.out.println("p = angka pertama + angka ke 2");
         System.out.println("p = angka pertama x angka ke 2");
    }
}