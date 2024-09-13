
public class test {

    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;

        // Declare a 2D boolean array
        boolean[][] boolArray = new boolean[rows][cols];

        // Since default values are false, we don't need to explicitly set them
        
        // Print the array to verify default values (which are false)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(boolArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
