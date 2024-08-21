public class NumberToString {
    static String numbers [] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    static String numberToString(int num){
        if(num == 0){
            return "";
        }

        return numberToString(num/10) + numbers[num%10] + " ";
    }
    public static void main(String[] args) {
        System.out.println(numberToString(12345));
    }
}
