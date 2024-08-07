public class Flip {

    static int countDigits(int num){
        int digits = 0;
        while(num != 0){
            digits++;
            num /= 10;
        }
        return digits;
    }
    public static void main(String[] args) {
        int num = 32145;
        int pos = 1;
        int result = 0;
        int digits = countDigits(num);
        while(num != 0){
            int digits += 1;
        }

        System.out.println("Result");
    }
}
