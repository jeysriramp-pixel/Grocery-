import java.util.Scanner; 
class InvalidQuantityException extends Exception { 
    public InvalidQuantityException(String message) { 
        super(message); 
    } 
} 
class GroceryBill { 
    private double total = 0; 
 
    public void addItem(String item, double price, int quantity) 
            throws InvalidQuantityException { 
        if (quantity <= 0) { 
            throw new InvalidQuantityException( 
                "Quantity must be greater than 0." 
            ); 
        } 
        double amount = price * quantity; 
        total += amount; 
        System.out.println(item + " - Rs." + amount); 
    } 
 
    public double getTotal() { 
        return total; 
    } 
} 
 
public class GroceryShopBillingSystem { 
    public static void main(String[] args) { 
 
        Scanner sc = new Scanner(System.in); 
        GroceryBill bill = new GroceryBill(); 
 
        System.out.println("===== GROCERY SHOP BILLING SYSTEM ====="); 
 
        while (true) { 
            System.out.println("\n1. Add Item"); 
            System.out.println("2. Generate Bill"); 
            System.out.print("Enter your choice: "); 
            int choice = sc.nextInt(); 
 
            if (choice == 1) { 
                System.out.print("Enter item name: "); 
                String item = sc.next(); 
                System.out.print("Enter price: "); 
                double price = sc.nextDouble(); 
 
                System.out.print("Enter quantity: "); 
                int quantity = sc.nextInt(); 
 
                try { 
                    bill.addItem(item, price, quantity); 
                    System.out.println("Item added successfully."); 
                } catch (InvalidQuantityException e) { 
                    System.out.println("Exception: " + e.getMessage()); 
                } 
 
            } else if (choice == 2) { 
                System.out.println("\n===== FINAL BILL ====="); 
                System.out.println("Total Amount: Rs." + bill.getTotal()); 
                System.out.println("Thank you for shopping!"); 
                break; 
 
            } else { 
                System.out.println("Invalid choice!"); 
            } 
        } 
        sc.close(); 
    } 
} 