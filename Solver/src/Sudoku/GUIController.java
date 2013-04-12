/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sudoku;

/**
 *
 * @author Lewis
 */
public class GUIController {
    
    private NumberMap numMap;
    private int[][] sudokuBoard;
    
    public GUIController(NumberMap numMap) {
        this.numMap = numMap;
        sudokuBoard = new int[9][9];
    }
    
    public void createBoard() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sudokuBoard[i][j] = numMap.getNum(i, j);
            }
        } 
    }
    
    public void setBoard(int[][] board) {       
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                numMap.setNum(i, j, board[i][j]);
            }
        }        
    }
    
    public int[][] getBoard() {
        return sudokuBoard;
    }
    
}
