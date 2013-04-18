/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Boggle.BoggleSolver;
import Sudoku.SudokuSolver;

/**
 *
 * @author Lewis
 */
public class SolverFactory {
    
    public static Solver getSolver(String solver, DataMap dataMap, GUIController controller) {
        
        if ("Sudoku".equals(solver)) {
            return new SudokuSolver(dataMap, controller);
        }
        else if ("Boggle".equals(solver)) {
            return new BoggleSolver(dataMap, controller);
        }
        
        return null;
    }
    
}
