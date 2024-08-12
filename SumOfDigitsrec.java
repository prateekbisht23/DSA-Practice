public class SumOfDigitsrec {
    static int sumOfDigits(int num){
        if(num == 0){
            return 0;
        }
        return (num%10) + sumOfDigits(num/10);
    }

    /* static void sumOfDigits(int num, int sum){
        if(num == 0){
            System.out.println(sum);
            return;
        }
        sumOfDigits(num/10, sum+num%10);
    } */
    public static void main(String[] args) {
        int num = 12345;
        System.out.println(sumOfDigits(num));
    }   
}