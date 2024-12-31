interface I1{
    int X = 10;
    void show();
}
interface I2{
    int X = 20;
    void show();
}

interface I3 extends I1, I2{

}

class I4 implements I3{
    @Override
    public void show(){
        System.out.println(I1.X + I2.X);
    }

}


public class InterfaceDemo2 {
    public static void main(String[] args) {
        I4 obj = new I4();
        obj.show();
    }
}
