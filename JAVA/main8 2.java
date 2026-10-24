class GroceryBilling implements Runnable { 
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
class Main { 
    public static void main(String[] args) { 
        GroceryBilling bill = new GroceryBilling("Muhamad", 1250); 
        Thread t = new Thread(bill); 
        t.start(); 
    } 
}