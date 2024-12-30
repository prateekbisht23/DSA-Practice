public class HcfRec {
    static int getHcf(int num1, int num2){
        if(num2 == 0){
            return num1;
        }
        
        return getHcf(num2, num1 % num2);
    }
    public static void main(String[] args) {
        int num1 = 20, num2 = 30;
        
        System.out.println(getHcf(num1, num2));
    }
}

/* 
        int ta = a, tb = b;
        while(tb != 0){
            int temp = tb;
            tb = ta%tb;
            ta = temp;
        }
        int lcm = a*b/ta; */