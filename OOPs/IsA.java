/* 
    Saving Account
    Current Account
*/

import java.io.*;

class Summary{
    String title;
    String desc;
    double amount;    
}

class AdvancedSummary extends Summary{
    String day;
    String 
}

class Account{
    int id;
    String name;

    void deposit(){
        System.out.println("Account Deposit ... ");
    }

    void withDraw(){
        System.out.println("Account WithDraw ... ");
    }

    Summary roi() throws Exception {
        System.out.println("Acoount ROI ... ");
        Summary summary = new Summary();
        summary.title = "ROI Report";
        summary.desc = "Jan - March";
        summary.amount = 2000000;

        return summary;
    }

}

class SavingAccount extends Account{
    void limit(){
        System.out.println("Saving Account Daily Limit of 50 Lakh");
    }


    // private - within the class
    // default - within the package
    // protected - within the package and outside through inheritance
    // public - within and outside the package


    // wider access rule - we can increase the access of the class that way we can change the signature of the overridden method
    // covariant return type - an improved version of an object(its child class) can be returned

    // sub exception rule - a child class can throw the specified version of the exception thrown by the parent class

    @Override
    protected AdvancedSummary roi() throws IOException {
        //super.roi();
        System.out.println("Saving Account ROI ... ");

        AdvancedSummary advSummary = new AdvancedSummary();

        return advSummary;
    }

}

class CurrentAccount extends Account{
    void odLimit(){
        System.out.println("Current Account No Limit Extra WithDraw");
    }

    @Override
    Summary roi(){
        System.out.println("Current Account ROI ... ");
        
        Summary summary = new Summary();

        return summary;
    }

}


public class IsA{
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount();
        sa.deposit();
        sa.withDraw();
        sa.roi();
        sa.limit();

        System.out.println("***********************************");

        CurrentAccount ca = new CurrentAccount();
        ca.deposit();
        ca.withDraw();
        ca.roi();
        ca.odLimit();
    }
}