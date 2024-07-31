
public class Ques1 {
    public static void main(String[] args) {
        //String str = args[0];
        //String str = new String();
        for (String arg : args) {
            System.out.print(arg.substring(0, 1).toUpperCase() + arg.substring(1).toLowerCase() + " ");
        }
    }
}


