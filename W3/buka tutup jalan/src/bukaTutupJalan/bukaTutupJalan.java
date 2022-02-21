package bukaTutupJalan;
import java.util.*;

/**
* author: Egi Satria Dharma Yudha Wicaksana
* version:  1.0
* since 2022-02-11
*/
public class bukaTutupJalan {
	static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args){
        
        //membuat array int
        int[] array = new int[4];
       
        //Input
         System.out.println("Masukkan angka");
        for(int i=0; i<4; i++ ){
            array[i] = keyboard.nextInt();
        }

        //replaceAll() : untuk menghapus karakter "[", ",", dan "]" dari output toString() dan mengubah array jadi string
        String str = Arrays.toString(array).replaceAll("\\[|\\]|,|\\s", "");
        
        //mengubah string ke tipe data long
        long angka = Long.parseLong(str);
        
        /*pengecekan kondisi apabila gabungan angka dikurangi 999999 lalu mod 5 adalah 0
        Maka output "berhenti" dan selain itu output "jalan" */
        if((angka-999999)%5==0){
            System.out.println("berhenti");
        }else {
            System.out.println("jalan");
        }
    }
}