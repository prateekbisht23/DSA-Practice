import java.util.Scanner;

class Employee{
    String name;
    short age;  //  110 563241
    float salary;
    String address;

    void showDetails(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);
        System.out.println("Address : " + address);
    }

}

public class UserInput{
    public static void main(String[] args) {
        Employee emp = new Employee();
        
        /* emp.name = "Ramesh";
        emp.age = 20;
        emp.salary = 52000f;
        emp.address = "Pune";
        
        emp.showDetails(); */

        //take input
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name : ");
        emp.name = scanner.nextLine();
        System.out.print("Enter Age : ");
        emp.age = scanner.nextShort();
        System.out.print("Enter Salary : ");
        emp.salary = scanner.nextFloat();
        scanner.nextLine();  /* It is reading the newline character left in the input buffer by 
        'scanner.nextFloat()'*/
        System.out.print("Enter Address : ");
        emp.address = scanner.nextLine();
        
        emp.showDetails();
        
    }
}
