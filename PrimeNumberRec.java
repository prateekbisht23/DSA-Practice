public class PrimeNumberRec {
    static boolean isPrime(int num, int aux, int fact){
        if(aux < 2){
            return fact == 0;
        }
        if(num%aux == 0){
            fact += 1;
        }
        return isPrime(num, aux-1, fact);
    }
    public static void main(String[] args) {
        int num = 89;
        System.out.println(isPrime(num, (int)(Math.pow(num, 0.5)), 0));
    }
}

/* 
        int num = 18;
        for(int i = 2; i*i < num-1; i++){
            if(num % i == 0){
                System.out.println("Not a Prime Number");
                return;
            }
        }
        System.out.println("Prime Number"); */