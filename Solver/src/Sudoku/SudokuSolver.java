/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sudoku;

import Controller.DataMap;
import Controller.GUIController;
import Controller.Solver;

/**
 *
 * @author Lewis
 */
public class SudokuSolver implements Solver {
    
    private DataMap map;
    private GUIController controller;

    public SudokuSolver(DataMap map, GUIController controller) {
        this.map = map;
        this.controller = controller;
    }
    
    @Override
    public void solve() {        
        controller.createBoard();
        SudokuSearcher solver = new SudokuSearcher();
        solver.solve(0, 0, (Integer[][]) controller.getBoard());
        controller.setBoard(solver.getBoard());
    }

    @Override
    public void hint() {}
    
}
