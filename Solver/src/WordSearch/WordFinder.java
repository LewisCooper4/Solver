/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WordSearch;

import Boggle.Location;
import Boggle.WordPath;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Lewis
 */
public class WordFinder {
    
    private int dimensions;
    private OneWordLexicon lex;    
    private char[][] board;

    public WordFinder(int dimensions, OneWordLexicon lex, char[][] board) {
        this.dimensions = dimensions;
        this.lex = lex;
        this.board = board;
    }
    
    public List<Location> search() {
        
        for (int i = 0; i < dimensions; i++) {
            for (int j = 0; j < dimensions; j++) {
                List<Location> path = getWords(new Location(i, j));
                if (path != null) {
                    
                    //board.color(path);
                    return path;
                }
            }            
        }
        return null;
        
    }
    
    private List<Location> getWords(Location loc) {
        
        LinkedList<Location> path = new LinkedList<>();  
        Location startLocation = loc;
        path.add(startLocation);
        
        WordPath wp = new WordPath();
        char startLetter = board[loc.getRow()][loc.getCol()];
        wp.push(startLetter);
        
        int row = loc.getRow();
        int col = loc.getCol();
        
        //GO FROM LOCATION STRAIGHT UP
        int i = 0;
        while (lex.isPrefix(wp.getWord()) && col - i != 0) {
            i++;
            loc = new Location(row, col - i);
            path.add(loc);
            wp.push(board[loc.getRow()][loc.getCol()]);
            if (lex.isWord(wp.getWord())) {
                return path;
            }
        }
        
        path = new LinkedList<>();        
        path.add(startLocation);
        //GO FROM LOCATION STRAIGHT RIGHT
        i = 0;
        wp = new WordPath();
        wp.push(startLetter);
        while (lex.isPrefix(wp.getWord()) && row + i != dimensions-1) {
            i++;
            loc = new Location(row + i, col);
            path.add(loc);
            wp.push(board[loc.getRow()][loc.getCol()]);
            if (lex.isWord(wp.getWord())) {
                return path;
            }
        }
        
        path = new LinkedList<>();        
        path.add(startLocation);
        //GO FROM LOCATION STRAIGHT DOWN
        i = 0;
        wp = new WordPath();
        wp.push(startLetter);
        while (lex.isPrefix(wp.getWord()) && col + i != dimensions-1) {
            i++;
            loc = new Location(row, col + i);
            path.add(loc);
            wp.push(board[loc.getRow()][loc.getCol()]);
            if (lex.isWord(wp.getWord())) {
                return path;
            }
        }
        
        path = new LinkedList<>();        
        path.add(startLocation);
        //GO FROM LOCATION STRAIGHT LEFT
        i = 0;
        wp = new WordPath();
        wp.push(startLetter);
        while (lex.isPrefix(wp.getWord()) && row - i != 0) {
            i++;
            loc = new Location(row - i, col);
            path.add(loc);
            wp.push(board[loc.getRow()][loc.getCol()]);
            if (lex.isWord(wp.getWord())) {
                return path;
            }
        }
        
        path = new LinkedList<>();        
        path.add(startLocation);
        //GO FROM LOCATION DIAGNOLLY UP RIGHT
        i = 0;
        wp = new WordPath();
        wp.push(startLetter);
        while (lex.isPrefix(wp.getWord()) && row + i != dimensions-1 && col - i != 0) {
            i++;
            loc = new Location(row + i, col - i);
            path.add(loc);
            wp.push(board[loc.getRow()][loc.getCol()]);
            if (lex.isWord(wp.getWord())) {
                return path;
            }
        }
        
        path = new LinkedList<>();        
        path.add(startLocation);
        //GO FROM LOCATION DIAGNOLLY DOWN RIGHT
        i = 0;
        wp = new WordPath();
        wp.push(startLetter);
        while (lex.isPrefix(wp.getWord()) && row + i != dimensions-1 && col + i != dimensions-1) {
            i++;
            loc = new Location(row + i, col + i);
            path.add(loc);
            wp.push(board[loc.getRow()][loc.getCol()]);
            if (lex.isWord(wp.getWord())) {
                return path;
            }
        }
        
        path = new LinkedList<>();        
        path.add(startLocation);
        //GO FROM LOCATION DIAGNOLLY DOWN LEFT
        i = 0;
        wp = new WordPath();
        wp.push(startLetter);
        while (lex.isPrefix(wp.getWord()) && row - i != 0 && col + i != dimensions-1) {
            i++;
            loc = new Location(row - i, col + i);
            path.add(loc);
            wp.push(board[loc.getRow()][loc.getCol()]);
            if (lex.isWord(wp.getWord())) {
                return path;
            }
        }
        
        path = new LinkedList<>();        
        path.add(startLocation);
        //GO FROM LOCATION DIAGNOLLY UP LEFT
        i = 0;
        wp = new WordPath();
        wp.push(startLetter);
        while (lex.isPrefix(wp.getWord()) && row - i != 0 && col - i != 0) {
            i++;
            loc = new Location(row - i, col - i);
            path.add(loc);
            wp.push(board[loc.getRow()][loc.getCol()]);
            if (lex.isWord(wp.getWord())) {
                return path;
            }
        }
        
        return null;
        
    }
    
    
    
}
