package Association;
import java.util.ArrayList;
import java.util.List;

public class association {
    public static void main(String[] args) {
        // TODO code application logic here
        Creator creator = new Creator();
        creator.setCreatorName("Leonardo Da Vinci");
        
        Painting painting1 = new Painting();
        painting1.setPaintingName("Mona Lisa");
        Painting painting2 = new Painting();
        painting2.setPaintingName("Virtuvian Man");
        
        List<Painting> empList = new ArrayList<Painting>();
        empList.add(painting1);
        empList.add(painting2);
        
        creator.setPainting(empList);
        
        System.out.println(creator.getPainting()+ " merupakan lukisan yang diciptakan oleh " + creator.getCreatorName() );
    }
    
}
