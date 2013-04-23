/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WordSearch;

import Boggle.Location;
import Controller.DataMap;
import Controller.GUIController;
import java.util.List;

/**lewis
 *
 * @author Lewis
 */
public class WordSearchController implements GUIController<Character> {

    private WordSearchMap map;
    private char[][] board;
    private int size;
    private String word;
    
    public WordSearchController(DataMap map, int size, String word) {
        this.map = (WordSearchMap) map;
        board = new char[size][size];
        this.size = size;
        this.word = word;
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
    public void setBoard(Character[][] boardy) {
        
        OneWordLexicon lex = new OneWordLexicon(word);
        WordFinder finder = new WordFinder(6, lex, board);
        List<Location> path = finder.search();
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map.setData(i, j, 'f');
            }
        }
        
        for (Location loc : path) {
            map.setData(loc.getRow(), loc.getCol(), 't');
        }
        
    }

    @Override
    public Character[][] getBoard() {
        return null;
    }

    
    
}
