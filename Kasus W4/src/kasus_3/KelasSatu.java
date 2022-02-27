package kasus_3;
        
class KelasSatu 
{
    {
        System.out.println(11); //blok inisialisasi bakal dipanggil ketika ada objek yg dibuat dengan class yang didefinisikan
    }

    static  //blok static diprint pertama kali saat class dipanggil sebanyak satu kali
    {
        System.out.println(2);
    }
    public KelasSatu(int i) //constructor akan dijalankan setelah blok static dan inisialisasi dijalankan
    {
        System.out.println(3);
    }
    public KelasSatu() //constructor tanpa parameter akan dijalankan sesuai kondisi saat pemanggilannya
    {
        System.out.println(4);
    }
}