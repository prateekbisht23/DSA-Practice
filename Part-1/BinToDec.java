public class BinToDec {
    public static void main(String[] args) {
        int bin = 1011;
        int dec = 0;
        int i = 0;
        while(bin != 0){
            int digit = bin%10;
            dec += digit * ((int)Math.pow(2,i));
            bin /= 10;
            i++;
        }
        System.out.println(dec);
    }
}
