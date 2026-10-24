class GroceryShop { 
    private boolean itemsReady = false; 
    private int totalBill = 0; 
 
    synchronized void prepareItems() { 
        System.out.println("Shopkeeper is preparing the grocery items..."); 
 
        try { 
            Thread.sleep(2000); 
        } catch (InterruptedException e) { 
            System.out.println("Preparation interrupted."); 
        } 
 
        itemsReady = true; 
        System.out.println("Grocery items are ready."); 
 
        notifyAll(); 
    } 
    synchronized void generateBill(String customer, int amount) { 
        try { 
            while (!itemsReady) { 
                System.out.println(customer + " is waiting for items."); 
                wait(); 
            } 
 
            totalBill = totalBill + amount; 
            System.out.println(customer + "'s bill = Rs." + amount); 
            System.out.println(customer + " completed the payment."); 
 
        } catch (InterruptedException e) { 
            System.out.println(customer + " was interrupted."); 
        } 
    } 
 
    synchronized void displayTotal() { 
        System.out.println("--------------------------------"); 
        System.out.println("Total shop collection = Rs." + totalBill); 
    } 
} 
class Customer extends Thread { 
    private GroceryShop shop; 
    private String customerName; 
    private int billAmount; 
 
    Customer(GroceryShop shop, String customerName, int billAmount) { 
        this.shop = shop; 
        this.customerName = customerName; 
        this.billAmount = billAmount; 
    } 
 
    public void run() { 
        shop.generateBill(customerName, billAmount); 
    } 
} 
class Shopkeeper extends Thread { 
    private GroceryShop shop; 
 
    Shopkeeper(GroceryShop shop) { 
        this.shop = shop; 
    } 
 
    public void run() { 
        shop.prepareItems(); 
    } 
} 
 
public class Main { 
    public static void main(String[] args) { 
 
        GroceryShop shop = new GroceryShop(); 
 
        // Creating customer threads 
        Customer c1 = new Customer(shop, "Customer 1", 450); 
        Customer c2 = new Customer(shop, "Customer 2", 650); 
        Customer c3 = new Customer(shop, "Customer 3", 300); 
 
        // Creating shopkeeper thread 
        Shopkeeper shopkeeper = new Shopkeeper(shop); 
 
        // Starting customer threads 
        c1.start(); 
        c2.start(); 
        c3.start(); 
 
        shopkeeper.start(); 
        try { 
            c1.join(); 
            c2.join(); 
            c3.join(); 
            shopkeeper.join(); 
        } catch (InterruptedException e) { 
            System.out.println("Main thread interrupted."); 
        } 
        shop.displayTotal(); 
    } 
} 