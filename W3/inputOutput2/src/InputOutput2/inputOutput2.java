package inputOutput2;
import java.util.*; 

/**
* author:  Egi Satria Dharma Yudha Wicaksana
* version:  1.0
* since 2022-02-12
*/

public class inputOutput2 {
	static Scanner keyboard = new Scanner(System.in); //membuat scanner
        public static void main(String[] args){
            String huruf;//Kamus Data
            int n,jmlAngka;
            
            System.out.println("banyak inputan : ");// menentukan banyak data yang di input
            jmlAngka = keyboard.nextInt();
            String[] arrword = new String[jmlAngka];//Make array of string and array of int
            int[] arrint = new int[jmlAngka]; 
            System.out.println("masukkan inputan");// menginput data
            for(int i=0; i<jmlAngka; i++){ 
                huruf = keyboard.next();
                arrword[i] =huruf;
                n=keyboard.nextInt();
                arrint[i] = n;
            }
            
            System.out.println("=====================");//Print output
            for(int i=0; i<jmlAngka; i++){
                System.out.format("%-15s%03d%n", arrword[i], arrint[i]);//print output dengan format yang ditentukan
            }
           System.out.println("=====================");
        }
}