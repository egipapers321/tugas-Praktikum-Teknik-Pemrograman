package Composition;

/**
 *
 * @author Egi Satria D.Y.W
 */
public class Gitar {
    private String type;
    private String nama;
  
    public Gitar(String type, String nama){
        this.type = type;
        this.nama = nama;
    }
    
    public String getType(){
        return type;
    }
    
    public String getNama(){
        return nama;
    }
}
