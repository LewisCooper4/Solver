package Boggle;

import java.util.LinkedList;
/**
 *
 * @author cooper
 */
public class BoardMarks {
    
    public boolean[][] marked;
    
    public BoardMarks() {
        
        marked = new boolean[4][4];
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                
                marked[i][j] = false;
            }
            
        }
    }
    
    public void mark(Location loc) {
        
        int row = loc.getRow();
        int col = loc.getCol();
        
        if (marked[row][col]) {
            
            throw new IllegalStateException("That spot is already marked");
            
        }
        
        marked[row][col] = true;
        
    }
    
    public void unmark(Location loc) {
        
        int row = loc.getRow();
        int col = loc.getCol();
        
        if (!marked[row][col]) {
            
            throw new IllegalStateException("That spot is already unmarked");
            
        }
        
        marked[row][col] = false;
        
    }
    
    
    
    public Iterable<Location> getNeighbors(Location loc) {
        
        LinkedList<Location> ret = new LinkedList<Location>();
        
        int row = loc.getRow();
        int col = loc.getCol();
        
        int rlower = -1;
        int rupper = 1;
        int clower = -1;
        int cupper = 1;
        
        if (row == 0) {
            
            rlower = 0;
        }
        
        else if (row == 3) {
            
            rupper = 0;
        }
        
        if (col == 0) {
            
            clower = 0;
        }
        
        else if (col == 3) {
            
            cupper = 0;
        }
        
        for (int i = rlower; i <= rupper; i++) {
            for(int j = clower; j <= cupper; j++) {
                
                if (marked[row + i][col + j] == false) {
                    
                    ret.add(new Location(row + i, col + j));

                }
                
            }
            
        }
    
        return ret;
        
    }
    
    
    
}
