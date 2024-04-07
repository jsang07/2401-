package test;

public class Test9 {
        public static void main(String[] args) {
            int m = 5;
            int n = 10;
            double p = 0.3;

            char[][] board = new char[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (Math.random() < p) board[i][j] = '*';
                    else board[i][j] = '-';
                }
            }

            printBoard(board, m, n);
            System.out.println();
            System.out.println();
            printMineCounts(board);
        }

        public static void printBoard(char[][] board, int m, int n) {
            for (int i = 0; i< board.length; i++){
                for (int j = 0; j < board[0].length; j++){
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
        }

        public static void printMineCounts(char[][] board) {
            int[][] counts = new int[board.length][board[0].length];

            for (int i = 0; i< board.length; i++){
                for (int j = 0; j < board[0].length; j++){
                    if (board[i][j] == '*') continue;
                    for (int di = -1; di <= 1; di++){
                        for (int dj = -1; dj <= 1; dj++){
                            int ni = i +di;
                            int nj = j +dj;

                            if (ni >= 0 && ni < board.length && nj >= 0 && nj < board[0].length){
                                if (board[ni][nj] == '*'){
                                    counts[i][j]++;
                                }
                            };
                        }
                    }
                }
            }

            for (int i = 0; i< board.length; i++){
                for (int j = 0; j < board[0].length; j++){
                    if (board[i][j] == '*') System.out.print("* ");
                    else System.out.print(counts[i][j] + " ");
                }
                System.out.println();
            }


        }


}
