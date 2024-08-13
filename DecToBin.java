public class DecToBin {
    public static void main(String[] args) {
        int dec = 13;
        String bin = new String();
        int tem = dec;
        while(tem != 0){
            int r = tem % 2;
            bin = r + bin;
            tem /= 2;
        }

        System.out.println("Number in Binary is - "+bin);
    }
}
