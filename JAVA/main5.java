import java.util.Scanner;

// Parent Class
class Welcome {
    void welcome() {
        System.out.println("===== Welcome to Grocery Billing System =====");
    }
}

// Child Class
class Grocery extends Welcome {
    String itemName;
    int quantity;
    double price;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Item Name: ");
        itemName = sc.nextLine();

        System.out.print("Enter Quantity: ");
        quantity = sc.nextInt();

        System.out.print("Enter Price: ");
        price = sc.nextDouble();

        System.out.print("Enter Discount: ");
        double discount = sc.nextDouble();

        display();
        display(discount);

        sc.close();
    }

    void display() {
        double total = quantity * price;
        System.out.println("\nTotal Bill : " + total);
    }

    void display(double discount) {
        double total = quantity * price;
        System.out.println("Final Bill after Discount : " + (total - discount));
    }
}

public class main5 {
    public static void main(String[] args) {
        Grocery g = new Grocery();

        g.welcome(); // Inherited method
        g.input();   // Input and display
    }
}