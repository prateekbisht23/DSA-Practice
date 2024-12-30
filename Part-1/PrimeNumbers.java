import java.util.Scanner;

public class PrimeNumbers {
    static boolean isPrime(int num, int aux, int fact){
        if(aux < 2){
            return fact == 0;
        }
        if(num%aux == 0){
            fact += 1;
        }
        return isPrime(num, aux-1, fact);
    }

    static void allPrimes(int num){
        if(num == 0){
            return;
        }
        allPrimes(num - 1);
        
        if(isPrime(num, (int)(Math.pow(num, 0.5)), 0) == true){
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Enter a number : ");
        num = sc.nextInt();

        System.out.print("Prime numbers from 1 to "+num+" are : ");
        allPrimes(num);

        sc.close();
    }
}
