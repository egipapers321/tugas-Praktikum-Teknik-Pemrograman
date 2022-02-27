package kasus_3;

class KelasDua
{
    {
        System.out.println(5); //tidak tampil di output karena tidak ada pembuatan objek dengan class KelasDua
    }
    
    public static void main(String[] args)
    {
        System.out.println(6);
        KelasSatu satu = new KelasSatu(); //memanggil semua atribut pada KelasSatu
        KelasSatu dua = new KelasSatu(10);//Pemanggilan parameter agar menggunakan constructor int i
    }
}