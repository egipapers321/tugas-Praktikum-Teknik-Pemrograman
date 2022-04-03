package Task2;

public class Shape {
 private String color;
 private boolean filled;
 
    public Shape(){
     this.color = "green";
     this.filled = true;
    }
    public Shape(String color, boolean filled){
     this.color = color;
     this.filled = filled;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public boolean isFilled() {
        return filled;
    }
 @Override
    public String toString(){
        if(isFilled()){
            return "A shape with color of " + getColor() + " is filled";
        }else{
            return "A shape with color of " + getColor() + " is not filled";
        }
    } 
}