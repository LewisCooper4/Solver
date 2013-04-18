/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Boggle;

import Controller.DataMap;
import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author Lewis
 */
public class BoggleMap implements DataMap<Character> {
    
    private ArrayList<JTextField> textFields;
    
    public BoggleMap(ArrayList<JTextField> textFields) {
        this.textFields = textFields;
    }

    @Override
    public Character getData(int i, int j) {
        
        int index = i * 4 + j;
        Character c = textFields.get(index).getText().charAt(0);          
        return c;
        
   }

    @Override
    public void setData(int i, int j, Character letter) {}
    
}
