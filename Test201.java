public class Test201 {

    static int N = 4;

    public static void main(String[] args) {

        char[][] board = new char[N][N];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                board[i][j] = '.';
            }
        }

        myMethod(board, 0);
    }

    public static void myMethod(char[][] board, int row){

        if(row == N){

            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println();
            return;
        }

        for(int col = 0; col < N; col++){

            if(isSafe(board, row, col)){

                board[row][col] = 'Q';

                myMethod(board, row + 1);

                board[row][col] = '.';
            }
        }
    }

    public static boolean isSafe(char[][] board, int row, int col){

        // Check column
        for(int i = 0; i < row; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // Check left diagonal
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // Check right diagonal
        for(int i = row - 1, j = col + 1; i >= 0 && j < N; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }
}