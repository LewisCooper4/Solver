/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WordSearch;

import Controller.DataMap;
import Controller.GUIController;

/**hi
 *
 * @author Lewis
 */
public class WordSearchController implements GUIController<Character> {

    private WordSearchMap map;
    private char[][] board;
    private int size;
    
    public WordSearchController(DataMap map, int size) {
        this.map = (WordSearchMap) map;
        board = new char[size][size];
        this.size = size;
    }
    
    @Override
    public void createBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++){
                board[i][j] = map.getData(i, j);
            }
        }
    }
    
    @Override
    public void setBoard(Character[][] board) {
    }

    @Override
    public Character[][] getBoard() {
        return null;
    }

    
    
}
