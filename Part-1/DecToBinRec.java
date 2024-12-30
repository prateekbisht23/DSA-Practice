public class DecToBinRec {
    static String decToBin(int num){
        if(num == 0){
            return "";
        }
        return decToBin(num/2) + num%2;

    }
    static void decToBin(int num, String bin){
        if(num == 0){
            System.out.println(bin);
            return;
        }
        bin = num%2 + bin;
        decToBin(num/2, bin);
    }
    static void main(){
        
    }
    public static void main(String[] args) {
        int num = 23;
        String bin = new String();
        decToBin(num,bin);
        System.out.println(decToBin(num));
    }
}
