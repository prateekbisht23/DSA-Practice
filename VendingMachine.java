import java.util.HashMap;
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
}
