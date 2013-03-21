package WordSearch;

public class WordPath {
 
  private StringBuffer word;
  
  public WordPath() {
   
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
    
    String print = "";
    
    for(int i = 0; i < word.length(); i++) {
     
      char c = word.charAt(i);
      
      if(c == 'q') {
       
        print = print + "qu";

      }
      
      else {
       
        print = print + c;
        
      }
      
    }
   
    return print;
    
  }
  
}