public class HCF {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]), b = Integer.parseInt(args[1]);
        int ta = a, tb = b;
        while(tb != 0){
            int temp = tb;
            tb = ta%tb;
            ta = temp;
        }
        int lcm = a*b/ta;
        System.out.println("HCF is "+ ta);
        System.out.println("LCM is "+lcm);
    }
}
