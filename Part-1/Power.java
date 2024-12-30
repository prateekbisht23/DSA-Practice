public class Power {
    static int power(int num, int pow){
        if(pow == 0){
            return 1;
        }
        return num * power(num , pow-1);
    }

    /* static void power(int num, int pow, int result){
        if(pow == 0){
            System.out.println(result);
            return;
        }
        result *= num;
        power(num, pow-1, result);
    } */
    static int power(int num, int pow, int result){
        if(pow == 0){
            return result;
        }
        result *= num;
        return power(num, pow-1, result);
    }


    public static void main(String[] args) {
        int num = 2, p = 5, r = 1;
        power(num, p, r);
        System.out.println(power(num, p));
    }
}
