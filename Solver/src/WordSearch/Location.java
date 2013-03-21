/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WordSearch;

/**
 *
 * @author cooper
 */
public class Location {
    
    private int row;
    private int col;
    
    public Location(int r, int c) {
            
        row = r;
        col = c;        
        
    }
    
    public int getRow() {
        
        return row;
        
    }
    
    
    public int getCol() {
        
        return col;
        
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        final Location other = (Location) obj;
        
        if (this.row != other.row) {
            return false;
        }
        
        if (this.col != other.col) {
            return false;
        }
        
        return true;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.row;
        hash = 29 * hash + this.col;
        return hash;
    }
    
    
    
    
}
