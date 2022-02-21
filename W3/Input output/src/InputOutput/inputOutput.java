package inputOutput;
import java.util.*;

/**

* @author:  Egi Satria Dharma Yudha Wicaksana
* @version:  1.0
* @since 2022-02-11
*/

public class inputOutput {
    static Scanner keyboard  = new Scanner(System.in); // make scanner
    public static void main(String[] args) {
        
        String s; //Kamus Data
        int n,k;
        
        System.out.println("Masukan kata");
        s = keyboard.nextLine();//inputan
        
        String[] stringarr = s.split("[@ ? !_ , . ']+");//make array of string untuk memisahkan string berdasarkan format ketentuan
        
        n = stringarr.length;//inisialisasi dengan jumlah token pada stringarr
     
        
        System.out.println("banyak kata = "+n);//Mencetak banyak kata 
       //Mencetak kata secara berurutan
        k = 1;
            for(int i=0; i < n; i++){
            System.out.println("kata " +k + " : "+stringarr[i]);
            k = k +1;
        }
    }
       
}
