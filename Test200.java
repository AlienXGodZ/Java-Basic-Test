public class Test200 {

    static int[][] maze = {
            {0, 0, 0},
            {1, 1, 0},
            {0, 0, 0}
    };

    public static void main(String[] args) {

        myMethod(0, 0, "");

    }

    public static void myMethod(int row, int col, String path) {

        // Out of bounds
        if (row >= 3 || col >= 3) {
            return;
        }

        // Wall
        if (maze[row][col] == 1) {
            return;
        }

        // Reached End
        if (row == 2 && col == 2) {
            System.out.println(path);
            return;
        }

        // Move Right
        myMethod(row, col + 1, path + "R");

        // Move Down
        myMethod(row + 1, col, path + "D");
    }
}