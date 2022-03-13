package Restaurant;

/**
 *
 * @author Egi Satria
 * NIM : 211524040
 */
public class RestaurantMain {
    public static void main(String[] args) {
        System.out.println("\t Resto Mama");
        System.out.println("===========================");
        System.out.println("MENU");
        System.out.println("===========================");
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);
        menu.tampilMenuMakanan();
        System.out.println("===========================");

    
        System.out.println("\npesanan");
        System.out.println("=========");
        System.out.println("Bala-Bala \t:5 " );
        System.out.println("Gehu \t\t:3 " );
        System.out.println("Tahu \t\t:6 " );
        System.out.println("Molen \t\t:12 " );
        
        System.out.println("\n===========================");
        System.out.println("Sisa menu setelah dipesan");
        System.out.println("===========================");
        menu.pemesanan("Bala-Bala",5);
        menu.pemesanan("Gehu", 3);
        menu.pemesanan("Molen", 12);
        menu.pemesanan("Tahu", 6);
        menu.tampilMenuMakanan2();
    }
}
