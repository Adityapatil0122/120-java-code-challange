import java.util.Scanner;
public class Shoopingcart {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        String item ;
        double price;
        int quantity;
        double total;

        System.out.print("Enter what do you want to buy: ");
        item = sc.nextLine();
        System.out.print("Enter the no of items you wanna buy: ");
        quantity = sc.nextInt();
        System.out.print("Enter price of items: ");
        price = sc.nextDouble();

        total = quantity * price ;
        System.out.print("You have bought "+quantity+" " +item+ "/s" +" of total " +total+ "$" );

                sc.close();
    }
}
