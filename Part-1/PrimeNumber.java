public class PrimeNumber {
    public static void main(String[] args) {
        int num = 18;
        for(int i = 2; i*i < num-1; i++){
            if(num % i == 0){
                System.out.println("Not a Prime Number");
                return;
            }
        }
        System.out.println("Prime Number");
    }
}
