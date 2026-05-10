public class NQueens {

    static int N = 4;
    static int[][] board = new int[N][N];

    // Check position is safe
    static boolean isSafe(int row, int col) {

        // Check left side
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1)
                return false;
        }

        // Upper diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1)
                return false;
        }

        // Lower diagonal
        for (int i = row, j = col; i < N && j >= 0; i++, j--) {
            if (board[i][j] == 1)
                return false;
        }

        return true;
    }

    // Place queens
    static boolean solve(int col) {

        // All queens placed
        if (col == N)
            return true;

        // Try every row
        for (int row = 0; row < N; row++) {

            if (isSafe(row, col)) {

                board[row][col] = 1; // place queen

                if (solve(col + 1))
                    return true;

                board[row][col] = 0; // backtrack
            }
        }

        return false;
    }

    // Print board
    static void printBoard() {

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N; j++) {

                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        if (solve(0)) {

            System.out.println("Solution:");
            printBoard();

        } else {

            System.out.println("No Solution");
        }
    }
}


// N-Queens Problem – Detailed Theory
// Introduction

// The N-Queens Problem is a famous problem in:

// Artificial Intelligence (AI)
// Backtracking
// Constraint Satisfaction Problems (CSP)

// The goal is to place N queens on an N × N chessboard such that:

// No two queens attack each other.
// Queen Movement in Chess

// A queen can move:

// Horizontally (row)
// Vertically (column)
// Diagonally

// So, two queens cannot be placed in:

// Same row
// Same column
// Same diagonal
// Example: 4-Queens Problem

// We need to place 4 queens on a 4 × 4 board safely.

// One valid solution:

// _ _ Q _
// Q _ _ _
// _ _ _ Q
// _ Q _ _

// Where:

// Q = Queen
// _ = Empty space
// Constraint Satisfaction Problem (CSP)

// N-Queens is called a Constraint Satisfaction Problem because:

// We must satisfy constraints:

// One queen per column
// One queen per row
// No diagonal attacks
// Approach Used: Backtracking
// What is Backtracking?

// Backtracking is a problem-solving technique where:

// Try → Check → If wrong → Undo → Try again

// It is a recursive method.

// Working of Backtracking in N-Queens
// Step-by-Step
// Step 1

// Place queen in first column.

// Step 2

// Move to next column and place another queen safely.

// Step 3

// Continue until:

// All queens are placed → Solution found
// OR
// No safe position exists → Backtrack




// Main Points of Code
// 1. Import Package
// import java.util.*;

// Imports utility classes.

// 2. Board Size
// static int N = 4;

// Creates 4 × 4 chessboard.

// 3. isSafe() Function
// static boolean isSafe(int board[][], int row, int col)

// Checks whether queen can be placed safely.

// Checks:

// Left row
// Upper diagonal
// Lower diagonal

// If another queen exists → returns false.

// Otherwise → returns true.

// 4. Left Side Check
// for (int i = 0; i < col; i++)

// Checks queens in same row.

// 5. Upper Diagonal Check
// for (int i=row,j=col; i>=0 && j>=0; i--,j--)

// Checks upper-left diagonal.

// 6. Lower Diagonal Check
// for (int i=row,j=col; i<N && j>=0; i++,j--)

// Checks lower-left diagonal.

// 7. solve() Function
// static boolean solve(int board[][], int col)

// Main backtracking function.

// Places queens column by column.

// 8. Base Condition
// if(col >= N)
//     return true;

// All queens placed successfully.

// 9. Try Every Row
// for(int i=0; i<N; i++)

// Tries placing queen in each row.

// 10. Place Queen
// board[i][col] = 1;

// Places queen.

// 1 means queen exists.

// 11. Recursive Call
// solve(board, col+1)

// Moves to next column.

// 12. Backtracking
// board[i][col] = 0;

// Removes queen if solution fails.

// This is the main idea of backtracking.

// 13. printBoard() Function
// printBoard(board);

// Prints final solution matrix.

// 14. Main Function
// int board[][] = new int[N][N];

// Creates empty board.

// Calls:

// solve(board,0)

// Starts placing queens from column 0.

// Output
// 0 0 1 0
// 1 0 0 0
// 0 0 0 1
// 0 1 0 0

// 1 = Queen position

// Time Complexity
// O(N!)

// Because many combinations are checked.

// Concepts Used
// Concept	Purpose
// 2D Array	Chessboard
// Backtracking	Try and undo
// Recursion	Place next queen
// Condition Checking	Safe position
// Loops	Traverse board