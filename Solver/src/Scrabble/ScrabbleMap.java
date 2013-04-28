/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Scrabble;

import Controller.DataMap;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;

/**
 *
 * @author Lewis
 */
public class ScrabbleMap implements DataMap<Character> {

    private List<JTextField> textFields;
    
    public ScrabbleMap(List<JTextField> textFields) {
        this.textFields = textFields;
    }

    @Override
    public Character getData(int i, int j) {
        return textFields.get(i).getText().charAt(0);
    }

    @Override
    public void setData(int i, int j, Character data) {}
    
}
