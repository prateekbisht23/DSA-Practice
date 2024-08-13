/* import java.util.HashMap;
import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            int ch, amt;

            HashMap<Integer, Integer> map = new HashMap<>();

            map.put(1, 20);
            map.put(2, 30);
            map.put(3, 15);
            map.put(4, 50);
            map.put(5, 25);
            map.put(6, 30);

            while (true) { 

                System.out.println("1. Sprite -  ₹20");    
                System.out.println("2. Coca Cola - ₹ 30");    
                System.out.println("3. Fanta - ₹ 15");    
                System.out.println("4. Pepsi - ₹ 50");    
                System.out.println("5. Maaza - ₹ 25");    
                System.out.println("6. Limca - ₹ 30");
                System.out.print("> ");
                ch = sc.nextInt();
                System.out.print("Enter Money > ");
                amt = sc.nextInt();

                System.out.println(amt - map.get(ch));
            }
        }

               

    }
} */


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VendingMachine {

    private Map<String, Item> inventory = new HashMap<>();
    private double balance = 0.0;

    public VendingMachine() {
        // Initialize with some items
        inventory.put("A1", new Item("Soda", 1.25, 10));
        inventory.put("B1", new Item("Chips", 1.00, 5));
        inventory.put("C1", new Item("Candy", 0.75, 20));
    }

    public void displayItems() {
        System.out.println("Items available:");
        for (Map.Entry<String, Item> entry : inventory.entrySet()) {
            String code = entry.getKey();
            Item item = entry.getValue();
            System.out.printf("%s: %s ($%.2f) - %d in stock\n", code, item.getName(), item.getPrice(), item.getQuantity());
        }
    }

    public void insertMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("You inserted $%.2f. Current balance: $%.2f\n", amount, balance);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void selectItem(String code) {
        Item item = inventory.get(code);
        if (item == null) {
            System.out.println("Invalid selection.");
            return;
        }

        if (item.getQuantity() <= 0) {
            System.out.println("Item out of stock.");
            return;
        }

        if (balance >= item.getPrice()) {
            balance -= item.getPrice();
            item.decreaseQuantity();
            System.out.printf("Dispensing %s. Remaining balance: $%.2f\n", item.getName(), balance);
        } else {
            System.out.printf("Insufficient balance. Please insert more money. Item price: $%.2f, current balance: $%.2f\n", item.getPrice(), balance);
        }
    }

    public void returnChange() {
        System.out.printf("Returning change: $%.2f\n", balance);
        balance = 0;
    }

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Display Items");
            System.out.println("2. Insert Money");
            System.out.println("3. Select Item");
            System.out.println("4. Return Change");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    vendingMachine.displayItems();
                    break;
                case 2:
                    System.out.print("Enter amount to insert: ");
                    double amount = scanner.nextDouble();
                    vendingMachine.insertMoney(amount);
                    break;
                case 3:
                    System.out.print("Enter item code: ");
                    String code = scanner.next();
                    vendingMachine.selectItem(code);
                    break;
                case 4:
                    vendingMachine.returnChange();
                    break;
                case 5:
                    vendingMachine.returnChange();
                    System.out.println("Thank you for using the vending machine.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void decreaseQuantity() {
        if (quantity > 0) {
            quantity--;
        }
    }
}
