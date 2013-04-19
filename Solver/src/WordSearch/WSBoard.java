/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WordSearch;

import Boggle.Location;
import java.awt.Color;
import java.util.List;
import javax.swing.JTextField;

/**
 *
 * @author Lewis
 */
public class WSBoard {
    
    private List<JTextField> textFields;
    
    public WSBoard(List<JTextField> textFields) {
        
        this.textFields = textFields;
        
    }
    
    public char getLetter(Location loc) {
        
        if (loc.getRow() > 10 || loc.getCol() > 10 || loc.getRow() < 0 || loc.getCol() < 0) {
            throw new IllegalArgumentException("That location is not on the board");
        }
        
        JTextField textField = textFields.get(loc.getRow() * 6 + loc.getCol());
        return textField.getText().charAt(0);    
        
    }
    
    public void color(List<Location> path) {
        
        for (JTextField tf : textFields) {
            tf.setBackground(Color.WHITE);
        }
        
        Color color = Color.YELLOW;
        
        for (Location loc : path) {
            //System.out.println("row = " + loc.getRow() + "\n" + "col = " + loc.getCol());
            JTextField textField = textFields.get(loc.getRow() * 6 + loc.getCol());
            textField.setBackground(color);
        }
        
    }
    
}
