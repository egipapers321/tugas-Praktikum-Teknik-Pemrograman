package Task2;

public class Circle extends Shape{
    private double radius;
 
    public Circle() {
        super();
        this.radius = 1.0;
    }
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    public Circle( double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return Math.PI*2*getRadius();
    }
    @Override
    public String toString(){
        return "A circle with radius " + getRadius() + " , which is subclass of " + super.toString();
    }
}
