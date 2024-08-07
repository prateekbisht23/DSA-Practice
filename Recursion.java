public class Recursion {
    static void showName(int num){
        if(num == 0){
            return;
        }
        num--;
        System.out.println("Hi");
        showName(num);
    }
    public static void main(String[] args) {
        showName(5);
    }
    
}