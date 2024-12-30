public class SumOfDigits {
    public static void main(String[] args) {
        int num = 123, sum = 0;
        /* for(int i=0; i<3; i++){
            sum += num%10;
            num /= 10;
        } */

        while(num != 0){
            sum += num%10;
            num /= 10;
        }

        /* do { 
            sum += num%10;
            num /= 10;2
        } while (num != 0); */



        System.out.println(sum);
    }
}
