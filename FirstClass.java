//Java OOPS
//James Gosling is the founder of Java
// what is class - class is a keyword
// used to define a java class
// class - it is a blueprint / template / prototype
// class name and file name should be same in Java
// javac <SourceCodeFilename.java> --> Generate Byte Code
// ByteCode (ClassName.class)
// class starting with '_' is an inner class having very low level code
// class having a '$' sign between it is a sub class of an parent class


public class FirstClass{
    // String args[] - Command Line Argument - can create your own command
    // main is a function. "ENTRY POINT"
    // void - no return
    // static - load when class is loaded, so no need to create objects
    // public - main function is accessible outside package (folder)
    // JRE access outside
    // out - object of PrintStream class

    public static void main(String args[]){
    
    //static public void main(String args[])
    // public static void main(String [] args)
    // public static void main(String [] 'any argument name')

        System.out.println("Hello Java");
    }
}