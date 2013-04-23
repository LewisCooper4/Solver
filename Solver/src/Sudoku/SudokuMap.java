/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sudoku;

import Controller.DataMap;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author Lewis
 */
public class SudokuMap implements DataMap<Integer> {
    
    private ArrayList<JTextField> textFields;
    
    public SudokuMap(ArrayList<JTextField> textFields) {
        this.textFields = textFields;
    }
    
    @Override
    public Integer getData(int i, int j) { 
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
    
    @Override
    public void setData(int i, int j, Integer num) {
        int index = i * 9 + j;
        if ("0".equals(textFields.get(index).getText())) {
            textFields.get(index).setBackground(Color.YELLOW);
        }
        textFields.get(index).setText("" + num);        
    }      

}

