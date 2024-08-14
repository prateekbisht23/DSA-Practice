public class PrintTable {
    static String printTable(int num){
        return helper(num, 10);
    }
    static String helper(int num, int count){
        if(count == 0){
            return "";
        }
        return helper(num, count-1) + num + " * "+count+" = "+count*num+"\n"; 
    }
    public static void main(String[] args) {    
        int number = 15;
        int num = 7;
        System.out.println(printTable(number));
        System.out.println(printTable(num));
    }
}
