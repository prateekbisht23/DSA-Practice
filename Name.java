public class Name {
    public static void main(String[] args) {
        //String str = args[0];
        //String str = new String();
        for(int i = 0; i< args.length; i++){
            System.out.print(args[i].substring(0,1).toUpperCase() + args[i].substring(1).toLowerCase() + " ");
        }
    }
}
