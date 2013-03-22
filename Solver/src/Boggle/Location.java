/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Boggle;

/**
 *
 * @author cooper
 */
public class Location {
    
    private int row;
    private int col;
    
    public Location(int r, int c) {
        
       // System.out.println("row = " + r + " col = " + c);
        if(r > 5 || r < 0 || c > 5 || c < 0) {
            
            throw new IllegalArgumentException("That location does not exist");
            
        } 
            
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
