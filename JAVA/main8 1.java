class GroceryBilling extends Thread { 
    String customerName; 
    double amount; 
    GroceryBilling(String customerName, double amount) { 
        this.customerName = customerName; 
        this.amount = amount; 
    } 
 
    public void run() { 
        System.out.println(customerName + " billing started."); 
        System.out.println("Total Amount: Rs." + amount); 
        System.out.println(customerName + " billing completed."); 
    } 
} 
public class GroceryThread { 
    public static void main(String[] args) { 
        GroceryBilling bill = new GroceryBilling("Muhamad", 1250); 
        bill.start(); 
    } 
}