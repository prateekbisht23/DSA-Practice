/* public class Add {
    public static void main(String args[]){
        int first = Integer.parseInt(args[0]);
        int second = Integer.parseInt(args[1]);
        System.out.println(first + second);
    }
} */

public class Add {

    public static void main() {
        System.out.println("Main with no args");
    }

    public static void main(int a){
        System.out.println("Main with int " + a +  " as args");
    }


    public static void main(String args[]){
        main();
        main(10);
        int sum = 0;
        for(int i = 0; i<args.length; i++){
            sum += Integer.parseInt(args[i]);
        }
        System.out.println("sum is " + sum);
    }
}
