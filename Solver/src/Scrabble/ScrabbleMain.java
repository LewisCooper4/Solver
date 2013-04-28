/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Scrabble;

import Boggle.Lexicon;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Lewis
 */
public class ScrabbleMain {
    
    public static void main (String[] args) throws FileNotFoundException, IOException {
        
        String letters = "xxeeabcdefgh";
        
        ScrabbleWordFinder s = new ScrabbleWordFinder(letters.toCharArray(), "Official Scrabble.txt");
        
        s.findWords();
            
        for (String word : s.getWords()) {
            System.out.println(word + " = " + ScrabblePointGetter.points(word));
        }        
        
    }
    
}
