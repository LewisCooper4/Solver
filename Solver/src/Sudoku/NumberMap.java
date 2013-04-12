/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sudoku;

import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author Lewis
 */
public class NumberMap {
    
    private ArrayList<JTextField> textFields;
    
    public NumberMap(ArrayList<JTextField> textFields) {
        this.textFields = textFields;
    }
    
    public int getNum(int i, int j) { 
        int num;
        int index = i * 9 + j;
        String c = textFields.get(index).getText();
        if ("".equals(c)) {
            num = 0;
        }
        else {
            num = Integer.parseInt(c);
        }
          
        return num;
    }
    
    public void setNum(int i, int j, int num) {
        int index = i * 9 + j;
        textFields.get(index).setText("" + num);        
    }
    
    
    
}
