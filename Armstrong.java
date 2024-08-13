public class Armstrong {
    static int count(int num){
        if(num == 0){
            return 0;
        }
        return count(num/10) + 1;
    }
    /* static void armstrong(int num, int aux, int sum, int count){
        if(aux == 0){
            if(num == sum){
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }
            return;
        }
        sum +=  Math.pow(aux%10, count);
        armstrong(num, aux/10, sum, count);
    } */

    static boolean armstrong(int num, int aux, int sum, int count){
        if(aux == 0){
            return num == sum;
        }
        sum +=  Math.pow(aux%10, count);
        return armstrong(num, aux/10, sum, count);

    }


    public static void main(String[] args) {
        int num = 9474, sum = 0;
        System.out.println(armstrong(num, num, sum, count(num)));

    }
}
