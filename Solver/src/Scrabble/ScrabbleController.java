/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Scrabble;

import Boggle.Lexicon;
import Controller.DataMap;
import Controller.GUIController;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Lewis
 */
public class ScrabbleController implements GUIController<Character> {

    private ScrabbleMap map;
    private char[] letters;
    private JTextArea textArea;
    
    private static final String alphabet = "abcdefghijklmnopqrstuvwxyz";
    
    public ScrabbleController(DataMap map, int size, JTextArea textArea) {
        this.map = (ScrabbleMap) map;
        letters = new char[size];
        this.textArea = textArea;
    }
    
    @Override
    public void createBoard() {
        for (int i = 0; i < letters.length; i++) {
            letters[i] = map.getData(i, 0);
        }
    }

    @Override
    public void setBoard(Character[][] board) {
        
        Object[] possibilities = {"Official Scrabble" , "Words With Friends"};
            String fileName = (String)JOptionPane.showInputDialog(null, "Please select the point system you want to use",
                    "Scrabble", JOptionPane.PLAIN_MESSAGE,null, possibilities, "Official Scrabble");  
        
        
        
        ScrabbleWordFinder finder = new ScrabbleWordFinder(letters, fileName + ".txt");
        finder.findWords();
        
        textArea.setText("Number of words = " + finder.size());        
        for (String s : finder.getWords()) {
            textArea.append("\n" + s + " = " + ScrabblePointGetter.points(s));
        }        
        
        //ADD ALL OTHER LETTERS ONCE AND SEE WHAT NEW WORDS THEY ARE
        
        for (char c : alphabet.toCharArray()) {
            List<String> newWords = finder.findWithExtraLetter(c);
            textArea.append("\nIf you add a(n) " + c + " then: \nNumber of extra words = " + newWords.size());
            for (String s : newWords) {
                textArea.append("\n" + s + " = " + ScrabblePointGetter.points(s));
            }
        }
        
//        List<String> newWords = finder.findWithExtraLetter('a');        
//        textArea.append("\nIf you add an 'a' then: \nNumber of extra words = " + newWords.size());
//        for (String s : newWords) {
//            textArea.append("\n" + s + " = " + ScrabblePointGetter.points(s));
//        }
                
    }

    @Override
    public Character[][] getBoard() {
        return null;
    }
    
}
