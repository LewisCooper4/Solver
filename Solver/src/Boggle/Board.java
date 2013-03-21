/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Boggle;
/**
 *
 * @author cooper
 */
public class Board  {

    char[][] board;
    
    public Board(char[][] letters) {
        
        board = new char[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                board[i][j] = letters[i][j];
            }
        }
    }

    
    public char getValue(Location l) {      
        return board[l.getRow()][l.getCol()];
    }
    
}
