package Aggregation;

/**
 *
 * @author Egi Satria Dharma Yudha 
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
         //membuat objek dari kelas people
        people people = new people ("Dani",24);
         //membuat objek dari kelas  pet
        pet pet = new pet ("Cat","Persia",people);
        
        //menampilkan output
        System.out.println("======= People details =======");
        System.out.println("People Name : " + people.getNama());
        System.out.println("Age         : " + people.getAge());
        System.out.println("===== Hewan Details =====");
        System.out.println("Pet         : " + pet.getPet());
        System.out.println("Pet Type    : " + pet.getType());
    }
    
}
