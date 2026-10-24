
import java.util.Scanner;

// Base Class
class Welcome {
    void welcome() {
        System.out.println("Welcome to Grocery Billing System");
    }
}

// Child Class
class Input extends Welcome {
    String itemName;
    int quantity;
    double price;
    double discount;

    void getInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Item Name: ");
        itemName = sc.nextLine();

        System.out.print("Enter Quantity: ");
        quantity = sc.nextInt();

        System.out.print("Enter Price: ");
        price = sc.nextDouble();

        System.out.print("Enter Discount: ");
        discount = sc.nextDouble();
    }
}

// Grandchild Class
class Calculate extends Input {
    void displayBill() {
        double total = quantity * price;

        System.out.println("\n--- Grocery Bill ---");
        System.out.println("Item Name: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Total Bill: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Final Bill: " + (total - discount));
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Calculate c = new Calculate();

        c.welcome();
        c.getInput();
        c.displayBill();
    }
}
