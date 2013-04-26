/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Boggle;

import Controller.DataMap;
import Controller.GUIController;
import TestClasses.Boggle;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 *
 * @author Lewis
 */
public class BoggleController implements GUIController<Character> {

    
    private BoggleMap map;
    private JTextArea textArea;
    private char[][] board;
    
    
    public BoggleController(DataMap map, JTextArea textArea) {
        this.map = (BoggleMap) map;
        this.textArea = textArea;
        board = new char[4][4];
    }
    
    @Override
    public void createBoard() {
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++){
                board[i][j] = map.getData(i, j);
            }
        }
    }

    @Override
    public void setBoard(Character[][] boardy) {
        
        Lexicon lex = null;
        try {
            lex = new Lexicon("words.txt");
        } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(Boggle.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (IOException ex) {
            Logger.getLogger(Boggle.class.getName()).log(Level.SEVERE, null, ex);
        }
        Board b = new Board(board);
        Searcher s = new Searcher(b, lex);
        s.search();
        
        s.getWords();
        
        textArea.setText("Number of words = " + s.getSize() + "\n");      
        
        for (String word : s.getWords()) {
            textArea.append(word + "\n");
        }
    }

    @Override
    public Character[][] getBoard() {        
        return null;
    }
    
}
