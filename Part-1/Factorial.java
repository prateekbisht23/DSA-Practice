public class Factorial {

    static int factorial(int num){
        if(num <= 1){
            return 1;
        }
        return num * factorial(num-1);
    }

    static void factorial(int num, int r){
        if(num == 1){
            System.out.println(r);
            return;
        }
        factorial(num-1, num * r);
    }

    public static void main(String[] args) {
        int num = 5, r = 1;
        System.out.println(factorial(num));

        factorial(num, r);

    }
}
