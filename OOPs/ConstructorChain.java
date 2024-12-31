class G1{
    int x;

    G1(){
        System.out.println("G1 Default Const");
    }
    G1(int x){
        this();
        System.out.println("G1 Param Const - " + x);
    }
}

class P2 extends G1{
    int x;

    P2(){
        super(40);
        System.out.println("P2 Default Const");
    }
    P2(int x){
        this();
        System.out.println("P2 Param Const - " + x);
    }
}

class C3 extends P2{
    int x;

    C3(){
        super(20);
        System.out.println("C3 Default Const");
    }
    C3(int x){
        this();
        int z = x + this.x + ((P2)this).x + ((G1)this).x;
        System.out.println("C3 Param Const - " + x);
        System.out.println("Xs sum - " + z);
    }
}


public class ConstructorChain {
    public static void main(String[] args) {
        // C3 obj = new C3();
        C3 obj = new C3(2);
    }
}
