public class Test202 {
    public static void main(String[] args) {

        int[][] game = {{5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}};


        solveGame(game);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                System.out.print(game[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static boolean solveGame(int[][] game) {

        for (int row = 0; row < 9; row++) {

            for (int col = 0; col < 9; col++) {

                if (game[row][col] == 0) {

                    for (int num = 1; num <= 9; num++) {

                      if(isSafe(game, row, col, num)){

                          game[row][col] = num;

                            if (solveGame(game)) {
                                return true;
                            }
                            game[row][col] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isSafe(int[][] game, int row, int col, int num) {

        for (int i = 0; i < 9; i++) {

            if (game[row][i] == num) {
                return false;
            }

            if (game[i][col] == num) {
                return false;
            }

        }


        int start = row - row % 3;
        int end = col - col % 3;

        for (int i = start; i < start + 3; i++) {

            for (int j = end; j < end + 3 ; j++) {

                if (game[i][j] == num) {
                    return false;
                }

            }

        }
        return true;

    }
}