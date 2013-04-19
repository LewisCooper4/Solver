/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WordSearch;

/**
 *
 * @author Lewis
 */
public class LexMain {
    
    public static void main(String[] args) {
        
        OneWordLexicon lex = new OneWordLexicon("oard");
        System.out.println(lex.isPrefix("wa"));
        
    }
    
}
