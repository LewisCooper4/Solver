/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WordSearch;

import Controller.DataMap;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author Lewis
 */
public class WordSearchMap implements DataMap<Character> {
    
    ArrayList<JTextField> textFields;
    private int size;
    
    public WordSearchMap(ArrayList<JTextField> textFields, int size) {
        this.textFields = textFields;
        this.size = size;
    }

    @Override
    public Character getData(int i, int j) {
        int index = i * size + j;
        Character c = textFields.get(index).getText().charAt(0);          
        return c;
    }

    @Override
    public void setData(int i, int j, Character data) {
        int index = i * size + j;
        if (data == 't') {
            textFields.get(index).setBackground(Color.YELLOW);
        }
        else if (data == 'f') {
            textFields.get(index).setBackground(Color.WHITE);
        }
        else {
            
        }
        
    }
    
}
