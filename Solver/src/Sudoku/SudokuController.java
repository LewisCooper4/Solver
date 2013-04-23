/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sudoku;

import Controller.DataMap;
import Controller.GUIController;

/**
 *
 * @author Lewis
 */
public class SudokuController implements GUIController<Integer> {
    
    private SudokuMap numMap;
    private Integer[][] sudokuBoard;
    
    public SudokuController(DataMap numMap) {
        this.numMap = (SudokuMap) numMap;
        sudokuBoard = new Integer[9][9];
    }
    
    @Override
    public void createBoard() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sudokuBoard[i][j] = numMap.getData(i, j);
            }
        } 
    }
    
    @Override
    public void setBoard(Integer[][] board) {       
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                numMap.setData(i, j, board[i][j]);
            }
        }        
    }
    
    @Override
    public Integer[][] getBoard() {
        return sudokuBoard;
    }
    
}
