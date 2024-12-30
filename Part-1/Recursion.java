public class Recursion {
    static void printName(int num){
        if(num == 0){
            return;
        }
        System.out.println("Prateek");
        printName(num-1);
    }
    public static void main(String[] args) {
        printName(5);
    }
    
}