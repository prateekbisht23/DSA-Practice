import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class SalaryApp {

    static Locale locale = Locale.of("hi","IN");
    static ResourceBundle rb = null;

    static double getHra(double basic_salary){
        double annual_salary = basic_salary*12;
        return annual_salary * 0.1;
    }
    
    static double getMa(double basic_salary){
        double annual_salary = basic_salary*12;
        return annual_salary * 0.12;
    }

    static double getTa(double basic_salary){
        double annual_salary = basic_salary*12;
        return annual_salary * 0.05;
    }

    static double getTax(double basic_salary){
        double annual_salary = basic_salary*12;
        if(annual_salary <= 500000){
            return 0;
        }
        return annual_salary * .05;
    }

    static double getPf(double basic_salary){
        double annual_salary = basic_salary*12;
        return annual_salary * 0.05;
    }
    

    public static void main(String[] args) {

        rb = ResourceBundle.getBundle("messages",locale);

        // base salary = hra 10%, ma 12%, ta 5%, tax 7%, pf 5%
        try(Scanner sc = new Scanner(System.in)){
            System.out.print(rb.getString("enter_name"));
            String name = sc.nextLine();

            System.out.print(rb.getString("enter_salary"));
            double basic_salary = sc.nextDouble();
        

        
            double hra = getHra(basic_salary);
            double tax = getTax(basic_salary);
            double pf = getPf(basic_salary);
            double ma = getMa(basic_salary);
            double ta = getTa(basic_salary);
        
            double gs = (basic_salary*12) + hra + ma + ta;
            double ns = gs - pf - tax;
        
            System.out.println("Name : " + name);
            System.out.println("Basic Salary : " + basic_salary);
            System.out.println("Annual Salary : " + basic_salary*12);
            System.out.println("Tax : " + tax);
            System.out.println("Hra : " + hra);
            System.out.println("Medical Allowance : " + ma);
            System.out.println("Travel Allowance : " + ta);
            System.out.println("Provisional Fund : " + pf);
            System.out.println("Gross Salary : " + gs);
            System.out.println("Net Salary : " + ns);

            //Scanner.close();
        }
    }
}
