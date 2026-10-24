import java.util.Scanner;

class Grocery {
    String itemName;
    int quantity;
    double price;

    Grocery(String itemName, int quantity, double price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    void displayBill() {
        double total = quantity * price;
        System.out.println("Total Bill : " + total);
    }

    void displayBill(double discount) {
        double total = quantity * price;
        System.out.println("Final Bill : " + (total - discount));
    }
}

public class Main3{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Item Name: ");
        String item = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        Grocery g = new Grocery(item, qty, price);

        System.out.print("Enter Discount: ");
        double discount = sc.nextDouble();

        g.displayBill();          
        g.displayBill(discount);  

        sc.close();
    }
}