/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Scrabble;

import Boggle.Lexicon;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Lewis
 */
public class ScrabbleSolver {
    
    private char[] letters;
    private Set<String> words;
    
    private static Lexicon lex;
    
    static {
        try {
            lex = new Lexicon("words.txt");
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
    }
    
    public ScrabbleSolver(char[] letters) {
        this.letters = letters;
        words = new HashSet<String>();
    }
    
    public void findWords() {
        
        for (char c : letters) {
            
        }
    }
    
    private void findHelper() {
        
    }
    
}
