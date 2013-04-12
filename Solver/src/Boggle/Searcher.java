/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Boggle;

import java.util.Collections;
import java.util.LinkedList;
import java.util.HashSet;


/**
 *
 * @author cooper
 */
public class Searcher {
    
    Board board;
    Lexicon lex;
    
    HashSet<String> words;
    //LinkedList<String> words;
    
    public Searcher(Board b, Lexicon l) {
        
        board = b;
        lex = l;
        //words = new LinkedList<String>();
        words = new HashSet<String>();
        
    }
    
    public void search() {
        
        BoardMarks m;
        Location l;
        WordPath wp;
        
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                
                m = new BoardMarks();
                wp = new WordPath();
                l = new Location(i,j);
                
                searchHelper(m, l, wp);
                
            }
        }
        
        
        
        
    }
    
    private void searchHelper(BoardMarks m, Location l, WordPath wp) {
        
        m.mark(l);
        
        wp.push(board.getValue(l));
        
        //System.out.println(wp.getWord() + " " + lex.isPrefix(wp.getWord()));
        
        if (lex.isPrefix(wp.getWord()) == false) {

            return;
            
        }
        
        if (lex.isWord(wp.getWord())) {
            
//            int truth = Collections.binarySearch(words, wp.getWord());
//
//            if (truth < 0)  {
//                
//                words.add(wp.getWord());
//                
//            }
            
            words.add(wp.getWord());
            
            
            //if (words.contains(wp.getWord()) == false) {
                
              //  words.add(wp.getWord());
                
            //}
            
        }
        
        for (Location loc : m.getNeighbors(l)) {
            
            
            searchHelper(m, loc, wp);
            
            wp.pop();
  
            m.unmark(loc);
            
        }
        
        
        
        
        //something with getting the rest of the neighbors
        
    }
    
    public Iterable<String> getWords() {
        
       // Collections.sort(words);
        return words;
        
    }
    
    public int getSize() {
        
        return words.size();
        
    }
    
}
