public class test3{

    static void headRecursion(int n) {
        if (n > 0) {
            headRecursion(n - 1);  // Recursive call made first
            System.out.println(n);  // Operation performed after the recursive call
        }
    }

    
    public static void main(String[] args) {
        headRecursion(6);    
    }
}