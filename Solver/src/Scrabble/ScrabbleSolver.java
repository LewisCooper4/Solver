/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Scrabble;

import Controller.DataMap;
import Controller.GUIController;
import Controller.Solver;

/**
 *
 * @author Lewis
 */
public class ScrabbleSolver implements Solver {
    
    private GUIController controller;
    
    public ScrabbleSolver(GUIController controller) {
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
