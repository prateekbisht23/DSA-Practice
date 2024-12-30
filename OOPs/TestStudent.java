public class TestStudent {
    public static void main(String[] args) {
        int x;
        x = 10;

        Student ram;   // ram is a reference variable

        ram = new Student();   // new - keyword (Runtime Memory Allocation)

        // Student() or System.out.println() - calling bracket (there exists a constructor)

        System.out.println(ram.rollNo + " " + ram.name + " " + ram.marks);
    }
}
