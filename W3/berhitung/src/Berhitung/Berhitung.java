package Berhitung;
import java.util.*; 

/**
* author:  Egi Satria Dharma Yudha Wicaksana
* version:  1.0
* since 2022-02-11
*/
public class Berhitung{
        //Scanner Baru
        static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        //Kamus Data
        int A, B, hasil;
        char operator;

        //penginputan
        System.out.println("masukkan Inputan");
        A = keyboard.nextInt();
        operator = keyboard.next().charAt(0); //char At : untuk memasukan inputan ke variabel tipe data char
        B = keyboard.nextInt();
        
        //pengecekan operator yang digunakan berdasarkan input user dan print hasil
        if((A>=1 && A<=1000)&&(B>=1 && B<=1000)){
            switch(operator){
                case '+' : hasil = A + B;
                System.out.println("hasil = " +hasil); break;
                case '-' : hasil = A - B;
                System.out.println("hasil = " +hasil); break;
                case '*' : hasil = A * B;
                System.out.println("hasil = " +hasil); break;
                case '/' : hasil = A / B;
                System.out.println("hasil = " +hasil); break;
                case '%' : hasil = A % B;
                System.out.println("hasil = " +hasil); break;
                default : System.out.println("WRONG OPERATOR INPUT!!! ");
            }
        }   
        else if (B == 0){
            System.out.println("hasil tak terdefinisi");
        } 
        else{ 
            System.out.println("Your input number is WRONG!!!");
        }
    }
}
        
   