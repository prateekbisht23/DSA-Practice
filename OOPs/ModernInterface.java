interface M1{

    void show();

    default void display(){
        System.out.println("M1 Display ... ");
    }

}

interface M2{

    void show();

    default void display(){
        System.out.println("M2 Display ... ");
    }

}

class M3 implements M1, M2{

    @Override
    public void display(){
        M1.super.display();
        M2.super.display();
        System.out.println("M3 Display ... ");
    }

    @Override
    public void show(){
        System.out.println("M3 Show ... ");
    }

}



public class ModernInterface {
    public static void main(String[] args) {
        M3 obj = new M3();
        obj.show();
        obj.display();
    }
}
