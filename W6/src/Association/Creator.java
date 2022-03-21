package Association;
import java.util.List;

public class Creator {
    //Attribute
    private String creatorName;
    List <Painting> painting;

    //Getter and Setter
    public String getCreatorName() {
        return creatorName;
    }
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }
    public List<Painting> getPainting() {
        return painting;
    }
    public void setPainting(List<Painting> painting) {
        this.painting = painting;
    }
    //Method
    public void setCreator(List<Painting> painting){
        this.painting = painting;
    }
 }
    
