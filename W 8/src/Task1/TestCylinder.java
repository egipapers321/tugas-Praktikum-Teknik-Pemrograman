package Task1;

public class TestCylinder { // save as "TestCylinder.java"
    public static void main (String[] args) {
    // Declare and allocate a new instance of cylinder
    // with default color, radius, and height
        Cylinder cy = new Cylinder();
        System.out.println(cy.toString());
        System.out.println("Cylinder:" + " radius=" + cy.getRadius() 
                + " height=" + cy.getHeight() + " base area=" 
                + cy.getArea() + " volume=" + cy.getVolume());

    // Declare and allocate a new instance of cylinder
    // specifying height, with default color and radius
        Cylinder cy2 = new Cylinder(10.0);
        System.out.println("Cylinder:" + " radius=" + cy2.getRadius() 
                + " height=" + cy2.getHeight() + " base area=" 
                + cy2.getArea() + " volume=" + cy2.getVolume());

    // Declare and allocate a new instance of cylinder
    // specifying radius and height, with default color
        Cylinder cy3 = new Cylinder(2.0, 10.0);
        System.out.println("Cylinder:" + " radius=" + cy3.getRadius() 
                + " height=" + cy3.getHeight() + " base area=" 
                + cy3.getArea() + " volume=" + cy3.getVolume());
 }
}