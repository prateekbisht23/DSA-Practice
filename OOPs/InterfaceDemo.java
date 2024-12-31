/* 
    Interface - standard / Contract (What to Do)
    100% Abstract
*/


// interface IPlayer{
abstract interface IPlayer{
    public static final int MAX_POWER = 100;
    int MIN_POWER = 10;

    public abstract void walk();
    void jump();
    void punch();
}

// How to Do
class RedPlayer implements IPlayer{

    @Override
    public void walk(){
        System.out.println("Red Player Walk ... ");
    }
    
    @Override
    public void jump(){
        System.out.println("Red Player Jump ... ");
    }
    
    @Override
    public void punch(){
        final int VALUE = MAX_POWER;
        System.out.println("Red Player Punch " + VALUE);
    }

}


class WhitePlayer implements IPlayer{

    @Override
    public void walk(){
        System.out.println("White Player Walk ... ");
    }
    
    @Override
    public void jump(){
        System.out.println("White Player Jump ... ");
    }
    
    @Override
    public void punch(){
        final int VALUE = MIN_POWER;
        System.out.println("White Player Punch " + VALUE);
    }

}



public class InterfaceDemo {
    public static void main(String[] args) {
        
    }
}
