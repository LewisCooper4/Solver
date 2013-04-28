/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Boggle.BoggleSolver;
import Scrabble.ScrabbleSolver;
import Sudoku.SudokuSolver;
import WordSearch.WordSearchSolver;

/**
 *
 * @author Lewis
 */
public class SolverFactory {
    
    public static Solver getSolver(String solver, GUIController controller) {        
        
        if ("Boggle".equals(solver)) {
            return new BoggleSolver(controller);
        }
        else if ("Scrabble".equals(solver)) {
            return new ScrabbleSolver(controller);
        }
        else if ("Sudoku".equals(solver)) {
            return new SudokuSolver(controller);
        }
        else if ("Word Search".equals(solver)) {
            return new WordSearchSolver(controller);
        }
        
        System.out.println("We do not have that solver!!!!");
        return null;
    }
    
}
