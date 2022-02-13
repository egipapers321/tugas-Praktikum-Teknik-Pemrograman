package strings;

/**
 <p>
 <p>
 * author   : Egi Satria 
 <p>
 * since    : 2022-02-13
 <p>
 */
import java.util.Scanner;

public class main{
    static Scanner keyboard = new Scanner(System.in);
    public static void main (String[] args){
	
        String a,b,output; // deklarasi
	
        a = keyboard.next ();
        b = keyboard.next ();
	
        System.out.println("jumlah hurufhe = "+(a.length() + b.length()));
	
        if(a.compareTo(b) > 0){
          System.out.println("Yes");
        }
        else if(b.compareTo(a) > 0) {
           System.out.println("No");
        } else{
           System.out.println("A is equal to B");
        }
        // mengubah huruf depan
      output = a.substring(0,1).toUpperCase() + a.substring(1) + " " + b.substring(0,1).toUpperCase() + b.substring(1);
      System.out.println("output= " + output);
    }
}
