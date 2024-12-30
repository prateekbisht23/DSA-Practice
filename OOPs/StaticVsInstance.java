// Static Members are also called class members

class User{
    String userId;
    String password;

    static int count = 0;

    User(String userId, String password){
        this.userId = userId;
        this.password = password;
        count++;

        System.out.println("count - " + count);
    }
}

class Customer{
    // Instance (Bind with Object)
    int id;
    String name;

    // Static (Bind with Class)
    // Class members - it gets called when class is created
    // Share among the objects
    static String companyName;

    static{
        System.out.println("Im a Satic Block");
        companyName = "Brain Mentors";
    }
    
    
    Customer(int id, String name){
        System.out.println("Im a Constructor");
        this.id = id;
        this.name = name;
    }

}


class TriMath{
    private TriMath(){
        
    }

    static void sin(){
        System.out.println("sin");
    }

    static void cos(){
        System.out.println("cos");
    }

}


public class StaticVsInstance {

    public static void main(String[] args) {

       User user1 = new User("Jim", "1000");
       User user2 = new User("Tim", "2000");
       User user3 = new User("Lim", "3000");
       User user4 = new User("Nim", "4000");


       Customer ram = new Customer(1001, "Ram");
       System.out.println("Company - " + Customer.companyName);
       System.out.println("Name - " + ram.name);
       System.out.println("Id - " + ram.id);

       Customer shyam = new Customer(1002, "Shyam");
       System.out.println("Company - " + Customer.companyName);
       System.out.println("Name - " + shyam.name);
       System.out.println("Id - " + shyam.id);
    }

}
