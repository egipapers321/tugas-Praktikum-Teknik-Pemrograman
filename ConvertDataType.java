package dataType;
/**
 <p>
 *author   : Egi Satria 
 <p>
 *since    : 2022-02-11
 <p>
 */
class ConvertDataType{
    static short methodOne(long l){
        int i = (int) l;
        return (short)i;
    }
 
 public static void main(String[] args){
    double d = 10.25;
    System.out.println("Nilai d = " + d );
    float f = (float) d;
    byte b = (byte) methodOne((long) f);
    System.out.println("hasil = " + b);
 }
}
