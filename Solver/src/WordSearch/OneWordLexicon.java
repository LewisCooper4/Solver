/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WordSearch;
/**
 *
 * @author cooper
 */
public class OneWordLexicon  {
    
    String word;
    
    public OneWordLexicon(String word) {
        word = word.toLowerCase();
        this.word = word;
    }
    
    public boolean isPrefix(String pre) {
        
        pre = pre.toLowerCase();
        
        int length = word.length();
        
        if (pre.length() > length) {
            return false;
        }
        
        if (pre.equals(word.substring(0, pre.length()))) {
            return true;
        }
        else {
            return false;
        }
        
    }
    
    public boolean isWord(String w) {    
        
        w = w.toLowerCase();
        
        if (w.equals(word)) {
            return true;
        }
        else {
            return false;
        }
    }
    
}
