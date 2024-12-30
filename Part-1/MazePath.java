public class MazePath {

    static void mazePath(int startRow, int startCol, int endRow, int endCol, String result){
        if(startRow > endRow || startCol > endCol) return;
        if(startRow == endRow && startCol == endCol){
            System.out.println(result + " ");
            return;
        }
        mazePath(startRow+1, startCol, endRow, endCol, result+"V");
        mazePath(startRow, startCol+1, endRow, endCol, result+"H");
    }

    public static void main(String[] args) {
        mazePath(0, 0, 1, 1, "");
    }
}
