class GroceryShop { 
    private final Object stockLock = new Object(); 
    private final Object billingLock = new Object(); 
 
    public void generateBill(String customer, int items) { 
        synchronized (stockLock) { 
            System.out.println(customer + " is checking stock for "  
                               + items + " items."); 
            synchronized (billingLock) { 
                System.out.println(customer + " is generating the bill."); 
                System.out.println(customer + " bill generated successfully."); 
            } 
            System.out.println(customer + " completed the purchase."); 
            System.out.println(); 
        } 
    } 
} 
class Customer extends Thread { 
    private GroceryShop shop; 
    private String customerName; 
    private int items; 
    Customer(GroceryShop shop, String customerName, int items) { 
        this.shop = shop; 
        this.customerName = customerName; 
        this.items = items; 
    } 
    public void run() { 
        shop.generateBill(customerName, items); 
    } 
} 
public class Main { 
    public static void main(String[] args) { 
        GroceryShop shop = new GroceryShop(); 
        Customer c1 = new Customer(shop, "Customer 1", 5); 
        Customer c2 = new Customer(shop, "Customer 2", 3); 
        Customer c3 = new Customer(shop, "Customer 3", 7); 
 
        c1.start(); 
        c2.start(); 
        c3.start(); 
    } 
} 