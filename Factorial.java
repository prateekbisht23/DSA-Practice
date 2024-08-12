public class Factorial {

    static int factorial(int num){
        if(num <= 1){
            return 1;
        }
        return num * factorial(num-1);
    }
    public static void main(String[] args) {
        int num = 4;
        int fact = factorial(num);

        System.out.println(fact);
    }
}
