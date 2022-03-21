package Composition;

/**
 *
 * @author Egi Satria
 */
public class main {
    public static void main(String[] args) {
        // TODO code application logic here
    //membuat objek dari kelas  gitar
    Gitar gitar = new Gitar("acoustic","APX 600");
    //membuat objek dari kelas senar
    Senar senar = new Senar("Elixir",0.11,gitar);
    
    //menampilkan output
    System.out.println("===== keterangan gitar =====");
    System.out.println("tipe gitar  : " + gitar.getType());
    System.err.println("nama gitar  : " + gitar.getNama());    
    System.out.println("===== keterangan Senar =====");
    System.err.println("merk senar  : " + senar.getMerk());
    System.err.println("senar size  : " + senar.getSize());
    }
    
}
