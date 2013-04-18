/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sudoku;

/**
 *
 * @author Lewis
 */
public class SudokuSearcher {
    
    private Integer[][] correctBoard;   
    
    public SudokuSearcher() {
        correctBoard = new Integer[9][9];
    }    
    
    
    public boolean solve(int i, int j, Integer[][] board) {
        
        if (i == 9) {
            i = 0;
            j++;
            if (j == 9) {
                return true;
            }
        }
        
        //IF THE SPOT IS FILLED SKIP IT
        if (board[i][j] != 0) {
            return solve(i+1, j, board);
        }
        
        //IF NOT THEN TRY TO FILL IT
        for (int val = 1; val <= 9; val++) {
            if(isLegal(i, j, val, board)) {
                board[i][j] = val;
                if (solve(i+1, j, board)) {
                    correctBoard = board;
                    return true;
                }
            }
        }
        
        board[i][j] = 0;        
        return false;
        
    }
    
    
    private boolean isLegal(int row, int col, int value, Integer[][] board) {
        
        //ROW CHECK
        for (int j = 0; j < 9; j++) {
            if (value == board[row][j]) {
                return false;
            }
        }
        
        //COL CHECK
        for (int i = 0; i < 9; i++) {
            if (value == board[i][col]) {
                return false;
            }
        }
        
        //BOX CHECK
        int boxRow = (row / 3) * 3;
        int boxCol = (col / 3) * 3;        
        for (int i = boxRow; i < boxRow + 3; i++) {
            for (int j = boxCol; j < boxCol + 3; j++) {
                if (value == board[i][j]) {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    public Integer[][] getBoard() {
        return correctBoard;
    }
    
}
