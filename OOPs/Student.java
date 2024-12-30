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
        rollNo = 2;
        name = "Ram";
        marks[0] = 5;
        marks[1] = 4;
        marks[2] = 6;

        System.out.println("I am a Default Construtor");
    }


    Student(int rollNo, String name, int marks[]){
        // this - keyword
        //current calling object reference

        if(rollNo < 0){
            System.out.println("Invalid Roll Number");
            return;
        }

        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;

        // Instance Variable = Local Variable


        // Shadow Problem - A problem occuring due to the same Variable and Parameter name
    }

    public void print(){
        System.out.println(rollNo);
        System.out.println(name);
        for(int c=0; c<3; c++){
            System.out.println(marks[c]);
        }
    }

}