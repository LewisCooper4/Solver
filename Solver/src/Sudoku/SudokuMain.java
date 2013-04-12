/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sudoku;

/**
 *
 * @author Lewis
 */
public class SudokuMain {
    
    public static void main(String args[]) {
        
        
        int[][] board = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = 0;
            }
        }
        
       // 014 023 037 069 088 \
//125 143 211 263 306 342 357 404 427 461 483 \
//535 544 589 622 673 745 764 805 824 851 862 876
        
        
        board[0][1] = 4;
        board[0][2] = 3;
        board[0][3] = 7;
        board[0][6] = 9;
        board[0][8] = 8;
        board[1][2] = 5;
        board[1][4] = 3;
        board[2][1] = 1;
        board[2][6] = 3;
        board[3][0] = 6;
        board[3][4] = 2;
        board[3][5] = 7;
        board[4][0] = 4;
        board[4][2] = 7;
        board[4][6] = 1;
        board[4][8] = 3;
        board[5][3] = 5;
        board[5][4] = 4;
        board[5][8] = 9;
        board[6][2] = 2;
        board[6][7] = 3;
        board[7][4] = 5;
        board[7][6] = 4;
        board[8][0] = 5;
        board[8][2] = 4;
        board[8][5] = 1;
        board[8][6] = 2;
        board[8][7] = 6;
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        Solver s = new Solver();
        s.solve(0, 0, board);
        
        int[][] correctBoard = s.getBoard();
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(correctBoard[i][j] + " ");
            }
            System.out.println();
        }
    
    }
        
}
