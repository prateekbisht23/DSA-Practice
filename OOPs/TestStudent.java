public class TestStudent {
    public static void main(String[] args) {
        int x;
        x = 10;

        Student ram;   // ram is a reference variable

        //ram = new Student();   // new - keyword (Runtime Memory Allocation)

        ram = new Student(1001, "Ram", new int[] {20, 30, 40});

        ram.print();

        /* ram.rollNo = -1001;
        ram.name = "@#%$";
        ram.marks = new int[] {-1,-1,-1}; */

        // Student() or System.out.println() - calling bracket (there exists a constructor)

        //System.out.println(ram.rollNo + " " + ram.name + " " + ram.marks);
        // . is a member access object
    }
}
