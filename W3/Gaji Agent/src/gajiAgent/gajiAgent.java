package gajiAgent;
import java.util.*; 

/**
* author:  Egi Satria Dharma Yudha Wicaksana
* version:  1.0
* since 2022-02-11
*/

public class gajiAgent {
	static Scanner keyboard = new Scanner (System.in);
    public static void main(String[] args) {
        
        // Kamus Data
        double bonus, denda, gaji;
        int banyakItem;
        
        //Input
        System.out.println("masukkan jumlah item : ");
        banyakItem = keyboard.nextInt();
        
        //perhitungan gaji
        if(banyakItem >= 40){
            bonus = (25*0.01)*(banyakItem*50000);
            gaji = 500000 + bonus;
        }else if(banyakItem > 80){
            bonus = (35*0.01)*(banyakItem*50000);
            gaji = 500000 + bonus;
        }else if(banyakItem < 15){
            banyakItem = 15 - banyakItem;
            denda = (15*0.01)*(banyakItem*50000);
            gaji = 500000 - denda;
        }else{
            bonus = (10*0.01)*(banyakItem*50000);
            gaji = 500000 + bonus;    
        }
        // int digunakan untuk mengubah tipe data gaji(double) ke integer
        System.out.println("maka gajinya adalah : Rp." +(int)gaji); 
    }
}