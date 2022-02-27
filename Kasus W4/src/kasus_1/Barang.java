package kasus_1;
public class Barang{
    
    //attribute
    private String kode_barang;
    private String nama_barang;
    private int stok;
    
    //constructor
      public Barang(String kode, String nama, int stk){
       this.kode_barang = kode;
       this.nama_barang = nama;
       this.stok = stk;
      }
      
      //accessor
      public String getKode() {
          return this.kode_barang;
      }
      
      //accessor
      public String getNama() {
          return this.nama_barang;
      }
      
      //accessor
      public int getStok() {
          return this.stok;
      }
      
      //mutator
      public void setStok(int stk){
          this.stok += stk;
      }
}