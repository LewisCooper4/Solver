/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WordSearch;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Lewis
 */
public class Searcher {
    
    private int dimensions;
    private Lexicon lex;    
    private Board board;
    private Set<String> words;
    
    public Searcher(int dimensions, Lexicon lex, Board board) {
        
        this.dimensions = dimensions;
        this.lex = lex;
        this.board = board;
        
        words = new HashSet<String>();
        
    }
    
    public void search() {
        
        for (int i = 0; i < dimensions; i++) {
            for (int j = 0; j < dimensions; j++) {
                getWords(new Location(i, j));
            }            
        }
        
    }
    
    private void getWords(Location loc) {
        
        WordPath wp = new WordPath();
        char startLetter = board.getLetter(loc);
        wp.push(startLetter);
        
        int row = loc.getRow();
        int col = loc.getCol();
        
        //GO FROM LOCATION STRAIGHT UP
        int i = 0;
        while (lex.isPrefix(wp.getWord()) && col - i != 0) {
            i++;
            loc = new Location(row, col - i);
            wp.push(board.getLetter(loc));
            if (lex.isWord(wp.getWord())) {
                words.add(wp.getWord());
            }
        }
        
        //GO FROM LOCATION STRAIGHT RIGHT
        i = 0;
        wp = new WordPath();
        wp.push(startLetter);
        while (lex.isPrefix(wp.getWord()) && row + i != dimensions) {
            i++;
            loc = new Location(row + i, col);
            wp.push(board.getLetter(loc));
            if (lex.isWord(wp.getWord())) {
                words.add(wp.getWord());
            }
        }
        
        //GO FROM LOCATION STRAIGHT DOWN
        i = 0;
        wp = new WordPath();
        wp.push(startLetter);
        while (lex.isPrefix(wp.getWord()) && col + i != dimensions) {
            i++;
            loc = new Location(row, col + i);
            wp.push(board.getLetter(loc));
            if (lex.isWord(wp.getWord())) {
                words.add(wp.getWord());
            }
        }
        
        //GO FROM LOCATION STRAIGHT LEFT
        i = 0;
        wp = new WordPath();
        wp.push(startLetter);
        while (lex.isPrefix(wp.getWord()) && row - i != 0) {
            i++;
            loc = new Location(row - i, col);
            wp.push(board.getLetter(loc));
            if (lex.isWord(wp.getWord())) {
                words.add(wp.getWord());
            }
        }
        
        //GO FROM LOCATION DIAGNOLLY UP RIGHT
        i = 0;
        wp = new WordPath();
        wp.push(startLetter);
        while (lex.isPrefix(wp.getWord()) && row + i != dimensions && col - i != 0) {
            i++;
            loc = new Location(row + i, col - i);
            wp.push(board.getLetter(loc));
            if (lex.isWord(wp.getWord())) {
                words.add(wp.getWord());
            }
        }
        
        //GO FROM LOCATION DIAGNOLLY DOWN RIGHT
        i = 0;
        wp = new WordPath();
        wp.push(startLetter);
        while (lex.isPrefix(wp.getWord()) && row + i != dimensions && col + i != dimensions) {
            i++;
            loc = new Location(row + i, col + i);
            wp.push(board.getLetter(loc));
            if (lex.isWord(wp.getWord())) {
                words.add(wp.getWord());
            }
        }
        
        //GO FROM LOCATION DIAGNOLLY DOWN LEFT
        i = 0;
        wp = new WordPath();
        wp.push(startLetter);
        while (lex.isPrefix(wp.getWord()) && row - i != 0 && col + i != dimensions) {
            i++;
            loc = new Location(row - i, col + i);
            wp.push(board.getLetter(loc));
            if (lex.isWord(wp.getWord())) {
                words.add(wp.getWord());
            }
        }
        
        //GO FROM LOCATION DIAGNOLLY UP LEFT
        i = 0;
        wp = new WordPath();
        wp.push(startLetter);
        while (lex.isPrefix(wp.getWord()) && row - i != 0 && col - i != 0) {
            i++;
            loc = new Location(row - i, col - i);
            wp.push(board.getLetter(loc));
            if (lex.isWord(wp.getWord())) {
                words.add(wp.getWord());
            }
        }
        
    }
    
}
