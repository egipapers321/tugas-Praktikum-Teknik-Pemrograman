package Task2;

public class Rectangle extends Shape{
    private double widht;
    private double length;
    
    public Rectangle(){
        super();
        this.widht = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double widht, double length) {
        super();
        this.widht = widht;
        this.length = length;
    }

    public Rectangle(double widht, double length, String color, boolean filled) {
        super(color, filled);
        this.widht = widht;
        this.length = length;
    }

    public double getWidht() {
        return widht;
    }

    public double getLength() {
        return length;
    }

    public void setWidht(double widht) {
        this.widht = widht;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    public double getArea(){
        return getLength()*getWidht();
    }
    
    public double getPerimeter(){
       return 2*(getLength()+getWidht()); 
    }

    @Override
    public String toString(){
        return "A Rectangle with widht = " + getWidht() + " and length = "
                + getLength() + ", which is subclass of"
                + super.toString();
    }   
}
