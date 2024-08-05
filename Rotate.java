import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num, rot, count = 0;
            System.out.print("Enter a number : ");
            num = sc.nextInt();
            System.out.print("Enter the rotation number : ");
            rot = sc.nextInt();
            int temp = num;
            while(temp != 0){
                count++;
                temp/=10;
            }

            //r=9 num =4
            rot = rot % count;

            /* while(rot != 0){
                l = num%10;
                num /= 10;
                num = (int)(l*(Math.pow(10,count-1)) + num);
                rot--;
            } */

            int l = (int) (num % (Math.pow(10,rot)));
            num /= (Math.pow(10,rot));

            num = (int)(num * (Math.pow(10, count-rot))) + l;
                
            System.out.println(num);
            sc.close();
        }
    }
}