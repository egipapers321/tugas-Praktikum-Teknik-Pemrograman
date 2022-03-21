package Aggregation;
/**
 * @author Egi Satria
 */
public class pet {
   private String pet;
   private String type;
   private people people;
    
   //constructor
    pet(String pet,String type, people people ){
        this.pet = pet;
        this.type = type;
        this.people = people;
    }
    //Getter
    public String getPet(){
        return pet;
    }
    
    public String getType(){
        return type;
    }
    public people getPeople(){
        return people;
    }
}
