
import java.util.Scanner;

class Welcome {
    void welcome() {
        System.out.println("Welcome to Grocery Billing System");
    }
}

class Grocery extends Welcome {
    String itemName;
    int quantity;
    double price;

    void getInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Item Name: ");
        itemName = sc.nextLine();

        System.out.print("Enter Quantity: ");
        quantity = sc.nextInt();

        System.out.print("Enter Price: ");
        price = sc.nextDouble();
    }

    double calculateTotal() {
        return quantity * price;
    }
}

class Discount extends Welcome {
    void showDiscount(double total) {
        double discount = total * 0.10;
        double finalBill = total - discount;

        System.out.println("Discount (10%): " + discount);
        System.out.println("Final Bill: " + finalBill);
    }
}

public class Main3 {
    public static void main(String[] args) {
        Grocery g = new Grocery();
        Discount d = new Discount();

        g.welcome();
        g.getInput();

        double total = g.calculateTotal();

        System.out.println("\nTotal Bill: " + total);

        d.welcome();
        d.showDiscount(total);
    }
}
