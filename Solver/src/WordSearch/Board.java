/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WordSearch;

/**
 *
 * @author Lewis
 */
public class Board {
    
    private int dimensions;
    private char[][] letters;
    
    public Board(char[][] letters) {
        
        dimensions = letters.length;
        this.letters = letters;
        
    }
    
    public char getLetter(Location loc) {
        
        if (loc.getRow() > dimensions || loc.getCol() > dimensions || loc.getRow() < 0 || loc.getCol() < 0) {
            throw new IllegalArgumentException("That location is not on the board");
        }
        
        return letters[loc.getRow()][loc.getCol()];        
    }
    
}
