package Aggregation;

/**
 *
 * @author Egi Satria
 */
public class people {
   private String peopleName;
   private int age;
    
   //constructor
    people (String peopleName, int age){
        this.peopleName = peopleName;
        this.age = age;
    }
    //Getter
    public String getNama(){
    return peopleName;
    }
    
    public int getAge(){
        return age;
    }   
}

