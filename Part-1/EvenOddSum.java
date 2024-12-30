public class EvenOddSum {
    public static void main(String[] args) {
        int num = 123456;
        int evenSum = 0, oddSum = 0;

        while(num != 0){
            oddSum += num % 10;
            num /= 10;
            evenSum += num % 10;
            num /= 10;
        }

        System.out.println("Even places sum : " + evenSum);
        System.out.println("Odd places sum : " + oddSum);
    }
}
