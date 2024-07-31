import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class SalaryApp {

    static Locale locale = null;
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
            return annual_salary * .01;
        }
        return annual_salary * .05;
    }

    static double getPf(double basic_salary){
        double annual_salary = basic_salary*12;
        return annual_salary * 0.05;
    }
    
    static String formatDate(){
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, locale);
        return df.format(new Date());
    }

    static String currencyFormat(double n){
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        return nf.format(n);
    }

    public static void main(String[] args) {
        
        // base salary = hra 10%, ma 12%, ta 5%, tax 7%, pf 5%
        try(Scanner sc = new Scanner(System.in)){
            
            System.out.println("Press 1 for english");
            System.out.println("हिंदी के लिए 2 दबाएँ");
            System.out.println("日本語の場合は 3 を押してください");
            
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice){
                case 1 -> locale = Locale.of("en", "US");
                case 2 -> locale = Locale.of("hi", "IN");
                case 3 -> locale = Locale.of("ja", "JP");
                default -> System.out.println("Invalid choice");
            }
            
            rb = ResourceBundle.getBundle("messages",locale);


            // System.out.println(rb.getObject(formatDate()));
            
            System.out.println(formatDate());
            currencyFormat(100.00);
            
            
            
            System.out.print(rb.getString("enter_name")+ " : ");
            String name = sc.nextLine();

            System.out.print(rb.getString("enter_salary")+ " : ");
            double basic_salary = sc.nextDouble();
            

        
            double hra = getHra(basic_salary);
            double tax = getTax(basic_salary);
            double pf = getPf(basic_salary);
            double ma = getMa(basic_salary);
            double ta = getTa(basic_salary);
        
            double gs = (basic_salary*12) + hra + ma + ta;
            double ns = gs - pf - tax;
        
            System.out.println(rb.getString("Name")+ " : " + name);
            System.out.println(rb.getString("Basic_salary")+ " : " + basic_salary);
            System.out.println(rb.getString("Annual_salary")+ " : " + basic_salary*12);
            System.out.println(rb.getString("Tax")+ " : " + tax);
            System.out.println(rb.getString("Hra")+ " : " + hra);
            System.out.println(rb.getString("Medical_allowance")+ " : " + ma);
            System.out.println(rb.getString("Travel_allowance")+ " : " + ta);
            System.out.println(rb.getString("Provisional_fund")+ " : " + pf);
            System.out.println(rb.getString("Gross_salary")+ " : " + gs);
            System.out.println(rb.getString("Net_salary")+ " : " + ns);

            //Scanner.close();
        }
    }
}
