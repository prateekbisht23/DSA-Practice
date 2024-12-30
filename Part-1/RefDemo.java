public class RefDemo {
    public static void main(String[] args) {
        // String sql = "select * from products";
        StringBuffer sql = new StringBuffer("Amit");
        sql.append("Anything");
        String a = "Amit";
        String b = "Amit";
        a = "Ram";

    }
}

// Heap has a special memory for strings called String Pool
// String uses string pool concept
// String is immutable even after being reference type because it is sharable
// StringBuffer is mutable