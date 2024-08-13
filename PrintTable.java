public class PrintTable {
    static String printTable(int num){
        return helper(num, 10);
    }
    static String helper(int num, int count){
        if(count == 1){
            return num + " * "+count+" = "+count*num+"\n";
        }
        return helper(num, count-1) + num + " * "+count+" = "+count*num+"\n"; 
    }
    public static void main(String[] args) {
        int num = 7;
        System.out.println(printTable(num));
    }
}
