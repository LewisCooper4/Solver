package Scrabble;

import Boggle.*;

public class ScrabbleWordPath {
 
  private StringBuffer word;
  
  public ScrabbleWordPath() {   
    word = new StringBuffer();    
  }
  
  public void push(char ch) {
    word = word.append(ch);    
  }
  
  public void pop() {
   
    if (word.length() == 0) {     
      throw new IllegalStateException("There is nothing left to pop stupid!!!");      
    }
        
    int end = word.length() -1;    
    word.deleteCharAt(end);
    
  }
  
  public String getWord() {
        
    String letters = word.toString();   
    return letters;
    
  }
  
}