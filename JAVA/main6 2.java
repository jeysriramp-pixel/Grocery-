import java.util.Scanner;

// Parent class
class Store {

    void storeName() {
        System.out.println("Store Name : Jeeva Super Market");
    }

    // Method to be overridden
    void displayBill() {
        System.out.println("This is the Store Bill");
    }
}

// Child class
class Grocery extends Store {

    String itemName;
    int quantity;
    double price;

    // Constructor
    Grocery(String itemName, int quantity, double price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    // Method Overriding
    @Override
    void displayBill() {

        double total = quantity * price;

        if (total >= 1000) {
            total = total - 100;
            System.out.println("Discount Applied: Rs.100");
        }

        System.out.println("Item Name : " + itemName);
        System.out.println("Quantity  : " + quantity);
        System.out.println("Price     : Rs." + price);
        System.out.println("Final Bill: Rs." + total);
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
        g.displayBill();

        sc.close();
    }
}