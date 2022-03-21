package Association;
/**
 * @author Egi Satria 
 */
public class Painting {
    //Attribute
    private String paintingName;
    
    //Getter and Setter

    public String getPaintingName() {
        return paintingName;
    }

    public void setPaintingName(String paintingName) {
        this.paintingName = paintingName;
    }
    //toString method
    @Override
    public String toString(){
        return paintingName;
    } 
}
