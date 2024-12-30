// SRP
// public or default
// default scope - within the package
// public scope - within and outside the package

class Student{
    // Members 
    // Instance Members

    int rollNo;
    String name;
    int marks[] = new int[3];

    // Init block - it gets call before the constructor
    {
        System.out.println("I am a Init Block");
        System.out.println(rollNo + " " + name + " " + marks);
    }

    // Every class has a default constructor by default

    // deafult constructor
    Student(){
        rollNo = 2;
        name = "Ram";
        marks[0] = 5;
        marks[1] = 4;
        marks[2] = 6;

        System.out.println("I am a Default Construtor");
    }

}