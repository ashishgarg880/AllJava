package com.Backtrack;

public class Count_N_Queen {

    public int totalNQueens(int n) {
        return solveNQueens(n);
    }

    private int solveNQueens(int n) {
        // Initialize the board
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        return backtrack(board, 0, n);
    }

    private int backtrack(char[][] board, int row, int n) {
        // Base case: If we've placed queens in all rows, we have a valid solution
        if (row == n) {
            return 1;
        }

        int count = 0;
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                // Place the queen
                board[row][col] = 'Q';

                // Move to the next row and accumulate valid solutions
                count += backtrack(board, row + 1, n);

                // Backtrack by removing the queen
                board[row][col] = '.';
            }
        }
        return count;
    }

    private boolean isSafe(char[][] board, int row, int col, int n) {
        // Check the column for any queen above this row
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check the upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check the upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }
}
