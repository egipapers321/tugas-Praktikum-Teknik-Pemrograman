package kasus_2;

public class Item {
    private String name;
    private Item() {
        this.name = "Ipin"; //this ditambakan mengacu kepada variable yang dimiliki class Item
    }
    public Item(String name) {
     this.name = "Ipin"; // variable this.name yang diisi string Ipin
     System.out.println(this.name);//print variable this.name
}
}