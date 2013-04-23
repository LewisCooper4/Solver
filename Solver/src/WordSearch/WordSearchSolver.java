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
    
    private DataMap map;
    private GUIController controller;
    private String word;
    
    public WordSearchSolver(DataMap map, GUIController controller) {
        this.map = map;
        this.controller = controller;
        this.word = word;
    }

    @Override
    public void solve() {
        
        controller.createBoard();
        controller.setBoard(null);
        
    }

    @Override
    public void hint() {}
    
}
