/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Boggle;

import edu.moravian.solver.Boggle;
import edu.moravian.solver.Solver;
import edu.moravian.solver.TextField;
import java.awt.Component;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Lewis
 */
public class BoggleSolver {

    private JPanel panel;
    
    public BoggleSolver(JPanel panel) {
        this.panel = panel;
    }
    
    public Iterable<String> solve() {

        Component[] components = panel.getComponents();
        
        
        char[][] letters = new char[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                letters[i][j] = components[i * 4 + j].getInputContext().toString().charAt(0);
                //System.out.println(components[i * 4 + j].getInputContext().toString().charAt(0));
                System.out.println((" " + (components[i * 4  + j ].getInputContext())).charAt(0));
            }
        }
        
        Board board = new Board(letters);
        
        Lexicon lex = null;
        try {
            lex = new Lexicon("words.txt");
        } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(Boggle.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (IOException ex) {
            Logger.getLogger(Boggle.class.getName()).log(Level.SEVERE, null, ex);
        }    
        
        Searcher s = new Searcher(board, lex);
        s.search();
        
        return s.getWords();
        //Words.setText("Number of words = " + s.getSize() + "\n");      
        
        //for (String word : s.getWords()) {
          //  Words.append(word + "\n");
        //}
        
    }

    public void hint() {
    }
    
}
