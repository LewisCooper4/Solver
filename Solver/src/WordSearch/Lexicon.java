/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WordSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author cooper
 */
public class Lexicon  {
    
    ArrayList<String> words;
    
    
    
    public Lexicon(String filename) throws FileNotFoundException, IOException {
        
        words = new ArrayList<String>(500);
        
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        
        String word;
        
        while ((word = reader.readLine()) != null) {
            
            if (word.length() > 2){
                
                words.add(word);
     
            }
            
            
        }
        
    }
    
    public boolean isPrefix(String pre) {
        
        /*
        for(int i = 0; i < words.size(); i++) {
            
            if (words.get(i).startsWith(pre) == true) {
                
                return true;
            }
            
        }
        
            return false;
       
       * 
       */
        
        //BINARY SEARCH
        int size = pre.length();
        
        int low = 0;
        int high = words.size() - 1;
        
        while (low <= high) {
            
            int mid = (low + high) >> 1;
            
            String midVal = words.get(mid);
            
            if (midVal.length() > size) {
                
                midVal = midVal.substring(0, size);
                
            }

            int result = midVal.compareTo(pre);
            
            if (result < 0) {
                
                low = mid + 1;
                
            }
            
            else if (result > 0) {
                
                high = mid - 1;
                
            }
            
            else {
                
                return true;
            }
            
        }
        
        return false;
        
        
        /*
        int truth;
        
        truth = Collections.binarySearch(words, pre);
        
        if (truth > 0) {
            
            return true;
        }
        
        else {
            
            return false;
        }
        * 
        */
        
    }
    
    public boolean isWord(String w) {
        
        int truth;
        
        truth = Collections.binarySearch(words, w);
        
        if (truth >= 0) {
            
            return true;
        }
        
        else {
            
            return false;
        }
    }
    
}
