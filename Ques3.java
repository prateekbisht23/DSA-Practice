
public class Ques3 {
    public static void main(String[] args) {
        System.out.println("Name : " + args[0]);
        System.out.println("Physics : " + args[1]);
        System.out.println("Chemistry : " + args[2]);
        System.out.println("Maths : " + args[3]);
        int total = Integer.parseInt(args[1]) + Integer.parseInt(args[2]) + Integer.parseInt(args[3]);
        System.out.println("Total : " + total);
        int p = (total*100)/300;
        System.out.println("Percentage : " + p);

        if(p >= 85){
            System.out.println("Grade : A");
        }
        else if(p >= 70){
            System.out.println("Grade : B");
        }
        else if(p >= 60){
            System.out.println("Grade : C");
        }
        else if(p >= 40){
            System.out.println("Grade : D");
        }
        else{
            System.out.println("Grade : F");
        }

    }
}
