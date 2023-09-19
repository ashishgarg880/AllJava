package com.Arr;

public class NQueens {

    public static void main(String[] args) {
        int n = 4; // Change this value to the desired board size (N x N)
        solveNQueens(n);
    }

    private static void solveNQueens(int n) {
        int[][] board = new int[n][n];
        if (solveNQueensUtil(board, 0)) {
            printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
    }

    private static boolean solveNQueensUtil(int[][] board, int col) {
        int n = board.length;
        if (col >= n) {
            return true; // All queens are placed successfully
        }

        for (int i = 0; i < n; i++) {
            if (isSafe(board, i, col)) {
                board[i][col] = 1;
                if (solveNQueensUtil(board, col + 1)) {
                    return true;
                }
                board[i][col] = 0; // Backtrack
            }
        }
        return false; // Placement of queens is not possible
    }

    private static boolean isSafe(int[][] board, int row, int col) {
        int n = board.length;

        // Check the row on the left side
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        // Check upper diagonal on the left side
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check lower diagonal on the left side
        for (int i = row, j = col; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    private static void printBoard(int[][] board) {
        int n = board.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] == 1 ? "Q " : ". ");
            }
            System.out.println();
        }
    }
}

