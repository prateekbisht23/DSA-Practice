public class test4 {
    static void test(int n){
        if(n<=0){
            return;
        }
        System.out.println("precall "+n);
        test(n-1);
        System.out.println("midcall "+n);
        test(n-2);
        System.out.println("postcall "+n);
    }

    public static void main(String[] args) {
        test(4);
    }
}
