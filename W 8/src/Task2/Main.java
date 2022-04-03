package Task2;

public class Main{
    public static void main(String[] args) {
        // TODO code application logic here
        Shape a = new Shape("black",false);
        System.out.println(a);
        
        Circle b = new Circle();
        System.out.println(b);
        
        Rectangle c = new Rectangle(20,30);
        System.out.println(c);
        
        Square d = new Square (10, "red" , false);
        System.out.println(d);
        d.setSide(20);
        System.out.println(d);
    }  
}