// SRP
// public or default
// default scope - within the package
// public scope - within and outside the package

class Student{
    // Members 
    // Instance Members
    private int rollNo;
    private String name;
    private int marks[] = new int[3];
    private boolean discount;
    private String email;
    private String city;
    private String phoneNumber;
    private String collegeName;



    public int getRollNo() {
        return rollNo;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int[] getMarks() {
        return marks;
    }


    public void setMarks(int[] marks) {
        this.marks = marks;
    }


    public boolean isDiscount() {
        return discount;
    }


    public void setDiscount(boolean discount) {
        this.discount = discount;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getCity() {
        return city;
    }


    public void setCity(String city) {
        this.city = city;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getCollegeName() {
        return collegeName;
    }


    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }



    // Init block - it gets call before the constructor
    {
        System.out.println("I am a Init Block");
        System.out.println(rollNo + " " + name + " " + marks);
    }

    // Every class has a default constructor by default
    // deafult constructor (No Arguments)
    // class name and constructor name are same
    // constructor never returns

    Student(){
        /* rollNo = 2;
        name = "Ram";
        marks[0] = 5;
        marks[1] = 4;
        marks[2] = 6; */

        collegeName = "BPIT";

        System.out.println("I am a Default Construtor");
    }


    Student(int rollNo, String name, int marks[]){
        
        this(name, marks); // Calling the Default Constructor

        // this - keyword
        //current calling object reference

        if(rollNo < 0){
            System.out.println("Invalid Roll Number");
            return;
        }

        this.rollNo = rollNo;

        // Instance Variable = Local Variable


        // Shadow Problem - A problem occuring due to the same Variable and Parameter name
    }


    Student(String name, int marks[]){
        this();
        this.name = name;
        this.marks = marks;
    }



    public void print(){
        System.out.println("Roll Number - " + rollNo);
        System.out.println("Name - " + name);
        System.out.println("Marks - " + marks[0] + " " + marks[1] + " " + marks[1]);
        System.out.println("College Name - " + collegeName);
    }


}