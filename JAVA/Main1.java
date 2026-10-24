class Grocery {
    String itemName;
    int quantity;
    double price;

    // Constructor
    Grocery(String itemName, int quantity, double price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    // Method to display the bill
    void displayBill() {
        double total = quantity * price;

        System.out.println("------ Grocery Bill ------");
        System.out.println("Item Name : " + itemName);
        System.out.println("Quantity  : " + quantity);
        System.out.println("Price     : " + price);
        System.out.println("Total Bill: " + total);
        System.out.println();
    }
}

public class Main1 {
    public static void main(String[] args) {

        // Object Creation
        Grocery item1 = new Grocery("Rice", 5, 60);
        item1.displayBill();

        Grocery item2 = new Grocery("Sugar", 2, 45);
        item2.displayBill();
    }
}