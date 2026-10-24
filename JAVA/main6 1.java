import java.util.Scanner;

// Abstract class
abstract class Store {

    String itemName;
    int quantity;
    double price;

    // Constructor
    Store(String itemName, int quantity, double price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    // Normal method
    void storeName() {
        System.out.println("Store Name : Jeeva Super Market");
    }

    // Abstract method
    abstract void calculateBill();
}

// Child class
class Grocery extends Store {

    // Constructor
    Grocery(String itemName, int quantity, double price) {
        super(itemName, quantity, price);
    }

    // Implementing abstract method
    void calculateBill() {

        double total = quantity * price;
        double discount = 0;

        if (total >= 1000) {
            discount = 100;
        }

        double finalBill = total - discount;

        System.out.println("\n----- GROCERY BILL -----");
        System.out.println("Item Name : " + itemName);
        System.out.println("Quantity  : " + quantity);
        System.out.println("Price     : Rs." + price);
        System.out.println("Total     : Rs." + total);
        System.out.println("Discount  : Rs." + discount);
        System.out.println("Final Bill: Rs." + finalBill);
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Item Name: ");
        String item = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        // Creating child class object
        Grocery g = new Grocery(item, qty, price);

        g.storeName();
        g.calculateBill();

        sc.close();
    }
}