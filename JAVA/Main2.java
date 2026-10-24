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

        System.out.println("------ Grocery Bill ------");
        System.out.println("Item Name : " + itemName);
        System.out.println("Quantity  : " + quantity);
        System.out.println("Price     : " + price);
        System.out.println("Total Bill: " + total);
    }

    void displayBill(double discount) {
        double total = quantity * price;
        double finalBill = total - discount;

        System.out.println("------ Grocery Bill with Discount ------");
        System.out.println("Item Name : " + itemName);
        System.out.println("Quantity  : " + quantity);
        System.out.println("Price     : " + price);
        System.out.println("Discount  : " + discount);
        System.out.println("Final Bill: " + finalBill);
    }
}

public class Main2 {
    public static void main(String[] args) {

        Grocery item1 = new Grocery("Rice", 5, 60);
        item1.displayBill();

        System.out.println();

        Grocery item2 = new Grocery("Sugar", 2, 45);
        item2.displayBill(10); 
    }
}