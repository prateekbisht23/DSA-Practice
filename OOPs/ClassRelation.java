// is-a relation => Parent-Child relation
// has-a relation

/*  
    Association =>
        A Teacher teaches Students.
        A Customer places an Order. 
*/

// has-a
/*  
    Aggregation => their existance are Independent of each other
        A Team has Players

    Composition => their existance are Dependent on each other
        A House has Rooms
*/

// Generalization - Child to Parent
// Specialization - Parent to Child

import java.util.ArrayList;
import java.util.List;

public class ClassRelation {
    public static void main(String[] args) {
        Bank sbi = new Bank();
        Account account = new Account();
        Branch branch = new Branch(account);
    }
}

class Bank{
    List<Branch> branches = new ArrayList<>();
}

class Branch{
    Branch(Account account){

    }
}

class Account{

}

class SavingAccount extends Account{
    
}

class CurrentAccount extends Account{
    
}