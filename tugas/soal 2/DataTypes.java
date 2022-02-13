package datatypes;
import java.util.Scanner;

/**
 <p>
 * The data type is a value in the form of a constant 
 * or in the form of a variable, operator.Constant value is a fixed value, and variable value can change.
 <p>
 * author   : Egi Satria 
 <p>
 * since    : 2022-02-11
 <p>
 */

public class DataTypes {
         // membuat scanner
    static Scanner keyboard  = new Scanner(System.in);

    public static void main(String[] args) {
       
        // deklarasi variabel
        int jmlAngka;
        
        System.out.println("masukkan banyak angka yang diinput");
        // input
        jmlAngka = keyboard.nextInt();
        
        // deklarasi variabel untuk menampung angka
        String[] angka = new String [jmlAngka];
        
        System.out.println("masukkan angka");
        for (int i = 0; i < jmlAngka; i++) {
           
            angka[i] = keyboard.next();
        }
        System.out.println( "\n output");
        for (int i = 0; i < jmlAngka; i++){
            long longMin = -9223372036854775808L;
            long longMax = 9223372036854775807L;
            try{
                long inputan = Long.parseLong(angka[i]);
                System.out.println(inputan + "can be fitted in:");
                if(inputan >= longMin && inputan <= longMax){
                    System.out.println("long");
                    if(inputan >= -2147483648 && inputan <= 2147483647){
                         System.out.println("int");
                        if(inputan >= -32768 && inputan <= 32767){
                            System.out.println("short");
                        }
                    }
                }
                // ini bisa masuk long
            }catch(NumberFormatException d){
                //kondisi input tidak bisa masuk mana pun
                System.out.println(angka[i] + "can't be fitted anywhere");
                }
            System.out.println("\n");
        }
 
    }
   
}
