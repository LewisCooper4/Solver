/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Scrabble;

import Boggle.Lexicon;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lewis
 */
public class ScrabbleWordFinder {
    
    private String letters;
    //private Set<String> words;
    private LinkedList<String> words;
    private String fileName;
    
    private static Lexicon lex;
   
    static {
        
        try {
            lex = new Lexicon("words.txt");
        } 
        catch (FileNotFoundException ex) {Logger.getLogger(ScrabbleController.class.getName()).log(Level.SEVERE, null, ex);}
        catch (IOException ex) {Logger.getLogger(ScrabbleController.class.getName()).log(Level.SEVERE, null, ex);}
    }
    
    public ScrabbleWordFinder(char[] characters, String fileName) {
        letters = "";
        for (char c : characters) {
            letters = letters + c;
        }
        //words = new HashSet<String>();
        words = new LinkedList<>();
        this.fileName = fileName;
        ScrabblePointGetter.createPointSystem(fileName);
    }
    
    public void findWords() {
        
        //START WITH EACH LETTER
        for (int i = 0; i < letters.length(); i++) {   
            ScrabbleWordPath path = new ScrabbleWordPath();
            String newLetters = deleteLetter(letters, letters.charAt(i));
            path.push(letters.charAt(i));
            findHelper(path, newLetters);
        }
    }
    
   
    
    private void findHelper(ScrabbleWordPath path, String letters) {
        
        //ADD WORD IF IT IS A WORD
        if (lex.isWord(path.getWord())) {
            if (!words.contains(path.getWord())) {
                words.add(path.getWord());
            }            
        }
        
        if (!lex.isPrefix(path.getWord())) {
            return;
        }
        
        for (int i = 0; i < letters.length(); i++) {
            String newLetters = deleteLetter(letters, letters.charAt(i));
            path.push(letters.charAt(i));
            findHelper(path, newLetters);
            path.pop();
        }
        
    }
    
     /*
     * This is used to get all the letters except one
     */
    private String deleteLetter(String letters, char ch) {
        int index = letters.indexOf(ch);
        String newLetters = letters.substring(0, index) + letters.substring(index + 1);        
        return newLetters;
    }
    
    
    
    public Iterable<String> getWords() {
                
        LinkedList<String> newWords = new LinkedList<>();
        for (String s : words) {
            newWords.add(s);
        }
        
        return sortWords(newWords);
        
    }
    
    public List<String> findWithExtraLetter(char let) {
        
        LinkedList<String> newWords = new LinkedList<>();
        String newLetters = letters + let;
        ScrabbleWordFinder finder = new ScrabbleWordFinder(newLetters.toCharArray(), fileName);
        finder.findWords();
        
        for (String s : finder.getWords()) {
            if (!words.contains(s)) {
                newWords.add(s);
            }
        }        
        
        LinkedList<String> sortedWords = new LinkedList<>();
        for (String s : newWords) {
            sortedWords.add(s);
        }
        
        return sortWords(sortedWords);
        
    }
    
    private List<String> sortWords(List<String> unorderedWords) {
        
        LinkedList<String> orderedWords = new LinkedList<>();
                
        Collections.sort(unorderedWords);
        int size = unorderedWords.size();
        
        while (orderedWords.size() < size) {
            String s = "";
            int index = 0;
            int max = 0;
            int wordsSize = unorderedWords.size();
            for (int i = 0; i < wordsSize; i++) {
                s = unorderedWords.get(i);
                int points = ScrabblePointGetter.points(s);
                if (points > max) {
                    max = points;
                    index = i;
                }
            }            
            orderedWords.add(unorderedWords.get(index));
            unorderedWords.remove(index);            
        }
        
        return orderedWords;
        
    }
    
    
    public int size() {
        return words.size();
    }
    
}
