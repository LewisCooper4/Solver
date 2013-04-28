/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WordSearch;

import Controller.DataMap;
import Controller.GUIController;
import Controller.Solver;

/**
 *
 * @author Lewis
 */
public class WordSearchSolver implements Solver {
    
    private GUIController controller;
    
    public WordSearchSolver(GUIController controller) {
        this.controller = controller;
    }

    @Override
    public void solve() {        
        controller.createBoard();
        controller.setBoard(null);        
    }

    @Override
    public void hint() {}
    
}
