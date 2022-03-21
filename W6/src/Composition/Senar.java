package Composition;

/**
 *
 * @author Egi Satria Dharma Yudha W.
 */
public class Senar {
    private String merk;
    private double size;
    private Gitar gitar;
    
    public Senar(String merk, double size, Gitar gitar){
        this.merk = merk;
        this.size = size;
        this.gitar = gitar;
    }
    
    public String getMerk(){
        return merk;
    }
    public double getSize(){
        return size;
    }
    public Gitar getGitar(){
        return gitar;
    }  
}
