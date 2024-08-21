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
import java.util.Scanner;

public class VendingMachine {

    static void displayItems(HashMap<String, String> items, HashMap<String, Integer> cost, HashMap<String, Integer> stock){
        System.out.println("\nItems available:");
        /* for (int i=1; i<=items.size(); i++) {
            System.out.println(i+": "+items.get(i)+" (₹"+cost.get(i)+") - "+ stock.get(i)+" in stock");
        } */
       /* for (iterable_type iterable_element : iterable) {
        
       } */
       /* for (HashMap.Entry<String, String> entry : items.entrySet()) {
            //System.out.println(entry.getValue());
            System.out.println(entry.getKey()+": "+entry.getValue()+" (₹"+cost.get(entry.getKey())+") - "+ stock.get(entry.getKey())+" in stock");
        } */
        for(String i : items.keySet()){
            System.out.println(i+": "+items.get(i)+" (₹"+cost.get(i)+") - "+ stock.get(i)+" in stock");
        }
    }

    static void calculateBalance(int balance){

        HashMap<Integer,Integer> currency = new HashMap<>();

        currency.put(200, 0);
        currency.put(100, 0);
        currency.put(50, 0);
        currency.put(20, 0);
        currency.put(10, 0);
        currency.put(5, 0);
        currency.put(2, 0);
        currency.put(1, 0);


        while(balance != 0){
            if(balance >= 200){
                currency.put(200, balance/200);
                balance %= 200;
            }
            if(balance >= 100){
                currency.put(100, balance/100);
                balance %= 100;
            }
            if(balance >= 50){
                currency.put(50, balance/50);
                balance %= 50;
            }
            if(balance >= 10){
                currency.put(10, balance/10);
                balance %= 10;
            }
            if(balance >= 5){
                currency.put(5, balance/5);
                balance %= 5;
            }
            if(balance >= 2){
                currency.put(2, balance/2);
                balance %= 2;
            }
            if(balance >= 1){
                currency.put(1, balance/1);
                balance %= 1;
            }
        }


        /* for (HashMap.Entry<Integer, Integer> entry : currency.entrySet()) {
            //System.out.println(entry.getValue());
            if(entry.getValue() != 0){
                System.out.print("₹"+entry.getKey()+"("+entry.getValue()+")  ");
            }
        } */
        for(int i : currency.keySet()){
            if(currency.get(i) != 0){
                System.out.print("₹"+i+"("+currency.get(i)+")  ");
            }
        }

        System.out.println();

    }


    /* static void cashBox(){
        HashMap<Integer,Integer> cash = new HashMap<>();
        cash.put(200, 20);
        cash.put(100, 20);
        cash.put(50, 20);
        cash.put(10, 20);
        cash.put(5, 50);
        cash.put(2, 50);
        cash.put(1, 50);


        for(int i : cash.keySet()){
            while(cash.get(i) != 0){
                
            }
        }
        

    } */



    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

            HashMap<String, String> items = new HashMap<>();
            HashMap<String, Integer> cost = new HashMap<>();
            HashMap<String, Integer> stock = new HashMap<>();

            //HashMap<Integer, Array> all = new HashMap<>();


            //all.put(1, {"Soda",25,11});


            int balance = 0;


            items.put("A1", "Soda");
            items.put("C2", "Chips");
            items.put("D3", "Candy");
            items.put("B4", "Water");
            items.put("E5", "Chocolate");

            cost.put("A1", 25);
            cost.put("C2", 30);
            cost.put("D3", 10);
            cost.put("B4", 20);
            cost.put("E5", 25);

            stock.put("A1", 4);
            stock.put("C2", 3);
            stock.put("D3", 1);
            stock.put("B4", 8);
            stock.put("E5", 5);

        
            while (true) {
                System.out.println("\n\n1. Display Items \t\t\t\t\t\t balance : ₹"+balance);
                System.out.println("2. Insert Money");
                System.out.println("3. Select Item");
                System.out.println("4. Return Change");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> displayItems(items, cost, stock);
                    case 2 -> {
                        System.out.print("\nEnter amount to insert: ₹");
                        int amount = scanner.nextInt();
                        balance += amount;
                    }
                    case 3 -> {
                        displayItems(items, cost, stock);
                        System.out.print("\nEnter item code/s: ");
                        scanner.nextLine();
                        String codes = scanner.nextLine();
                        String [] code = codes.split(" ");
                        for(String i : code){
                            String item = items.get(i);

                            if (item == null) {
                                System.out.println("\n"+ i + " is an Invalid selection!!");
                                continue;
                            }
            
                            if (stock.get(i) <= 0) {
                                System.out.println("\n"+items.get(i)+" is out of stock!!");
                                continue;
                            }
            
                            if (balance >= cost.get(i)) {
                                balance -= cost.get(i);
                                stock.put(i, stock.get(i) - 1);
                                System.out.println("\nDispensing "+items.get(i)+"!!");
                            } else {
                                System.out.println("\nInsufficient balance!! \nPlease insert the required amount for the item!! \nItem price: "+cost.get(i)+", current balance: "+balance);
                            }
                        }
                        System.out.println("\nRemaining balance: ₹"+balance);

                    }
                    case 4 ->{
                        System.out.println("\nReturning change: ");
                        calculateBalance(balance);
                        balance = 0;
                    }
                    case 5 -> {
                        System.out.println("\nReturning change: ");
                        calculateBalance(balance);
                        //balance = 0;
                        System.out.println("\nThank you for using the vending machine.");
                        return;
                    }
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            
            }
        }

        
    }
}
